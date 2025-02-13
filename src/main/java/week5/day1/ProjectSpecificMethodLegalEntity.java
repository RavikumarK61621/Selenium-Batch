package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethodLegalEntity {

		ChromeDriver driver;
		
		@Parameters({"username", "password", "url"})
		
		@BeforeMethod
		public void preCondition(String uname,String pword,String url) throws InterruptedException{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys(uname);
			driver.findElement(By.id("password")).sendKeys(pword);
			driver.findElement(By.id("Login")).click();
			
		}

		@AfterMethod
		public void postCondition() {
			driver.close();
		}
	}

