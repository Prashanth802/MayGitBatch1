package com.businessscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
    @Test
	public static void testOne() throws InterruptedException
	{
      // System.setProperty("","");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rameshsoft.com");
		Thread.sleep(5000);
		driver.close();
		
	}

}
