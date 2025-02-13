package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingLearnig {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("leaf@2024");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_neutral navButton newWindow uiButton']")).click();

		// window handles
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("All Windows: " + allWindows);

		// Convert the set to list
		List<String> childW = new ArrayList<String>(allWindows);

		// Switch the window to child
		driver.switchTo().window(childW.get(1));
		driver.findElement(By.xpath("//button[@class = 'slds-button slds-button_brand']")).click();
		System.out.println("Child window Title: " + driver.getTitle());
		driver.close();

		// Switch the window to parent
		driver.switchTo().window(childW.get(0));
		System.out.println("Parent window Title: " + driver.getTitle());
		driver.close();

	}
}
