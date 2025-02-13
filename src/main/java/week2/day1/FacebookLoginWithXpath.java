package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginWithXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			
		//Open the URL
		driver.get("https://www.facebook.com/");
		
		//Maximize the Browser 
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("ravibcommba@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("May@22595");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
