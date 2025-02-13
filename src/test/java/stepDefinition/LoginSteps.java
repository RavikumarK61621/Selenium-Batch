package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends ProjectSpecificMethod{


	
	   @When("User should enter the username as {string}")
	    public void user_should_enter_the_username(String Uname) {
	        driver.findElement(By.id("username")).sendKeys(Uname);
	    }

	    @When("User should enter the password as {string}")
	    public void user_should_enter_the_password(String Pword) {
	        driver.findElement(By.id("password")).sendKeys(Pword);
	    }
	
	@When("User should click on the submit button")
	public void user_should_click_on_the_submit_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("user should be login successfully")
	public void user_should_be_login_successfully() {
		String title = driver.getTitle();
		if(title.contains("Testleaf")) {
			System.out.println("Success");
		}
		else {
			System.out.println("Not Success");
		}

	}

	@Then("user should not be login successfully")
	public void user_should_not_be_login_successfully() {
		String title = driver.getTitle();
		if(title.contains("Leaftaps")) {
			System.out.println("Login is notSuccess");
		}
		else {
			System.out.println("Login is Success");
		}
	}	
}
