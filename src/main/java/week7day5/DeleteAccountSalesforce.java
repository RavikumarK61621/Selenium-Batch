package week7day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DeleteAccountSalesforce extends ProjectSpecificMethod{
	
	@Test
	public void DeletAccount() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@class=\"slds-button slds-context-bar__button slds-icon-waffle_container slds-show\"]")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
		WebElement accountsTab = driver.findElement(By.xpath("//a[@title='Accounts']"));
		driver.executeScript("arguments[0].click()",accountsTab);
		driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys("Andrew"+ Keys.ENTER);
		Thread.sleep(2000);
		String noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
		String[] s = noOfItems.split(" ");
		int countBeforeDelete = Integer.parseInt(s[0]);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table/tbody/tr/td[6]")).click();
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		driver.findElement(By.xpath("//button[@title='Delete']")).click();
		Thread.sleep(2000);
		noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
		s = noOfItems.split(" ");
		int countAfterDelete = Integer.parseInt(s[0]);


		Assert.assertTrue(countBeforeDelete==(countAfterDelete+1),"Verify the account has deleted");


		}



}
