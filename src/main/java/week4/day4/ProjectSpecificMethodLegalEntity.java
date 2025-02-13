package week4.day4;

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
		
		@Parameters({"url", "password", "username"})
		
		@BeforeMethod
		public void preCondition(String url, String pword, String uname) throws InterruptedException{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("url");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys("uname");
			driver.findElement(By.id("password")).sendKeys("pword");
			driver.findElement(By.id("Login")).click();
			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
			WebElement element = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
			Thread.sleep(3000);
			Actions act = new Actions(driver);
			act.scrollToElement(element).perform();
			element.click();
			driver.findElement(By.xpath("//div[text()='New']")).click();
		}

		@AfterMethod
		public void postCondition() {
			driver.close();
		}
	}

