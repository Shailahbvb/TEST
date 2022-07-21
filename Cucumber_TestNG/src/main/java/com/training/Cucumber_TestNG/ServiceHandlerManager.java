package com.training.Cucumber_TestNG;

import org.openqa.selenium.WebElement;

import com.training.Interfaces.ServiceHandler;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ServiceHandlerManager implements ServiceHandler{

	
	@Given("Launch the chrome browser using WebDriver and wedriver manager")
	public void launchBrowser() {
		
		
	}

	@Given("Launch the salesforceports using {string}")
	public void laucnchSalesForceURL(String url) {
		System.out.println("url: " +url);
		
	}

	public void waitExplicitly(int iSeconds, WebElement ele) {
		
		
	}
	
	@When("login to the portal using username {string} and password {string} and submit")
	public void loginToSalesForcePortal(String username,String password) {
		System.out.println("username: " +username +"password:"+password);
	}
	
	@Then("Logout from the Salesforces")
	public void LogOut() {
		
		
	}


}
