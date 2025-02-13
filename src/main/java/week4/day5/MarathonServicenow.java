package week4.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.sukgu.Shadow;

public class MarathonServicenow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Launch ServiceNow application
		driver.get("https://dev186929.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Login with valid credentials username as admin and password 
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		//Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();

		//4. Click on  mobiles

        WebElement eleFrame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
        
        driver.switchTo().frame(eleFrame);
        
        WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]"));
        
        driver.executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		
//		WebElement element = shadow.findElementByXPath("//div[id='body_com.glideapp.servicecatalog.RenderCategory_0173703317098908']");
//		Actions act = new Actions(driver);
//		act.moveToElement(element).perform();
//		element.click();

		
	}

}
