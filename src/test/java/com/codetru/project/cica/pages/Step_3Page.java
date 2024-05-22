package com.codetru.project.cica.pages;

import static com.anhtester.keywords.WebUI.getAttributeElement;
import static com.anhtester.keywords.WebUI.getTextElement;

import org.openqa.selenium.By;

import com.anhtester.helpers.PropertiesHelpers;
import com.anhtester.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;

public class Step_3Page extends CommonPageCICA {
	
//	@FindBy(xpath="//ion-item/ion-label[.='No']/following-sibling::ion-radio[@value='false']")
	private By noRadioBtn = By.xpath("//ion-item/ion-label[.='No']/following-sibling::ion-radio[@value='false']");

//	@FindBy(xpath = "(//ion-row/ion-col/ion-button[starts-with(@class, 'md button')])[8]")
	private By NextStep3 = By.xpath("(//ion-row/ion-col/ion-button[starts-with(@class, 'md button')])[8]");

//	@FindBy(xpath = "//ion-item/ion-label[.='Yes']/following-sibling::ion-radio[@role='radio']")
	private By step3_Yes = By.xpath("//ion-item/ion-label[.='Yes']/following-sibling::ion-radio[@role='radio']");

//	@FindBy(xpath = "//ion-item/ion-label[.='No']/following-sibling::ion-radio[@role='radio']")
	private By step3_No = By.xpath("//ion-item/ion-label[.='No']/following-sibling::ion-radio[@role='radio']");

//	@FindBy(xpath = "//form[@class='ng-untouched ng-pristine ng-invalid']//div[@class='block-info-app']")
	private By Error_ProposedOWner_Message = By.xpath("//form[@class='ng-untouched ng-pristine ng-invalid']//div[@class='block-info-app']");

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryFirstName']/input")
	private By BenificiaryFirstname = By.xpath("//ion-input[@formcontrolname='BeneficiaryFirstName']/input");

	public void Policy_Owner_Information() throws Exception {
		
		String Mandatory_Error = "Please enter a value.";
//		C.W_C1(driver, wait, NextStep3, e, Test.Case3(9), Test.Exp3(9)); --->Commented previously
		
//		C.Fields(driver, step3_No, e, Test.Case3(3), Test.Exp3(3));
//		C.Fields(driver, step3_No, e, Test.Case3(4), Test.Exp3(4));
		
//		C.Mandate_Click(driver, NextStep3, e, Test.Case3(9), Test.Exp3(9));
		WebUI.clickElement(NextStep3);

//		C.Empty_Input(driver, Error_ProposedOWner_Message, Mandatory_Error, e, Test.Case3(8), Test.Exp3(8));
		WebUI.verifyContains(getTextElement(Error_ProposedOWner_Message).trim(), Mandatory_Error);
		WebUI.sleep(1);

//		C.Fields(driver, step3_Yes, e, Test.Case3(10), Test.Exp3(10));
	
//		C.C2(driver, step3_Yes, step3_No, e, Test.Case3(1), Test.Exp3(1));
		WebUI.clickElement(step3_Yes);
		WebUI.sleep(1);
		WebUI.clickElement(step3_No);
		WebUI.sleep(1);
		
		//----------------------------------------------------------------------------------------
//		C.Fields(driver, step3_No, e, Test.Case3(5), Test.Exp3(5));
//		C.Fields(driver, step3_No, e, Test.Case3(6), Test.Exp3(6));
//		C.Fields(driver, step3_No, e, Test.Case3(11), Test.Exp3(11));
//		C.Fields(driver, step3_No, e, Test.Case3(2), Test.Exp3(2));
//		Thread.sleep(1000);
//		C.Fields(driver, step3_No, e, Test.Case3(7), Test.Exp3(7));
		//----------------------------------------------------------------------------------------
		
//		C.Mandate_Click(driver, NextStep3, e, Test.Case3(5), Test.Exp3(5));  -------> Commented Previously
//		NextStep3.click();
		WebUI.clickElement(NextStep3);
		WebUI.sleep(2);
	
	}

}
