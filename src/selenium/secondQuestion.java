package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.helpers.Util;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class secondQuestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhillon's\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver chrome = new ChromeDriver();
	        
	     chrome.get("https://www.google.com");
	     chrome.get("https://www.ag-grid.com/example/");
	     chrome.manage().window().maximize();
	  
	    Actions action = new Actions(chrome);
	     WebElement bankBalanceLabel = chrome.findElement(By.xpath("//span[text()='Bank Balance' and @ref='eText']"));
	     action.doubleClick(bankBalanceLabel).build().perform();
	     Thread.sleep(2000);
	
	     WebElement gridElement = chrome.findElement(By.cssSelector(".ag-root-wrapper-body"));
	        List<WebElement> balanceElements = gridElement.findElements(By.xpath("//div[@col-id='bankBalance' and @role='gridcell']"));
	        for (WebElement ele : balanceElements) {
	            String[] balanceValue = ele.getText().split("\\$");
	            String part2= balanceValue[1];
	            String numVal =part2.replace(",", "");
	            int bankbal=Integer.parseInt(numVal);
	            if(bankbal>100000)
	            {
	            	  System.out.println("Under if");
	            	  break;
	            }
	            else
	            {
	            	System.out.println("Under else");
	            }
	            
	        }
	     

	        
	     chrome.close();
	}

}
