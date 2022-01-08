package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
WebDriver driver;
public DashboardPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

}
