package com.selenium.miniproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	public static void main(String[] args) throws InterruptedException, IOException {
		
    System.setProperty("webdriver.chrome.driver", 
    		"C:\\Users\\SHON ANTONEY\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
	signin.click();
	WebElement Email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	Email.sendKeys("shonantoney@gmail.com");
	WebElement createanaccount = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
	createanaccount.click();
	Thread.sleep(3000);
	TakesScreenshot ts = (TakesScreenshot)driver; 
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\SHON ANTONEY\\eclipse-workspace\\Selenium_Concept\\ScreenShot\\AccountCreatedAlready.png");
	FileUtils.copyFile(source, destination);
	Thread.sleep(5000);
	WebElement radio1 = driver.findElement(By.id("id_gender1"));
	radio1.click();
	System.out.println(radio1.isSelected());
	WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	firstname.sendKeys("Shon");
	WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	lastname.sendKeys("Antoney");
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("Shon@1416");
	WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
	Select s = new Select(days);
	s.selectByValue("14");
	WebElement months = driver.findElement(By.xpath("//select[@id='months']"));
	Select s1 = new Select(months);
	s1.selectByIndex(12);
	WebElement years = driver.findElement(By.xpath("//select[@id='years']"));
	Select s2 = new Select(years);
	s2.selectByValue("1992");
	driver.findElement(By.xpath("//input[@id='optin']")).click();
//	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Shon");
//	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Antoney");
	WebElement company = driver.findElement(By.xpath("//input[@name='company']"));
	company.sendKeys("Greens");
	driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("1st floor");
	driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Opp DLF");
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Chennai");
	WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
	Select s3 = new Select(state);
	s3.selectByIndex(11);
	driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("65202");
	driver.findElement(By.xpath("//textarea[@id='other']")).sendKeys("9043344471");
	driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9043344471");
	driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("9043344471");
	driver.findElement(By.xpath("//input[@id='alias']")).sendKeys(" No 31 Henry Villa");
	WebElement Register = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
	Register.click();
	Thread.sleep(3000);
	TakesScreenshot TS = (TakesScreenshot)driver; 
	File source1 = TS.getScreenshotAs(OutputType.FILE);
	File destination1 = new File("C:\\Users\\SHON ANTONEY\\eclipse-workspace\\Selenium_Concept\\ScreenShot\\PageCreated.png");
	FileUtils.copyFile(source1, destination1);		
		
		
		
		
		
		
	
		
	
		
	}
}
