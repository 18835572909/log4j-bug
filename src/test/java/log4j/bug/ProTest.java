package log4j.bug;

import java.io.IOException;

/**
 * {desc}
 *
 * @author renhuibo
 * @date 2021/12/14 15:52
 */
public class ProTest {

  public static void main(String[] args) throws IOException {
    Process rt=Runtime.getRuntime().exec("calc");
    Process rt2=Runtime.getRuntime().exec("notepad");
  }

}
