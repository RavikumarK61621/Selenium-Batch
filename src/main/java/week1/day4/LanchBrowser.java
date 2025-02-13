package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LanchBrowser {


		public static void main(String[] args) throws InterruptedException {
			
			//Open the Browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravikumar K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			
			//EdgeDriver driver= new EdgeDriver();
			//FirefoxDriver driver= new FirefoxDriver();
			
			//Open the URL
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			//Maximize the Browser 
			driver.manage().window().maximize();
			
			//Wait Time
			Thread.sleep(3000);
			
			//Close the Browser
			driver.close();
			
			}

	}



