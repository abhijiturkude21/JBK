package com.pages;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddUsersPage {
WebDriver driver;

@Test
public void openBrowser() {
	System.setProperty("webdriver.chhrome.driver","chromedriver.exe" );
	driver.get("file:///C:/Selenium/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html");
	
}

}

