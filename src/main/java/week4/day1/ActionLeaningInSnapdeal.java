package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionLeaningInSnapdeal {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement menFas = driver.findElement(By.className("catText"));
		Actions act = new Actions(driver);
		act.moveToElement(menFas).perform();
		driver.findElement(By.className("linkTest")).click();
//		WebElement count = driver.findElement(By.xpath("//div[@class='category-name-wrapper clearfix ']/span"));
//		System.out.println(count);
		WebElement shoeCountElement = driver.findElement(By.className("category-name"));
        String shoeCountText = shoeCountElement.getText();
        System.out.println("Total Sports Shoes Count: " + shoeCountText);
        
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		WebElement fromVal = driver.findElement(By.name("fromVal"));
		fromVal.clear();
		fromVal.sendKeys("500");
		WebElement toVal = driver.findElement(By.name("toVal"));
		toVal.clear();
		toVal.sendKeys("700");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='sdCheckbox filters-list ']/label")).click();
		Thread.sleep(3000);
		WebElement selectShoe = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		act.moveToElement(selectShoe).perform();
		driver.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  ']")).click();
		Thread.sleep(3000);
        WebElement cost = driver.findElement(By.className("payBlkBig"));
        System.out.println("Cost: " + cost.getText());
        WebElement discount = driver.findElement(By.className("percent-desc"));
        System.out.println("Discount: " + discount.getText());

		
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./SnapShot/image01.png");
		FileUtils.copyFile(screenShot, des);
		
		driver.close();
		driver.quit();
				
	}

}
