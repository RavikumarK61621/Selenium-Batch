package week4.day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahooTableElementLearning {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://finance.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement Mo = driver.findElement(By.xpath("//button[@class='_yb_mj7gki _yb_3pa68n _yb_3mrnri rapid-noclick-resp']/span"));
		Actions act = new Actions(driver);
		act.moveToElement(Mo).perform();
		driver.findElement(By.xpath("(//a[text()='Crypto '])[3]")).click();
		
		String text = driver.findElement(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr/td")).getText();
		System.out.println("Table First value: "+text);
		
		String text1 = driver.findElement(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr[2]/td[7]")).getText();
		System.out.println("Table 2nd row/7th column value: "+text1);
		
		List<WebElement> rowCount = driver.findElements(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr"));
		int size = rowCount.size();
		System.out.println(size);
	
		for (int i = 1; i <=size; i++) {
			String text2 = driver.findElement(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr["+i+"]/td[1]")).getText();
		System.out.println(text2);
		}
		
		
		List<WebElement> colCount = driver.findElements(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr[1]/td"));
		int sizecol = colCount.size();
		System.out.println(sizecol);
		
//		String text0 = driver.findElement(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr/td")).getText();
//		System.out.println("Table First value: "+text0);
//		
//		String text = driver.findElement(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr[1]/td[1]")).getText();
//		System.out.println("Table First value: "+text);
//		
//		String text1 = driver.findElement(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr[2]/td[7]")).getText();
//		System.out.println("Table 2nd row/7th column value: "+text1);
//		
//		List<WebElement> rowCount = driver.findElements(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr"));
//		int size = rowCount.size();
//		System.out.println(size);
//	
//		List<WebElement> colCount = driver.findElements(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr[1]/td"));
//		int sizecol = colCount.size();
//		System.out.println(sizecol);
//		
//		for (int i = 1; i <=size; i++) {
//				for (int j = 1; j <=sizecol; j++) {
//			String Table = driver.findElement(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr["+i+"]/td["+j+"]")).getText();
//				
//			System.out.println(Table);
//				}
//		}
//	
	}

}
