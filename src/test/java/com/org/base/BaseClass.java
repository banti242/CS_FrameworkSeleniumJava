package com.org.base;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import com.org.utilites.ProjectConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
   
	public static WebDriver driver;
	ProjectConfig projectConfig=new ProjectConfig();
	String url=projectConfig.getBaseUrl();
	String browser=projectConfig.getBrowser();
	
	@BeforeClass
	public void setUpbrowser() {
		
		switch(browser.toLowerCase()) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "msedge":
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		default:
			driver=null;
			break;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(url);
	}
}
