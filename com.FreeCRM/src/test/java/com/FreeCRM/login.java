package com.FreeCRM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class login {

	public static void main(String[] args) throws InterruptedException {
FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(9000);
	WebElement sYear=driver.findElementByXPath("//*[@id='month']");
		
		Select s= new Select(sYear);
		
	List<WebElement> d=s.getOptions();
	System.out.println(d.size());
		
		s.selectByIndex(2);
		//s.selectByValue("2016");
		//s.selectByVisibleText("2017");
		
		

	}

}


