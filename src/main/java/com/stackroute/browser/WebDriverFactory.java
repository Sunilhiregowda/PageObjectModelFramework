package com.stackroute.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {
	private static final String CHROME = "chrome";
	private static final String FIREFOX = "firefox";
	
	public WebDriverFactory() {
	}
	
	public static WebDriver getWebDriverInstance(String browserName) {
		WebDriver webDriver = null;
		
		if(CHROME.equalsIgnoreCase(browserName)) {
			WebDriverManager.chromedriver().setup();
			 webDriver=new ChromeDriver();
		} else if(FIREFOX.equalsIgnoreCase(browserName)) {
			WebDriverManager.firefoxdriver().setup();
			webDriver = new FirefoxDriver();
		}
		return webDriver;
	}
}
