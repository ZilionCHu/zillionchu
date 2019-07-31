package com.github.zilionchu.core.zillionchucore.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/3/28 09:59
 * @Description:
 */
public interface LoggerBase {


    /**
     * get Logger
     *
     * @return
     */
    default Logger getLogger() {
        return LoggerFactory.getLogger(this.getClass().getName());
    }

    /**
     * @param msg
     */
    default void info(String msg) {
        getLogger().info(msg);
    }

    /**
     * @param msg
     * @param obj
     */
    default void info(String msg, Object... obj) {
        getLogger().info(msg, obj);
    }

    /**
     * @param msg
     */
    default void error(String msg) {
        getLogger().info(msg);
    }

    /**
     * @param msg
     * @param obj
     */
    default void error(String msg, Object... obj) {
        getLogger().info(msg, obj);
    }


    /**
     * @param msg
     */
    default void debug(String msg) {
        getLogger().info(msg);
    }

    /**
     * @param msg
     * @param obj
     */
    default void debug(String msg, Object... obj) {
        getLogger().info(msg, obj);
    }

    /**
     * @param msg
     */
    default void warn(String msg) {
        getLogger().info(msg);
    }

    /**
     * @param msg
     * @param obj
     */
    default void warn(String msg, Object... obj) {
        getLogger().info(msg, obj);
    }

}
