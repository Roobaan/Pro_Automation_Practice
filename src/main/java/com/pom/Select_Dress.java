package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Dress {

	public static WebDriver driver;

	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement quantity;
	
	@FindBy(id="group_1")
	private WebElement size;
	
	@FindBy(id="add_to_cart")
	private WebElement add;

	public WebElement getAdd() {
		return add;
	}

	public Select_Dress(WebDriver driver2) {

	driver=driver2;
	PageFactory.initElements(driver2, this);
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}
	
}