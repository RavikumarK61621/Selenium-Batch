package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdavnceXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		https://login.salesforce.com/?locale=in
//			  username: dilip@testleaf.com
//			  password: leaf@2024
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			
		//Open the URL
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter the username- Parent to Child
		driver.findElement(By.xpath("//div[@id='username_container']/input")).sendKeys("dilip@testleaf.com");
		
		Thread.sleep(2000);
		//Enter the Password- Elder cousin to younger cousin:
		driver.findElement(By.xpath("(//input[@id='username']/following::input)[3]")).sendKeys("leaf@2024");
		
		//Enter the Password- Elder cousin to younger cousin:
		driver.findElement(By.xpath("(//label[@class='label']/following::input)[2]")).click();
		
		Thread.sleep(2000);
		//Close the browser:
		driver.close();
		
	}

}
