package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountActivation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			
		//Open the URL
		driver.get("https://www.telerik.com/contact");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(4000);
		
		//Product Type Selection
		WebElement productType = driver.findElement(By.id("Dropdown-1"));
		Select pT=  new Select(productType);
		pT.selectByIndex(5);
		
		
		//Product Interest Selection
		WebElement productInterest = driver.findElement(By.id("Dropdown-2"));
		Select pI=  new Select(productInterest);
		pI.selectByVisibleText("UI for WinForms");
		
		//Country Selection
		WebElement country = driver.findElement(By.id("Country-1"));
		Select c=  new Select(country);
		c.selectByValue("India");
		Thread.sleep(2000);
		
		//Close the Browser
		driver.close();
	}

}
