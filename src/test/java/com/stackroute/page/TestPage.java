package com.stackroute.page;

import java.io.FileReader;


import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.stackroute.browser.WebDriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPage{
	
	private static WebDriver webDriver = null;
	private static Page page = null;
	
	@BeforeClass
	public static void setup() throws IOException {
		Properties properties = new Properties();
		
		FileReader file = new FileReader("src/test/resources/application.properties");
		properties.load(file);
		String browserName = properties.getProperty("browser.name");
		webDriver = WebDriverFactory.getWebDriverInstance(browserName);
	//	WebDriverManager.chromedriver().setup();
	//	 webDriver=new ChromeDriver();
		String webPage = properties.getProperty("site.url");
		webDriver.navigate().to(webPage);
		
		
		page = new Page(webDriver);
		page.maximizeBrowser();
		
	}
	
	
	@AfterClass
	public static void windUp() {
		page.close();
	}
	
	@Test
	   public void test01() {
	  	String expectedtitle = "My Store";
	  	String actualtitle= page.getTitle();
	  	Assert.assertEquals("automation page is not available", expectedtitle, actualtitle);
	  }


	  @Test
	  public void test02() {
	  	
	
	  	
	  	page.dresses();
	  	page.time();
	  	String expectedtitle = "Dresses - My Store";
	  	String actualtitle= page.getTitle();
	  	Assert.assertEquals("dresses store is not available", expectedtitle, actualtitle);
	  	page.navigate();
	  	}
	  @Test
	  public void test03() {
	  	
	  	page.tshirt();
	  	page.time();
	  	String expectedtitle = "T-shirts - My Store";
	  	String actualtitle= page.getTitle();
	  	Assert.assertEquals("T-shirts page is not availble", expectedtitle, actualtitle);
	  	page.navigate();
	  }

	  @Test
	  public void test04() {
	  	
	  
	  	page.women();
	  	page.time();
	  	String expectedtitle = "Women - My Store";
	  	String actualtitle= page.getTitle();
	  	Assert.assertEquals("women store is not avilable", expectedtitle, actualtitle);
	  	page.navigate();
	  }
	  @Test
	  public void test05() {
	  	
	  	page.search("partyware");
	  	page.time();
	  	String expectedtitle = "Search - My Store";
	  	String actualtitle= page.getTitle();
	  	Assert.assertEquals(" party ware is not avilable", expectedtitle, actualtitle);
	  	page.navigate();
	  }
	  @Test
	  public void test06() {
	  	
		  page.mystore("302khasimvali@gmail.com");
	  	String expectedtitle = "My Store";
	  	String actualtitle= page.getTitle();
	  	Assert.assertEquals(" mystore is not avilable", expectedtitle, actualtitle);
	  	page.navigate();
	  }
	  @Test
	  public void test07() {
	  	
	  	
	  page.bestsales();
	  page.time();
	  	String expectedtitle = "Best sales - My Store";
	  	String actualtitle= page.getTitle();
	  	Assert.assertEquals(" Best sellers page  is not avilable", expectedtitle, actualtitle);
	  	page.navigate();
	  }
	  @Test
	  public void test08() {
		  webDriver.get("http://automationpractice.com/index.php");
		  page.time();
	    page.stores();
	   // webDriver.findElement(By.xpath("/html/body/div/div[3]/footer/div/section[3]/ul/li[4]/a")).click();

	  	String expectedtitle = "Stores - My Store";
	  	String actualtitle= page.getTitle();
	  	Assert.assertEquals(" stores page  is not avilable", expectedtitle, actualtitle);
	  	page.navigate();
	  }


  @Test
public void test09() {
 	
	  webDriver.get("http://automationpractice.com/index.php");
	page.signup();
	page.time();
	page.email_create("");
 	String expectedtitle = "Invalid email address.";
 	String actualtitle= page.invalidemail();
 	Assert.assertEquals(" login my store is not avilable", expectedtitle, actualtitle);
 	
 }	  

@Test
public void test10() {

	
	 webDriver.get("http://automationpractice.com/index.php");
		page.signup();
		page.time();
	page.email("302khasimvali@gmail.com");
	page.password("");
    page.signupButton();
String expectedtitle = "Password is required.";
String actualtitle= page.errors();
Assert.assertEquals(" login my store is not avilable", expectedtitle, actualtitle);

}
@Test
public void test11() {

	 webDriver.get("http://automationpractice.com/index.php");
		page.signup();
		page.time();
	page.email("302khasimvali@gmail.com");
	page.password("XYZ");
    page.signupButton();   	
String expectedtitle = "Invalid password.";
String actualtitle= page.errors();
Assert.assertEquals(" login my store is not avilable", expectedtitle, actualtitle);

}

@Test
public void test12() {
	 webDriver.get("http://automationpractice.com/index.php");
		page.signup();
		page.time();
	page.email("");
	page.password("XYZ");
    page.signupButton(); 
String expectedtitle = "An email address required.";
String actualtitle= page.errors();
Assert.assertEquals(" login my store is not avilable", expectedtitle, actualtitle);

}
@Test
public void test13() {

	 webDriver.get("http://automationpractice.com/index.php");
		page.signup();
		page.time();
	page.email("302khasimvali@gmail.com");
	page.password("Khasimvali@9381");
page.ele1();
page.ele2();
String expectedtitle = "My Store";
String actualtitle= page.getTitle();
Assert.assertEquals("  my store is not avilable", expectedtitle, actualtitle);
}

	  
	  
	
}