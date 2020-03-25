package org.virtual.selenium.newdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f()  {
	 	System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
	                chromeOptions.addArguments("--headless");
		                chromeOptions.addArguments("--no-sandbox");

			                WebDriver driver = new ChromeDriver(chromeOptions);

				                driver.get("https://google.com");

					                Thread.sleep(1000);

						                if (driver.getPageSource().contains("I'm Feeling Lucky")) {
								                        System.out.println("Pass");
										                } else {
												                        System.out.println("Fail");
														                }
							                driver.quit();	
  }
}
