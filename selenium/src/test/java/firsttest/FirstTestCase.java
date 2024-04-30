package firsttest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
	
		
		//Launch browser
		
		//ChromeDriver driver = new ChromeDriver();
		  WebDriver driver = new ChromeDriver();  //recommended
		
		
	
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Validate title "Your Store"
		String act_title=driver.getTitle();
		
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}else {
			System.out.println("System Failed");
		}
		

		//Close Browser
		 
		driver.close();
		//driver.quit();
		
		
		
		
		
		
		
	}

}
