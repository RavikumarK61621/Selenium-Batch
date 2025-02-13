package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetLearling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			
		//Open the URL
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("shoes",Keys.ENTER);
		
		//Search for shoes
		List<WebElement> allPrice = driver.findElements(By.xpath("//span[@class=\"lfloat product-price\"]"));
		int listSize = allPrice.size();	
		System.out.println(listSize);
		
		//empty list
		List<Integer> getPrice=new ArrayList<Integer>();
		
		//Find Price of all the shoes
		for (WebElement i : allPrice) {
			String Prc = i.getText();
			
			//System.out.println(Prc);
		String replaceAll = Prc.replaceAll("Rs. ", "").replaceAll(",", "");
		//System.out.println(replaceAll);
		
		int parseInt = Integer.parseInt(replaceAll);
		System.out.println(parseInt);
		
		//add price inside list
		getPrice.add(parseInt);
		
		}
		System.out.println("List Value : "+getPrice);	
		
		Set<Integer> unq=new TreeSet<Integer>(getPrice);
		int setSize = unq.size();
		System.out.println(setSize);
		System.out.println(unq);

		if(listSize==setSize) {
			System.out.println("No duplicate prices");
		}else {
			System.out.println("duplicate prices is there");
		}

		//Print the first value in the list
		List<Integer> list =new ArrayList<Integer>(unq);
		System.out.println("Print First value :" +list.get(0));
		
		driver.close();
		
	}
	
}

		

