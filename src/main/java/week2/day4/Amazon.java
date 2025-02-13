package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			
		//Open the URL
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"sac-suggestion-row-1-cell-1\"]/div[1]")).click();
		String numofResult = driver.findElement(By.xpath("//div[@class='sg-col-inner']//span")).getText();
		System.out.println(numofResult + "results for \"bags for boys");
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-navigation-item'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-navigation-item'])[4]")).click();
		driver.findElement(By.id("a-autoid-0")).click();
		driver.findElement(By.id("s-result-sort-select_4")).click();
		String pName = driver.findElement(By.xpath("//a[@class ='a-link-normal s-line-clamp-2 s-link-style a-text-normal']//span")).getText();
		System.out.println(pName);
		String pPrice = driver.findElement(By.xpath("//span[@class=\'a-price\']")).getText();
		System.out.println(pPrice);
		driver.close();
		
		
		
		
		
		
		
	
	
	
	}
		
	
	
	

}
