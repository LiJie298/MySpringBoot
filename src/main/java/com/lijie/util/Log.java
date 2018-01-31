package com.lijie.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author lijie7
 * @date 2018/1/31
 * @Description
 * @modified By
 */
public class Log {
    private static Logger infoLog = LogManager.getLogger("info");
    private static Logger errorLog = LogManager.getLogger("error");

    public static void info(String mes){
        infoLog.info(mes);
    }
    private static void error(String title,String mes){
        errorLog.error(title+" | cause : "+mes);
    }
}
