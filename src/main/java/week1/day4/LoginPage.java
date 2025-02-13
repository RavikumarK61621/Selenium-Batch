package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			
		//Open the URL
		driver.get("https://www.facebook.com/");
		
		//Maximize the Browser 
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("ravibcommba@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("May@22595");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[@id=\"mount_0_0_sQ\"]/div/div/div[1]/div/div[2]/div[5]/div[1]/span/div/div[1]/div/svg/g/image")).click();
		driver.findElement(By.id("r2e")).click();
		driver.close();
		
	}

}