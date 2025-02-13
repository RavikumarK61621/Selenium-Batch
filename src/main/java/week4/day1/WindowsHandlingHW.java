package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingHW {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//table[@name='ComboBox_partyIdFrom']/following-sibling::a")).click();
		
		//Window handle
		Set<String> Child1 = driver.getWindowHandles();
		
		//Convert to list
		List<String> windowPass = new ArrayList<String>(Child1);
		
		//Switch the window
		driver.switchTo().window(windowPass.get(1));
		
		//select the element in child window
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

		//Switch back to parent window
		driver.switchTo().window(windowPass.get(0));
		
		driver.findElement(By.xpath("//table[@name='ComboBox_partyIdTo']/following-sibling::a")).click();
		
		//Window handle
		Set<String> Child2 = driver.getWindowHandles();

		//Convert to list
		List<String> windowPass1 = new ArrayList<String>(Child2);
		
		//Switch the window
		driver.switchTo().window(windowPass1.get(1));
		
		//select the element in child window
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		
		//Switch back to parent window
		driver.switchTo().window(windowPass1.get(0));
		
		//Click on Merge button
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		//Handle alert
		driver.switchTo().alert().accept();
				
		//Get the title of the page
		String title = driver.getTitle();
		
		if(title.equals("View Contact | opentaps CRM")) {
			System.out.println("The title has matched");
		}else {
				System.out.println("The title has not matched");
			}
		driver.close();
		}	
	}
