package firsttest;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webdrivers {

	public static void main(String[] args) throws InterruptedException {
		
		
		 WebDriver driver = new ChromeDriver();
		
		//get()
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				Thread.sleep(5000);
				
				//getTitle()
				System.out.println(driver.getTitle());
				
				//get current url
				System.out.println(driver.getCurrentUrl());
				
				//get page source
				System.out.println(driver.getPageSource());
				
				//getWindowHandle()
				String windowid=driver.getWindowHandle();
				System.out.println("Window ID"+windowid);
				
				
				//getWindowHandles()
				driver.findElement(By.linkText("OrangeHRM, Inc")).click();
			    Set<String>windowids=driver.getWindowHandles();
				System.out.println("Window IDS"+windowids);
				
				driver.get("https://demo.nopcommerce.com/register");
				driver.manage().window().maximize();
				
				//isDisplayed()
				WebElement logo=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
				System.out.println("Display status of logo:"+logo.isDisplayed());
			   
				//isEnabled()
				boolean status = driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).isEnabled();
				System.out.println(status);
				
				//isSelected()
				WebElement male_rd=driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
				WebElement female_rd=driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
				
				male_rd.click();
				System.out.println(male_rd.isSelected());
				
				
				//Thread.sleep()
				
				 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				 Thread.sleep(5000);
				 driver.findElement(By.linkText("OrangeHRM, Inc")).click();
				 
				 Thread.sleep(5000);
				 driver.close();
				 //driver.quit();
				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
				
				
				
				
				//Implicit 
				        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
						driver.manage().window().maximize();
						
						driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
				 
				    driver.close();
				
				//Explicit
				
		         WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		         
		         
				 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  driver.manage().window().maximize();
					
			WebElement txtUsername= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
				txtUsername.sendKeys("Admin");
				
				
				WebElement txtPassword= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		txtPassword.sendKeys("admin123");
			 
				WebElement loginbtn=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
			loginbtn.click(); 
				
			    
				//Fluent wait
				
				Wait<WebDriver> mywait1 = new FluentWait<WebDriver>(driver)
						.withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(5))
						.ignoring(NoSuchElementException.class);
				
				
			 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				 driver.manage().window().maximize();
				
				 
		   		 WebElement txtUsername1 = mywait.until(new Function<WebDriver,WebElement>(){
					 public WebElement apply(WebDriver driver) {
						 return driver.findElement(By.xpath("//input[@placeholder='Username']"));
					 }
				 });
				txtUsername1.sendKeys("Admin");
				
				
				

	}

}
