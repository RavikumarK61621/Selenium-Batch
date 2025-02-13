package week7day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	public static ChromeDriver driver;
	
	public ChromeOptions options;
 	@Parameters({"url", "password", "username"})
 	
	@BeforeMethod
	public void preCondition(String url, String pword, String uname){
 		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pword);
		driver.findElement(By.id("Login")).click();
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
