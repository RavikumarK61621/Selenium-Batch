package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountForDropown {

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
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Test Account2");
		driver.findElement(By.className("inputBox")).sendKeys("Selenium Automation Tester2");
		
		// select the Industry
		WebElement Industry = driver.findElement(By.xpath("//select[@name=\"industryEnumId\"]"));
		Select Ind = new Select(Industry);
		Ind.selectByVisibleText("Computer Software");
		
		// select the ownerShip
		WebElement ownerShip = driver.findElement(By.xpath("(//select[@class=\"inputBox\"])[3]"));
		Select own = new Select(ownerShip);
		own.selectByVisibleText("S-Corporation");
		
		// select the Source
		Thread.sleep(3000);
		WebElement Source = driver.findElement(By.xpath("(//select[@id= \"dataSourceId\"])"));
		Select Sou = new Select(Source);
		Sou.selectByValue("LEAD_EMPLOYEE");
		
		// select the marketing Campaign
		WebElement marketingCampaign = driver.findElement(By.xpath("//select[@id= \"marketingCampaignId\"]"));
		Select mc = new Select(marketingCampaign);
		mc.selectByIndex(5);
		
		// select the State
		WebElement State = driver.findElement(By.xpath("//select[@id=\"generalStateProvinceGeoId\"]"));
		Select St = new Select(State);
		St.selectByValue("TX");
		
		// Click on Create Account button
		driver.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();
		String aName = driver.findElement(By.xpath("(//span[@class= \"tabletext\"])[3]")).getText();
		
	
		if (aName.contains("Account2")) {
			System.out.println("Account name is displayed correctly");
		}
		else 
			System.out.println("Account name is not correctly displayed");
		 Thread.sleep(3000);
		driver.close();
	}

}
