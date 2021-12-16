package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Colour {
	public static WebDriver driver;

	public Select_Colour(WebDriver driver2) {

		driver = driver2;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "color_43")
	private WebElement colour;

	public WebElement getColour() {
		return colour;
	}

}
