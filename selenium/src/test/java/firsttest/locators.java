package firsttest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://demo.opencart.com/");

		        
		 //name locator
				driver.findElement(By.name("search")).sendKeys("Mac");
				
				//id
				boolean logoDisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
				System.out.println(logoDisplaystatus);
				
				
				//linktext & partialLinkText
				driver.findElement(By.linkText("Tablets")).click();
				driver.findElement(By.partialLinkText("Tab")).click();  //not recommended
				
			//classname
				List<WebElement>headerLinks=driver.findElements(By.className("list-inline-item"));
				System.out.println("Total number of header links: "+headerLinks.size());
				
				
				
			//tagname
				List<WebElement>links=driver.findElements(By.tagName("a"));
				System.out.println("total number of links:"+links.size());
				
				
				List<WebElement>images=driver.findElements(By.tagName("img"));
				System.out.println("total number of images:"+images.size());
				
				
				
				//Open URL https://demo.opencart.com/
				driver.get("https://demo.nopcommerce.com/");
				driver.manage().window().maximize();
						
				//CSS Locator(tag#id)
				driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
				driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
				
				//CSS Locator(tag.class)
				driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");
				
				
				//tag attribute  tag[attribute='value']
				driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
				
				  driver.get("https://demo.opencart.com/");
				  driver.manage().window().maximize();
				
				//Xpath with single attribute
				  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-shirt");
				
				
			    //Xpath with multiple attributes
				  driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-shirts");
				
				//xpath with end operator
				   driver.findElement(By.xpath("//input[@name='search'and @placeholder='Search']")).sendKeys("T-shirts");
				
				//xpath with end operator
				    driver.findElement(By.xpath("//input[@name='search'or @placeholder='Search']")).sendKeys("T-shirts");
						
				
				//xpath  with text() -inner text
		            driver.findElement(By.xpath("//*[text()='MacBook']")).click();		
				
				
				  boolean displaystatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
				  System.out.println(displaystatus);
				
				//xpath with contains()
				//Search
				  driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("T-shirts");
				
				//xpath with start-with()
				  driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("T-shirts");
				
				  //chained xpath
				boolean status = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
				System.out.println(status);

	}

}
