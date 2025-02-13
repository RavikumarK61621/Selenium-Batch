package week5.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LegalEntityStatusUpdate extends ProjectSpecificMethodLegalEntity{

	@Test
	public void EntityStatusUpdate() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		WebElement element = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
		element.click();
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		driver.findElement(By.xpath("//input[@name='country']")).sendKeys("india");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='--None--']")).click();
//		WebElement element2 = driver.findElement(By.xpath("//span[text()='--None--']"));
//		act.scrollToElement(element2).perform();
//		element.click();
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		Thread.sleep(3000);
		String errorMsg = driver.findElement(By.xpath("(//div[@class='slds-form-element__help'])[2]")).getText();
		if(errorMsg.contains("Complete this field.")) {
			System.out.println("Alert message has been Verfied");
		}
		else {
			System.out.println("Alert message has not Verfied");
		}
		
		
		//div[@class='slds-form-element__help chromexPathFinder1']
		
	}

}
