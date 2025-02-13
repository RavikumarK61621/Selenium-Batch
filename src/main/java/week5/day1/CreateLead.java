package week5.day1;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {
	
	@DataProvider(name = "TestData")
	public String [][] fetchData(){
		String[][] data = new String[3][3];
		data[0][0] = "TestLeaf";
		data[0][1] = "Test1";
		data[0][2] = "One";
		
		data[1][0] = "TestLeaf";
		data[1][1] = "Test2";
		data[1][2] = "Two";
		
		data[2][0] = "TestLeaf";
		data[2][1] = "Test3";
		data[2][2] = "Three";
		
		return data;
		
	}
	
	
	
	@Test(dataProvider = "TestData")
	public void CLead(String cname, String fname, String lname) {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();
		
	
}
}






