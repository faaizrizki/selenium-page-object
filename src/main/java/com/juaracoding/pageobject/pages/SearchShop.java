package com.juaracoding.pageobject.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobject.drivers.DriverSingleton;

import net.bytebuddy.asm.Advice.This;

public class SearchShop{

	private WebDriver driver;
	
	public SearchShop() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@placeholder='Username']")
	private WebElement username;
	
	@FindBy (xpath = "//a[@class='noo-search']")
	private WebElement searchbtn;
	
	@FindBy (xpath = "//input[@name='s']")
	private WebElement typesearch;
	
	@FindBy (css =  ".add_to_wishlist.single_add_to_wishlist[href='?add_to_wishlist=1497&_wpnonce=3c64451f4b']")
	private WebElement wishlist1;
	
	@FindBy (css = ".add_to_wishlist.single_add_to_wishlist[href='?add_to_wishlist=1485&_wpnonce=3c64451f4b']")
	private WebElement wishlist2;
	
	
	
	public void search(String typesearch) {
		searchbtn.click();
		System.out.println("Klik search Done");
		this.typesearch.sendKeys(typesearch);
		this.typesearch.sendKeys(Keys.ENTER);
		System.out.println("Type search Done");
		wishlist1.click();
		wishlist2.click();
		System.out.println("Wishlist Done");
	}
		
		
		
//		this.username.sendKeys(username);
//		this.password.sendKeys(password);
//		btnLogin.click();
	
	
//	public String getAttributeRequired() {
//		return username.getAttribute("Required");
//	}
		
}

				
		
	
