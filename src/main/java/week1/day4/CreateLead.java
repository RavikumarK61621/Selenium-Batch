package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			
		//Open the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the Browser 
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Account");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Maths");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Leaf");
		driver.findElement(By.name("submitButton")).click();
		String pageTitle = driver.getTitle();
		String actualTitle = "Create Lead | opentaps CRM";
		if (pageTitle==actualTitle);
		 System.out.println("Title is displayed correctly");
		 Thread.sleep(3000);
		driver.close();
		}

}
