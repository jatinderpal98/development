package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class interviewTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhillon's\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver chrome = new ChromeDriver();
	        
	     chrome.get("https://www.google.com");
	     chrome.get("https://fast.com");
	     Thread.sleep(8500);
	     String speed= chrome.findElement(By.xpath("//div[@id='speed-value']")).getText();
	     int speedValue=Integer.parseInt(speed);
	     System.out.println(speed);
	     if(speedValue>20)
	     {
	    	 System.out.println("Test Passed! Speed is greater than 20: " + speed);
	        
	     } 
	     else
	     {
	            System.out.println("Test Failed! Speed is not greater than 20: " + speed);
	     }
	    	 
	    	 
	     
	}

}
