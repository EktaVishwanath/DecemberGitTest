package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) throws Exception {
		
		//Set Property
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\December2021-Selenium\\1st_Selenium\\drivers\\chromedriver.exe");
		//Object create of WebDriver
	    WebDriver driver = new ChromeDriver();   // object variable
		//go to web site
		driver.get("https://us.amazon.com/b?node=17867753011	");
		//Maximize browser
		driver.manage().window().maximize();
		//stop execution
		Thread.sleep(3000);
		//close browser
		driver.close();
		
	}

}
