package com.juaracoding.pageobject.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.pages.LoginPage;
import com.juaracoding.pageobject.pages.RegisterPage;

public class MainApp {

	public static void main(String[] args) throws InterruptedException {
		
		DriverSingleton.getInstance("Chrome");
		WebDriver driver = DriverSingleton.getDriver();
		String url = "https://shop.demoqa.com/";
		driver.get(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		RegisterPage registerPage = new RegisterPage();
		LoginPage loginPage = new LoginPage();
		
		js.executeScript("window.scrollBy(0,500)");
		registerPage.register("faaizrizki06", "faiz.rizki6@gmail.com", "Faaizrizki03");
		delay(3);
		js.executeScript("window.scrollBy(0,500)");
		delay(3);
		loginPage.login("faaizrizki05", "Faaizrizki03");
		js.executeScript("window.scrollBy(0,300)");
		
//		REGISTER LANGSUNG LOGIN
//		loginPage.registandlogin("ademaulana15","ade.maulana15@gmail.com","Ademaulanayusuf13","ademaulana15","Ademaulanayusuf13");
//		js.executeScript("window.scrollBy(0,300)");
		
		
		delay(3);
		driver.quit();
		
	}
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
