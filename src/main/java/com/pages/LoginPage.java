package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.ObjectRepository.LoginObjectRepository;
import com.utility.Excelutils;

public class LoginPage extends LoginObjectRepository{
WebDriver driver;
	
/*	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button")
	WebElement loginBtn;
	
	@FindBy(tagName="img")
	WebElement logo;
	
	@FindBy(tagName="b")
	WebElement lable;*/
	

public LoginPage( WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public void loginTest(String uname,String pass) {
	
	username.sendKeys("kiran@gmail.com");
	password.sendKeys("123456");
	loginBtn.click();
	
}
@Test
public boolean verifyLogo() {
	return logo.isDisplayed();
	
	
}
@Test
public String verifyLable() {
	return lable.getText();
	
	
}
@Test
public boolean currentPageTitle() {
	String act=driver.getTitle();
	String exp=Excelutils.getDataFromCell(System.getProperty("user.dir")+"/src/test/resources/logging.xls", "Login", 2, 2);
	if (act.equals(exp)) {
		System.out.println("title is matched");
		return true;
	}
	else {
		System.out.println("title is not matched");
		return false;
	}
	
	}
	
	
}







