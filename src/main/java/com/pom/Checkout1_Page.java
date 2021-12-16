package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout1_Page {

	public static WebDriver driver;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement check;

	public Checkout1_Page(WebDriver driver2) {

		driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getCheck() {
		return check;
	}
	
}
