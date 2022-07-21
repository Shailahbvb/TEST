package com.training.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ServiceHandler {
	
	public static WebDriver webdriver = null;
	
	public void launchBrowser();
	
	public void laucnchSalesForceURL(String url) ;
	
	public  void waitExplicitly(int iSeconds, WebElement ele);
	
	public void loginToSalesForcePortal(String username,String password);
	
	public void LogOut();
}
