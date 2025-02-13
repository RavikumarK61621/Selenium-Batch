package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			
		//Open the URL
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Click on Create new account
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
		//Update the Sign-up form
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("NewAccount");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Test01");
		
		//Select day
		WebElement day = driver.findElement(By.id("day"));
		Select D = new Select(day);
		D.selectByIndex(0);
		
		//Select month
		WebElement month = driver.findElement(By.id("month"));
		Select M = new Select(month);
		M.selectByValue("1");
		
		//Select year
		WebElement year = driver.findElement(By.id("year"));
		Select Y = new Select(year);
		Y.selectByVisibleText("2001");
		
		driver.findElement(By.xpath("(//label[@class=\"_58mt\"])[2]")).click();
		driver.findElement(By.xpath("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[5]")).sendKeys("NewaccountTest012345678@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Password@123");
		//driver.findElement(By.id("u_0_n_U6")).click();
		
		
	}

}
