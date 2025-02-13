package week7day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountSalesforce extends ProjectSpecificMethod {

	@Test
	public void CreateAccount() {
		
		driver.findElement(By.xpath("//button[@class=\"slds-button slds-context-bar__button slds-icon-waffle_container slds-show\"]")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
		
		WebElement Account = driver.findElement(By.xpath("//span[text()='Accounts']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Account); 
		js.executeScript("arguments[0].click();", Account);
		
		driver.findElement(By.xpath("//a[@title='New']")).click();
		String accountName = "Andrew";
		driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(accountName);
		WebElement ownershipDD = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
		driver.executeScript("arguments[0].click()", ownershipDD);
		driver.findElement(By.xpath("//span[text()='Public']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String toastMessage = driver
				.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"))
				.getText();
		System.out.println(toastMessage);
		Assert.assertTrue(toastMessage.contains(accountName), "Verify the Account name");
	}

}
