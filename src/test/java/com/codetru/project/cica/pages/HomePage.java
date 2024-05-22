package com.codetru.project.cica.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.anhtester.keywords.WebUI.*;

import com.anhtester.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;



public class HomePage extends CommonPageCICA{

	/*
	public 	WebDriver driver;
	public	Extent_Reports e = new Extent_Reports(driver);
	public	Excel_Util data = new Excel_Util();	
	public WebDriverWait wait;
	public Common_Methods C = new Common_Methods();
	Ext_1 Test = new Ext_1();
	String path="C:\\Users\\Codetru\\Downloads\\Citizens_pom6\\Citizens_Pom1\\TestData\\Test Data- Citizen's 2.xlsx";
	
	public HomePage(WebDriver driver, Extent_Reports e) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.e = e;
	}
			 
*/		
	 
		private By application_btn = By.id("applicationButton");
	 
		private By list_application1 = By.xpath("//div[@class='applicationDropdown']/div[1]");
	 
		private By new_application1 = By.xpath("//div[@class='applicationDropdown']/div[2]");
	 
		private By step1 = By.xpath("//span[.='Step 1: Product Information']");
		
		private By step1InsuredInfo = By.xpath("//h3[text()='Proposed Insured Info']");

	
	 
		public void Open_Application_Module() throws Exception {
			
			WebUI.waitForPageLoaded();
			sleep(5);

//			wait = new WebDriverWait(driver, Duration.ofSeconds(60));

//			C.W_C1(driver, wait, application_btn, e,Test.Case(5), Test.Exp(5));
			clickElement(application_btn);
			sleep(1);

//			C.W_C1(driver, wait, list_application1, e, Test.Case(6), Test.Exp(6));
			clickElement(list_application1);
			sleep(2);
			
//
//			C.W_C1(driver, wait, application_btn, e,Test.Case(5), Test.Exp(5));
			clickElement(application_btn);
			sleep(1);
//
//			C.W_C1(driver, wait, new_application1, e, Test.Case(6), Test.Exp(6));
			clickElement(new_application1);
			sleep(2);
//
//			C.W_C1(driver, wait, step1, e, Test.Case(7), Test.Exp(7));
			verifyElementVisible(step1, "Step-1 tab not available");
			clickElement(step1);
			sleep(2);
			
			WebUI.waitForPageLoaded();
			verifyElementVisible(step1InsuredInfo, "Insured Info not displayed");

		}
	 
	}



