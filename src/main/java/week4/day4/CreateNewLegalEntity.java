package week4.day4;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CreateNewLegalEntity extends ProjectSpecificMethodLegalEntity {

	@Test
	public void NewLegalEntity() throws InterruptedException {
	
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Salesforce Automation by Jack2");
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		Thread.sleep(3000);
//		String name = driver.findElement(By.xpath("//lightning-formatted-text[text()='Salesforce Automation by Jack2']")).getText();
		String name = driver.findElement(By.xpath("//span[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11']/slot/lightning-formatted-text")).getText();
		System.out.println(name);
		assertEquals(name, "Salesforce Automation by Jack2");
		
	}

}
