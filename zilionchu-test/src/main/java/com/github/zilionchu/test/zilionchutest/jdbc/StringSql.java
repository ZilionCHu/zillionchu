package com.github.zilionchu.test.zilionchutest.jdbc;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-07-10 14:09
 * @Description:
 */
public class StringSql {

    public static final String sql = "SELECT\n" +
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
            "                 WHERE item.CURRENTSTATE = 12 AND item.ASSISTANT = '1687'\n" +
            "                 GROUP BY ROOTPROCINSTID\n" +
            "                 UNION\n" +
            "                 SELECT ROOTPROCINSTID AS MANID\n" +
            "                 FROM WFWORKITEM item\n" +
            "                   INNER JOIN BPS_WORKFLOW flow ON flow.PROCESSINST_ID = item.ROOTPROCINSTID\n" +
            "                 WHERE item.CURRENTSTATE = 12 AND flow.USER_ID = '1687'\n" +
            "                 GROUP BY item.ROOTPROCINSTID\n" +
            "               ) T2\n" +
            "      ON T2.MANID = A.PROCESSINSTID\n" +
            "    INNER JOIN BPS_WORKFLOW B\n" +
            "      ON A.PROCESSINSTID = B.PROCESSINST_ID\n" +
            ") where 1=1 ";
}
