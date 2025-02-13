package week6.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day1.PSM;


public class EditLead extends ProjectSpecificMethod{
	
		@DataProvider(name = "xdata")
		public String[][] fetchData() throws IOException{
	
			return ExcelReadinDataProvider.readExcel();
			
		}
	
	
	@Test(dataProvider = "xdata")
	public void ELead(String phno, String cName) throws InterruptedException {
		
	
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement update =driver.findElement(By.id("updateLeadForm_companyName"));
                update.clear();
                update.sendKeys(cName);
		driver.findElement(By.name("submitButton")).click();
}
}






