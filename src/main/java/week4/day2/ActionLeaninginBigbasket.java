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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionLeaninginBigbasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			
		//Open the URL
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[text()='Shop by'])[2]")).click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement firstHover = driver.findElement(By.xpath("//a[@class='CategoryTree___StyledLink-sc-8wbym9-0 wWSyB']"));
		act.moveToElement(firstHover).perform();
		WebElement secondHover = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		act.moveToElement(secondHover).perform();
		driver.findElement(By.xpath("//a[text()='Rice & Rice Products']")).click();
		driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
		
		Thread.sleep(3000);
		WebElement searchBox = driver.findElement(By.xpath("(//input[@class='flex-1 min-w-0 leading-md lg:text-sm xl:text-md placeholder-silverSurfer-700'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", searchBox); 
		js.executeScript("arguments[0].click();", searchBox);
//		act.moveToElement(searchBox);
		searchBox.sendKeys("bb royal", Keys.ENTER);
		driver.findElement(By.id("i-BBRoyal")).click();
		Thread.sleep(3000);
		WebElement Product = driver.findElement(By.xpath("(//div[@class='break-words h-10 w-full']/h3)[5]"));
		js.executeScript("arguments[0].scrollIntoView(true);", Product); 
		js.executeScript("arguments[0].click();", Product);
			
		
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> childWindow = new ArrayList<String>(windowHandle);
		driver.switchTo().window(childWindow.get(1));
		Thread.sleep(3000);
		
		WebElement findRice = driver.findElement(By.xpath("(//span[@class='Label-sc-15v1nk5-0 PackSizeSelector___StyledLabel2-sc-l9rhbt-2 gJxZPQ hDJUsF'])[6]"));
		js.executeScript("arguments[0].scrollIntoView(true);", findRice); 
		js.executeScript("arguments[0].click();", findRice);
		String price4FiveKG = driver.findElement(By.xpath("//td[@class='Description___StyledTd-sc-82a36a-4 fLZywG']")).getText();
		driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
		driver.findElement(By.xpath("//p[@class='mx-4 flex-1']")).getText();
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File dec = new File("./SnapShot/image2.png");
		FileUtils.copyFile(screenshotAs, dec);
		
		driver.close();
		driver.quit();
			
	}

}
