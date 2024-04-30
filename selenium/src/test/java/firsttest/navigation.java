package firsttest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();  //recommended
		
		//Navigation
		
			 driver.navigate().to("https://demo.nopcommerce.com/");
			
			 URL myurl=new URL("https://demo.nopcommerce.com/");
			 driver.navigate().to(myurl);
			
			driver.navigate().to("https://demo.nopcommerce.com/");
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
			driver.navigate().back();
			System.out.println(driver.getCurrentUrl());
			
			driver.navigate().forward();
			System.out.println(driver.getCurrentUrl());
			
			driver.navigate().refresh();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
			
			Set<String> windowsIDs = driver.getWindowHandles();
			
			List<String> windowList=new ArrayList(windowsIDs);
			
			String parentID=windowList.get(0);
			String childID=windowList.get(1);
			
			
			driver.switchTo().window(childID);
			System.out.println(driver.getTitle());
			
			driver.switchTo().window(parentID);
			System.out.println(driver.getTitle());
			

	}

}
