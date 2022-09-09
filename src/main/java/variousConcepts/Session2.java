package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session2 {
	WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void locator() {
		driver.findElement(By.name("firstname")).sendKeys("Selenium");	
		driver.findElement(By.id("sex-0")).click();
		
		//upload file
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\Vijaya\\Desktop\\youtube and tarot\\New folder (2)");
		//if not input tag then we need to use Robot Class
		
		//link text
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		
		//to go back. in automation we dont go back.
		//driver.navigate().back();
		
		//partial link text
		//driver.findElement(By.partialLinkText("Backend")).click();
		
		//css selector a)TagName#value
		driver.findElement(By.cssSelector("input#exp-2")).click();
		//TagName[attribute='value']
		driver.findElement(By.cssSelector("input[id='profession-1']")).click();
		//multiple attributes
		driver.findElement(By.cssSelector("input[name='tool'][value='Selenium IDE']")).click();
		
		//XPath...A) absolute
		//driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("Pattern");
		//XPath B) relative
		driver.findElement(By.xpath("//input[@name ='lastname']")).sendKeys("Pattern");
		driver.findElement(By.xpath("//input[@name= 'exp' and@value ='5']")).click();
		driver.findElement(By.xpath("//strong[ contains(text(),'Link Test : New Page')]")).click();
		driver.findElement(By.xpath("//strong[text()= 'Link Test : Page Change']")).click();
		
		
		
	}
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
