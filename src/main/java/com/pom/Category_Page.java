package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Category_Page {
public static WebDriver driver;
public Category_Page(WebDriver driver2) {
	driver=driver2;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="(//a[text()='Dresses'])[2]")
private WebElement dress;

@FindBy(xpath="(//a[text()='Evening Dresses'])[2]")
private WebElement eve;

public WebElement getDress() {
	return dress;
}
public WebElement getEve() {
	return eve;
}

}
