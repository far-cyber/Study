package com.selenium.test.maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\chrome\\chromedriver.exe"); 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://connect.maveric-systems.com");
			Thread.sleep(1000);
			WebElement element=driver.findElement(By.id("LoginForm_username"));
			element.sendKeys("farzanam");
				
		WebElement ele=driver.findElement(By.id("LoginForm_password"));
		ele.sendKeys("185269zzz@");
		WebElement el=driver.findElement(By.name("yt0"));
		el.click();
		//sy
		//india
		//in
		//in
		}
	
	}


