package com.pom_Manager;

import org.openqa.selenium.WebDriver;

import com.pom.Category_Page;
import com.pom.Checkout1_Page;
import com.pom.Checkout2_Page;
import com.pom.Login_Page;
import com.pom.Select_Colour;
import com.pom.Select_Dress;

public class Page_Object_Manager {

	
	public static WebDriver driver;
	
	private Category_Page cp;
	
	private Select_Colour sc;
	
	private Select_Dress sd;
	
	private Checkout1_Page cp1;
	
	private Login_Page lp;
	
	public Login_Page getLp() {
		if(lp==null)
			lp=new Login_Page(driver);
		return lp;
	}

	public Checkout1_Page getCp1() {
		if(cp1==null)
			cp1=new Checkout1_Page(driver);
		return cp1;
	}

	public Checkout2_Page getCp2() {
		if(cp2==null)
			cp2=new Checkout2_Page(driver);
		return cp2;
	}

	private Checkout2_Page cp2;
	
	public Select_Dress getSd() {
		if(sd==null)
			sd=new Select_Dress(driver);
		return sd;
	}

	public Select_Colour getSc() {
		
		if(sc==null)
			sc=new Select_Colour(driver);
		return sc;
	}

	public Page_Object_Manager(WebDriver driver2) {

		driver=driver2;
	}
	
	public Category_Page getCp() {
		if(cp==null)
			cp=new Category_Page(driver);
		return cp;
	}
	
}
