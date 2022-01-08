package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInPage {

	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("file:///C:/Selenium/Selenium%20Softwares/Offline%20Website/index.html");
}
	@AfterMethod
	public void tearDown() {
		driver.close();
		
}
	@Test
	public void heading() {
		String actheading=driver.findElement(By.xpath("//b")).getText();
		String expheading="Java By Kiran";
		Assert.assertEquals(actheading,expheading );
	}
	@Test
	public void verifyLogo1() {
		Boolean image=driver.findElement(By.tagName("img")).isDisplayed();
		Assert.assertTrue(image);
		
		
	}
	public void verifyLogo() {
		//WebElement Image=driver.findElement(By.tagName("img"));
		WebElement Image=driver.findElement(By.xpath("//img"));
		Assert.assertTrue(Image.isDisplayed());
	}
	
	@Test
	public void emailAttribute() {
	WebElement email	=driver.findElement(By.id("email"));
	String act=email.getAttribute("Placeholder");
	
	String exp="Email";
	Assert.assertEquals(act, exp);
	}
	@Test
	public void registerLink() {
	String act=driver.findElement(By.xpath("/html/body/div/div[2]/a)")).getText();
	String exp="Register a new membership";
	Assert.assertEquals(act, exp);
	
			
	}
	@Test
	public void verifyErrorPasswordMsg() {
	String  actcolor=driver.findElement(By.xpath("//div[@id='password_error']")).getAttribute("style");
	String expcolor="color: red;";
	//System.out.println(color);
	Assert.assertEquals(actcolor, expcolor);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}