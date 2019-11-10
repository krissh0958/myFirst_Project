package Demo_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoClass {
	
	WebDriver driver=null;

	public void browser_Initialize() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe"); 
	}
	public void browser_launch() {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
	}
	public void browser_close() {
		driver.close();
	}

}
