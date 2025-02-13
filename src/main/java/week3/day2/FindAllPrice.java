package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class FindAllPrice {

		public static void main(String[] args) {
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://amazon.in/");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone",Keys.ENTER);
			
			List<WebElement> allPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	int listSize = allPrice.size();
	System.out.println(listSize);

	//empty list
	List<Integer> getPrice=new ArrayList<Integer>();

	for (WebElement i : allPrice) {
		String text = i.getText();
		
		String replaceAll = text.replaceAll("[,]", "");
		//System.out.println(replaceAll);

	int parseInt = Integer.parseInt(replaceAll);
	System.out.println(parseInt);

	//add price inside list
	getPrice.add(parseInt);
		
	}

	System.out.println("List Value : "+getPrice);

	//set -we dn't have Collections.sort() -> use TreeSet
	//list into set
	Set<Integer> unq=new TreeSet<Integer>(getPrice);
	int setSize = unq.size();
	System.out.println(setSize);

	System.out.println(unq);

	if(listSize==setSize) {
		System.out.println("No duplicate prices");
	}else {
		System.out.println("duplicate prices is there");
	}

		}

	}
