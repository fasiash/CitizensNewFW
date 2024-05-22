package com.codetru.project.cica.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.anhtester.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;


public class Step_7Page extends CommonPageCICA{



//	@FindBy(xpath = "(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[6]")
	private By nextstep7 = By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[6]");	

//	@FindBy(xpath = "//h3[.='HIPAA Privacy Authorization']")
	private By Disclosure = By.xpath("//h3[.='HIPAA Privacy Authorization']");

	public void Remarks() throws Exception {

//		C.page_Navigation(driver, act, nextstep7, Disclosure, e, Test.Case7(1), Test.Exp7(1));
		WebUI.moveToElement(nextstep7);
		WebUI.sleep(1);
		WebUI.clickElement(nextstep7);
		WebUI.waitForPageLoaded();
		WebUI.verifyElementVisible(Disclosure);
		WebUI.waitForPageLoaded(2);
		
//		Thread.sleep(2000);
		
	}


}
