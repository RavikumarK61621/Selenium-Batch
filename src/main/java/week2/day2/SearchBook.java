package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			
		//Open the URL
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String title = driver.getTitle();
		System.out.println("This is the tile of the page " + title);
		
		//Print the title
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Book",Keys.ENTER);
		String text = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Price of the book in String " + text);
		
		//Replace the comma
		String replace = text.replace(",", "");
				System.out.println("Replaced the comma with empty value " + replace);
		
		//Convert the string to int
		int int1 = Integer.parseInt(replace);
				System.out.println("Covert the Strint to Int " + int1);
			
		//Get the current URL
		String currentUrl = driver.getCurrentUrl();
				System.out.println("Print the curent URL " + currentUrl);
		
		driver.close();
		
	}

}
