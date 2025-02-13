package week5.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod{

	public RemoteWebDriver driver;
	
	@Parameters({"url", "username", "password", "browser"})
	
	
	@BeforeMethod
	public void preCondition(String url, String user, String pword, String browserval){
		
		if(browserval.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserval.equals("edge")) {
			driver = new EdgeDriver();
		}
		
//		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pword);
		driver.findElement(By.className("decorativeSubmit")).click();	
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
