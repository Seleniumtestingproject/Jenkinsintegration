package pck1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	
	public void test1(){
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\chromedriver.exe");
		 driver= new ChromeDriver();
		 		driver.get("https://www.guru99.com/maven-tutorial.html");
	}

}
