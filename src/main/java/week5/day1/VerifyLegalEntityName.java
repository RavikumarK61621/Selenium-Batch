package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class VerifyLegalEntityName extends PSM{
		
		@DataProvider(name = "xdata")
		public String[][] fetchData(){
			String[][] data=new String[3][1];
			data[0][0] = "Salesforce Automation by Sow";
			data[1][0] = "Salesforce Automation by Sat";
			data[2][0] = "Salesforce Automation by Man";
			
			return data;
			
		}
	
	
	
	@Test(dataProvider = "xdata")
	public void EntityName(String Sname) throws InterruptedException {
	
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	WebElement element = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
	Thread.sleep(3000);
	Actions act = new Actions(driver);
	act.scrollToElement(element).perform();
	element.click();
	driver.findElement(By.xpath("//div[text()='New']")).click();
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(Sname);
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	String text = driver.findElement(By.xpath("//span[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11']/slot/lightning-formatted-text")).getText();
	System.out.println("Print the Text :"+text);
	Assert.assertEquals(Sname, text);
	}
}