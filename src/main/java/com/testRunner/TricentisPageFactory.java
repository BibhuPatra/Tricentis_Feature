package com.testRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;



public class TricentisPageFactory {
	WebDriver driver;
	@FindBy(id="Email")
	@CacheLookup
	WebElement email;
	

	@FindBy(id="Password")
	@CacheLookup
	WebElement pass;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	@CacheLookup
	WebElement LoginButton;
	
	WebElement mainMenu = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a"));
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")
//	Actions actions = new Actions(driver);
//	actions.moveToElement(mainMenu);
	@CacheLookup
	WebElement hoverComputer;
	
	public TricentisPageFactory(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public WebElement fieldUname(){
		return email;
	}

	public void setUname(String uname)
	{
		this.email.sendKeys(uname);
	}

	public WebElement fieldPassword(){
		return email;
	}

	public void setPassword(String pass)
	{
		this.pass.sendKeys(pass);
	}
	public void clickLogin()
	{
	this.LoginButton.click();
	}
//	public void hoverComputer()
//	{
//		this.hoverComputer.
//	}

}
