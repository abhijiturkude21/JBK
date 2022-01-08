package com.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DashboardPage {

	WebDriver driver;
	@BeforeClass
	public void openDashboard() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("file:///C:/Selenium/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html");
	}
/*	@AfterClass
	public void tearDown() {
		driver.close();
		
	}*/
	@Test
	public void verifyCoursesName() {
		ArrayList<String> actCourses=new ArrayList<>();
		List<WebElement> courses=driver.findElements(By.xpath("//h3"));
		
		for (WebElement course : courses) {
     String courseName = course.getText();
     actCourses.add(courseName);
    
		}
		ArrayList<String> expCourses=new ArrayList<>();
		expCourses.add("Selenium");
		expCourses.add("Java / J2EE");
		expCourses.add("Python");
		expCourses.add("Php");
		
		Assert.assertEquals(actCourses,expCourses );
			
	}
	@Test
	public void verifySideHeaderName() {
		
		ArrayList<String> actHeader=new ArrayList<>();
		List<WebElement> headers=driver.findElements(By.xpath("//ul/li/a/span"));
		
		for (WebElement header : headers) {
			String headerName=header.getText();
			actHeader.add(headerName);	
			}
		ArrayList<String> expHeader=new ArrayList<>();
		
		expHeader.add("Dashboard");
		expHeader.add("Users");
		expHeader.add("Operators");
		expHeader.add("Useful Links");
		expHeader.add("Downloads");
		expHeader.add("Logout");
		
		Assert.assertEquals(actHeader, expHeader);
	}
	@Test
	public void verifyMoreInfolink() {
		
		boolean flag=false;
		 String mainWindow =driver.getWindowHandle();
		List<WebElement> links=driver.findElements(By.xpath("//a[text()='More info ']"));
		for (WebElement link : links) {
			
			link.click();
			flag=true;
			
			
		}//for loop close
	Set<String> window =	driver.getWindowHandles();
	for (String win : window) {
		if (!win.equals(mainWindow)) {
			driver.switchTo().window(win);
			driver.close();
		
	}
	
	}
	}
		@Test
		public void verifyAllLinks() {
			List<WebElement> linked=driver.findElements(By.tagName("//a"));
			Iterator<WebElement> it=linked.iterator();
		}
	
		
		
		
		
		
		
	}
	

