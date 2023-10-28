package com.stackroute.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
	private WebDriver webDriver = null;
	

	@FindBy (xpath= "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")
	private WebElement dresses;
	
	@FindBy (xpath= "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")
	private WebElement tshirt;
	@FindBy (xpath= "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")
	private WebElement women;
	@FindBy (id= "search_query_top")
	private WebElement search;
	@FindBy (id= "newsletter-input")
	private WebElement mystore;
	@FindBy (xpath= "/html/body/div/div[3]/footer/div/section[3]/ul/li[3]/a")
	private WebElement bestsales;
	@FindBy (xpath= "/html/body/div/div[3]/footer/div/section[3]/ul/li[4]/a")
	private WebElement stores;
	@FindBy (xpath= "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
	private WebElement signup;
	@FindBy (id= "email_create")
	private WebElement email_create;
	@FindBy (id= "email")
	private WebElement email;
	@FindBy (id= "passwd")
	private WebElement password;
	@FindBy (xpath= "/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[1]/ol/li")
	private WebElement invalidemail;
	@FindBy (xpath= "/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")
	private WebElement error;
	@FindBy (xpath= "/html/body/div/div[2]/div/div[3]/div/ul/li/a/span")
	private WebElement ele1;
	@FindBy (xpath= "/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")
	private WebElement ele2;
	@FindBy (xpath= "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")
	private WebElement signupButton;
	

	
	
	
	
	
	public Page() {
	}


	
	
	public Page(WebDriver webDriver) {
		this.webDriver = webDriver;
	
		PageFactory.initElements(webDriver, this);
	}
	

	public String getTitle() {
		return webDriver.getTitle();
	}
	
	public void dresses() {
		this.dresses.click();
	}
	public void tshirt() {
		this.tshirt.click();
	}
	public void women() {
		this.women.click();
	}
	public void search(String key) {
		this.search.sendKeys(key,Keys.ENTER);
	}
	public void mystore(String key) {
		this.mystore.sendKeys(key,Keys.ENTER);
	}
	public void bestsales() {
		this.bestsales.click();
	}
	public void stores() {
		this.stores.click();
	}
	public void signup() {
		this.signup.click();
	}
	public void signupButton() {
		this.signupButton.click();
	}
	public void ele1() {
		this.ele1.click();
	}
	public void ele2() {
		this.ele2.click();
	}
	public String errors() {
		return this.error.getText();
	}
	public String invalidemail() {
		return this.invalidemail.getText();
	}
	public void email_create(String key) {
		this.email_create.sendKeys(key,Keys.ENTER);
	}
	public void email(String key) {
		this.email.sendKeys(key,Keys.ENTER);
	}
	public void password(String key) {
		this.password.sendKeys(key,Keys.ENTER);
	}
	
	public void maximizeBrowser() {
		webDriver.manage().window().maximize();
	}
	public void refresh() {
		webDriver.navigate().refresh();
	}
	public void navigate() {
		webDriver.navigate().back();
	}
	public Timeouts time() {
		return webDriver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
	}
	public void close() {
		webDriver.close();
	}
	
	

	
	
	
}
