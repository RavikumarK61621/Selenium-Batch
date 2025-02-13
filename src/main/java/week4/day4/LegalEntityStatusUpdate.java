package week4.day4;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LegalEntityStatusUpdate extends ProjectSpecificMethodLegalEntity{

	@Test
	public void EntityStatusUpdate() {
		
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
//		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
//		String errorMsg = driver.findElement(By.xpath("//div[@class='slds-form-element__help']/span")).getText();
		String errorMsg = driver.findElement(By.xpath("//div[@class='slds-form-element__help' and contains(text(),'Complete this field.')]")).getText();
		if(errorMsg.contains("Complete this field.")) {
			System.out.println("Alert message has been Verfied");
		}
		
		
		//div[@class='slds-form-element__help chromexPathFinder1']
		
	}

}
