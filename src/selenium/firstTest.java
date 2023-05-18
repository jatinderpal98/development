package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhillon's\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver chrome = new ChromeDriver();
	        
	     chrome.get("https://www.google.com");
	     

	}

}
