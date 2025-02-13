package week4.day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MarathonTatacliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//MouseHover on 'Brands'
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		WebElement Brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions act = new Actions(driver);
		act.moveToElement(Brands).perform();
	
		//MouseHover on 'Watches & Accessories'
		WebElement wa = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		act.moveToElement(wa).perform();
			
		//Choose the first option from the 'Featured brands
		driver.findElement(By.xpath("//div[@class='DesktopHeader__brandsDetails']")).click();
		
		//Select sortby: New Arrivals
		driver.findElement(By.className("SelectBoxDesktop__hideSelect")).click();
		driver.findElement(By.xpath("//option[text()='New Arrivals']")).click();
		
		//choose men from catagories filter.
		driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilName']")).click();
		Thread.sleep(3000);
		
		//print all price of watches
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		
		//To get the all prices of the watches
		for (int i = 0; i < prices.size(); i++) {
			System.out.println(prices.get(i).getText());
		}
		
		//Get the first product price
		String fPrice = driver.findElement(By.xpath("//div[@class='ProductDescription__priceHolder']/h3")).getText();
		System.out.println("First Product Price :" +fPrice);
		
		//click on the first resulting watch.
		driver.findElement(By.xpath("//div[@class='ProductModule__dummyDiv']")).click();
		
		//Switch window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> childWindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(childWindow.get(1));
		
		//Get the product price child window
		String price2Window = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText();
		System.out.println(price2Window);
		
		//compare two price are similar
		if(fPrice==price2Window) {
			System.out.println("Prices are matched");
		}	else  {
				System.out.println("Prices are not matched");
						
		}
		
		//click Add to cart and get count from the cart icon.
		WebElement addCart = driver.findElement(By.xpath("//span[text()='ADD TO BAG']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", addCart); 
		js.executeScript("arguments[0].click();", addCart);
		String AddCart = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println(AddCart);
		
		//Click on the cart
		driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).click();
		
		//Take a snap of the resulting page.
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./SnapShot/image3.png");
		FileUtils.copyFile(screenShot, des);
		
		//Close All the opened windows one by one.
		driver.quit();	
		
	}

}
