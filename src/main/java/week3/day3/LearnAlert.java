package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			
		//Open the URL
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Prompt Alert
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		
		Alert al = driver.switchTo().alert();
		
		Thread.sleep(2000);
		al.sendKeys("Your Name");
		
		Thread.sleep(2000);
		al.dismiss();
		
		Thread.sleep(2000);
		String text = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text);
		
		driver.close();

	}

}
