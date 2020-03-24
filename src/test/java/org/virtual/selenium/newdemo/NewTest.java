package org.virtual.selenium.newdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f()  {
	 
	  	WebDriver driver=new ChromeDriver();
	  	
		 
			driver.get("http://kushala.org/workspace/virtual-university/");
			driver.manage().window().maximize();
			 
			
			
			WebElement name = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/input[1]"));
			WebElement email = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/input[2]"));
			WebElement subject = driver.findElement(By.xpath("//input[@placeholder='Subject']"));			
			WebElement contact = driver.findElement(By.xpath("//input[@placeholder='Contact']"));
			WebElement message = driver.findElement(By.xpath("//textarea[@placeholder='Enter your Message here']"));
			
			
			
//		    WebElement submit = driver.findElement(By.xpath("//textarea[@placeholder='Enter your Message here']"));
			
			name.sendKeys("simon");
			email.sendKeys("abc@gmail.com");
			subject.sendKeys("nothing");
			contact.sendKeys("12345");
			message.sendKeys("hello there");
//			submit.click();
			
  }
}
