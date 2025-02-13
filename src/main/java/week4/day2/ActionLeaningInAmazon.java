package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionLeaningInAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
		String fPrice = driver.findElement(By.className("a-price-whole")).getText();
		System.out.println(fPrice);
		String cusReview = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println(cusReview);
		driver.findElement(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']")).click();

		// Window handle
		Set<String> pWinod = driver.getWindowHandles();
		List<String> Winod = new ArrayList<String>(pWinod);
		driver.switchTo().window(Winod.get(1));

		// Snapshot
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./SnapShot/ima.png");
		FileUtils.copyFile(screenShot, des);

		// Add cart
		WebElement addCartButton = driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
//		Actions act = new Actions(driver);
//		act.scrollToElement(addCartButton).perform();
//		addCartButton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", addCartButton); 
		js.executeScript("arguments[0].click();", addCartButton);
//        js.executeScript("arguments[0].scrollIntoView(true);", addCartButton);
//        addCartButton.click();
		String subTotal = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		System.out.println(subTotal);

		Thread.sleep(3000);
		if (fPrice == subTotal) {
			System.out.println("The price of the product is matched");
		} else {
			System.out.println("The price of the product is not matched");
		}
		driver.quit();
	}

}
