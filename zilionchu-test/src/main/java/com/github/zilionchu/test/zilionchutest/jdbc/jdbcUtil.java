package com.github.zilionchu.test.zilionchutest.jdbc;

import org.apache.commons.lang3.StringUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-07-10 11:29
 * @Description:
 */
public class jdbcUtil {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/imooc?useUnicode=true&amp;characterEncoding=utf-8";
    private static final String DB2 = "jdbc:db2://10.7.101.123:50000/foticdb7";

    //    private static final String u = "root";
//    private static final String p = "root";
    private static final String u = "db2inst1";
    private static final String p = "fotic123";


    public static String getSqlWhere(WorkItemExt vo, SysUser sysUser) {
        StringBuffer wheresql = new StringBuffer();
        if (vo.getProjectId() != null) {
            wheresql.append(" AND PROJECTID = '" + vo.getProjectId() + "'");
        }
        if (vo.getAmount() != null) {
            wheresql.append(" AND AMOUNT = '" + vo.getAmount() + "'");
        }
        if (StringUtils.isNotBlank(vo.getSummary())) {
            wheresql.append(" AND MEMO like '%" + vo.getAmount() + "%'");
        }
        if (StringUtils.isNotBlank(vo.getStatusName())) {
            wheresql.append("AND CURRENTSTATE '" + vo.getStatusName());
        }
        if (StringUtils.isNotBlank(vo.getSortColumn())) {
            wheresql.append("ORDER BY " + vo.getSortColumn());
        } else {
            wheresql.append("ORDER BY CREATETIME DESC");
        }

        return wheresql.toString();
    }


    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            conn = DriverManager.getConnection(DB2, u, p);
            WorkItemExt vo = new WorkItemExt();
            SysUser sysUser = new SysUser();
            //sysUser.setID(1687L);
            sysUser.setID(5848L);
            String url = getSql(String.valueOf(sysUser.getID())) + getSqlWhere(vo, sysUser);
            //psmt.setString(1, "1687");
            psmt = conn.prepareStatement(url);
            rs = psmt.executeQuery();
            List taskViewPOList = new ArrayList();

            while (rs.next()) {
                TaskViewPO viewPO = new TaskViewPO();
                viewPO.setID(rs.getLong(12));//序号
                viewPO.setBizName(rs.getString(7));//业务名称
                viewPO.setUserName(rs.getString(2));//提交人
                viewPO.setProjectName(rs.getString(6));//项目名称
                viewPO.setMemo(rs.getString(9) == null ? "" : rs.getString(9).equals("null") ? "" : rs.getString(9));
                viewPO.setAmount(rs.getBigDecimal(8) == null ? null : rs.getBigDecimal(8).doubleValue());
                viewPO.setCurrentState(rs.getString(3));//流程状态
                viewPO.setDblx(rs.getString(11));//流程类型：1：BPS，2：软通
                viewPO.setProcessInstID(rs.getLong(4));//流程实例ID
                //System.out.println(viewPO.toString());
                taskViewPOList.add(viewPO);


            }

            System.out.println(taskViewPOList.size());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                psmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getSql(String userID) {
        String sql = new String("SELECT\n" +
                "  USERID,\n" +
                "  USERNAME,\n" +
                "  CURRENTSTATE,\n" +
                "  PROCESSINSTID,\n" +
                "  BUSINESSID,\n" +
                "  PROJECTNAME,\n" +
                "  BUSINESSNAME,\n" +
                "  AMOUNT,\n" +
                "  MEMO,\n" +
                "  PROJECTID,\n" +
                "  LCLX,\n" +
                "  ROW_NUMBER()\n" +
                "  OVER () AS ROWNUM,\n" +
                "  CREATETIME\n" +
                "FROM (\n" +
                "  SELECT\n" +
                "    B.USER_ID       AS USERID,\n" +
                "    B.USER_NAME     AS USERNAME,\n" +
                "    CASE WHEN A.EXTEND3 = '1'\n" +
                "      THEN '审批中'\n" +
                "    WHEN A.EXTEND3 = '2'\n" +
                "      THEN '审批拒绝'\n" +
                "    WHEN A.EXTEND3 = '3'\n" +
                "      THEN '审批通过'\n" +
                "    WHEN A.EXTEND3 = '4'\n" +
                "      THEN '用印撤回'\n" +
                "    END\n" +
                "                    AS CURRENTSTATE,\n" +
                "    A.PROCESSINSTID AS PROCESSINSTID,\n" +
                "    B.BUSINESS_ID   AS BUSINESSID,\n" +
                "    B.PROJECT_NAME  AS PROJECTNAME,\n" +
                "    B.BUSINESS_NAME AS BUSINESSNAME,\n" +
                "    B.AMOUNT        AS AMOUNT,\n" +
                "    B.MEMO          AS MEMO,\n" +
                "    B.PROJECT_ID    AS PROJECTID,\n" +
                "    '1'             AS LCLX,\n" +
                "    A.CREATETIME    AS CREATETIME\n" +
                "  FROM WFPROCESSINST A\n" +
                "    INNER JOIN (\n" +
                "                 SELECT ROOTPROCINSTID AS MANID\n" +
                "                 FROM WFWORKITEM item\n" +
                "                 WHERE item.CURRENTSTATE = 12 AND item.ASSISTANT = '" + userID + "'\n" +
                "                 GROUP BY ROOTPROCINSTID\n" +
                "                 UNION\n" +
                "                 SELECT ROOTPROCINSTID AS MANID\n" +
                "                 FROM WFWORKITEM item\n" +
                "                   INNER JOIN BPS_WORKFLOW flow ON flow.PROCESSINST_ID = item.ROOTPROCINSTID\n" +
                "                 WHERE item.CURRENTSTATE = 12 AND flow.USER_ID = '" + userID + "'\n" +
                "                 GROUP BY item.ROOTPROCINSTID\n" +
                "               ) T2\n" +
                "      ON T2.MANID = A.PROCESSINSTID\n" +
                "    INNER JOIN BPS_WORKFLOW B\n" +
                "      ON A.PROCESSINSTID = B.PROCESSINST_ID\n" +
                ") where 1=1 "
        );

        System.out.println(sql);
        System.out.println("=================================================================================");
        return sql;
    }
}