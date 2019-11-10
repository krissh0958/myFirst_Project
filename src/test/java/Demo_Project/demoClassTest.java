package Demo_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class demoClassTest {
	 demoClass demo = new demoClass();
 
  @BeforeTest
  public void Navigate_Test() {
	  demo.browser_Initialize();
  }
  @Test
  public void lanch_browser() {
	 demo.browser_launch();
  }

  @AfterTest
  public void close_Test() {
	  demo.browser_close();
  }

}
