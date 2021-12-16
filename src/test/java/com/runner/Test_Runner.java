package com.runner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.base_Class.Base_Class;
import com.pom_Manager.Page_Object_Manager;

public class Test_Runner extends Base_Class	{
	
	public static WebDriver driver=browserLaunch("chrome");
	
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	
	public static Logger log=Logger.getLogger(Test_Runner.class);
	
	public static void main(String[] args) throws Throwable {

		PropertyConfigurator.configure("log4j.properties");
		
		log.info("Browser launched");
		
		url("http://automationpractice.com/index.php?controller=my-account");
		
		log.info("url launched");
		
		mouseActions("move",pom.getCp().getDress());
		
		log.info("action performed");
			
		clickOnElement(pom.getCp().getEve());
		
		log.info("Dress selected");
		
		scrollElementView(pom.getSc().getColour());
		
		//mouseActions("leftclick", pom.getSc().getColour());
		clickOnElement(pom.getSc().getColour());
		//sleep(4000);
		
		log.info("Colour selected");
		
		waitt();
		
		for (int i = 0; i < 4; i++) {
			clickOnElement(pom.getSd().getQuantity());
		}
		
		log.info("Quantity selected");
		
		scrollElementView(pom.getSd().getSize());
				
		select("value", pom.getSd().getSize(),"3");
		
		log.info("Size selected");

		clickOnElement(pom.getSd().getAdd());
		
		sleep(4000);

		Screenshot("automation");
		
		clickOnElement(pom.getCp1().getCheck());
		
		clickOnElement(pom.getCp2().getCheck());
		
		String particularData = particularData("C:\\Users\\prasanth murugan\\eclipse-workspace\\Maven_Project_Automation\\Data\\Book1.xlsx", 9, 5);
		
		inputValues(pom.getLp().getEmail(), particularData);
		
		String particularData2 = particularData("C:\\\\Users\\\\prasanth murugan\\\\eclipse-workspace\\\\Maven_Project_Automation\\\\Data\\\\Book1.xlsx", 11, 5);
		
		inputValues(pom.getLp().getPass(), particularData2);
		
		clickOnElement(pom.getLp().getSubmit());
		
		
	}

}
