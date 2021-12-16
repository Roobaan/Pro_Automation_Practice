package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public static WebDriver driver;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement pass;
	
	@FindBy(id="SubmitLogin")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

	public Login_Page(WebDriver driver2) {

		driver=driver2;
		PageFactory.initElements(driver2, this);
			
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}
}
