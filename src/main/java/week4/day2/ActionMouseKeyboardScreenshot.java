package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ActionMouseKeyboardScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement mousehover = driver.findElement(By.xpath("//span[@class='catText']"));
		
		//Mouse hover to the element
		Actions ac = new Actions(driver);
		ac.moveToElement(mousehover).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Shirts']")).click();
		
		//Mouse hover to the element for shirt
		WebElement MouseHovShirt = driver.findElement(By.xpath("//img[@class='product-image ']"));
		ac.moveToElement(MouseHovShirt).perform();
		driver.findElement(By.xpath("//div[contains(@class, 'center quick-view-bar  btn btn-theme-secondary')]")).click();
		
		//Snapshot
		Thread.sleep(3000);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./SnapShot/aimage1.png");
		FileUtils.copyFile(screenshotAs, des);
		
		//close the browser.
		driver.close();
		
		}
}
