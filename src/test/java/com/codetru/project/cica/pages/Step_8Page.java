package com.codetru.project.cica.pages;

import static com.anhtester.keywords.WebUI.getAttributeElement;
import static com.anhtester.keywords.WebUI.getTextElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.anhtester.helpers.PropertiesHelpers;
import com.anhtester.keywords.WebUI;
import com.anhtester.utils.DataGenerateUtils;
import com.codetru.project.cica.CommonPageCICA;


public class Step_8Page extends CommonPageCICA {

	
//		@FindBy(xpath = "(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[7]")
		private By NextStep8 = By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[7]");
	
//		@FindBy(xpath = "//ion-input[@formcontrolname='SignedCity']/input")
		private By signedCity = By.xpath("//ion-input[@formcontrolname='SignedCity']/input");
		
//		@FindBy(xpath = "//ion-input[@formcontrolname='DateSigned']/input")
//		private By Date_Signed = By.xpath("//ion-input[@formcontrolname='DateSigned']/input");
	
//		@FindBy(xpath = "//ion-radio-group[@formcontrolname='HoldDateCheckBox']/ion-row/ion-col[2]/ion-item")
		private By HoldDateRadioButton_No = By.xpath("//ion-radio-group[@formcontrolname='HoldDateCheckBox']/ion-row/ion-col[2]/ion-item");
	
//		@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[2]")
		private By Error_SignedCity = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[3]");
	
//		@FindBy(xpath = "(//h3[text()='Signature']/following-sibling::ion-row[2]/ion-col[@size='24' and @size-md='6'])[1]")
		private By Error_SignatureProposedInsurer = By.xpath("(//h3[text()='Signature']/following-sibling::ion-row[2]/ion-col[@size='24' and @size-md='6'])[1]");
	
//		@FindBy(xpath = "//h3[.='Signature']/following-sibling::ion-row[2]/ion-col/div/ion-button")
		private By ProposedInsurerSignature = By.xpath("//h3[.='Signature']/following-sibling::ion-row[2]/ion-col/div/ion-button");
	
//		@FindBy(xpath = "(//canvas[@class='signature-pad-canvas hidden-xs-down'])[1]")
		private By signature_pad1 = By.xpath("(//canvas[@class='signature-pad-canvas hidden-xs-down'])[1]");
	
//		@FindBy(xpath = "(//ion-col[@style='padding-right: 20px;']/ion-button)[1]")
		private By Padding_Right1 = By.xpath("(//ion-col[@style='padding-right: 20px;']/ion-button)[1]");
	
//		@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[6]")
		private By Error_HoldUntillDate = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[7]");
	
//		@FindBy(xpath = "//h3[text()='Agent']/following-sibling::ion-row/ion-col[4][@size='24']")
		private By Error_SignatureOfAgent = By.xpath("//h3[text()='Agent']/following-sibling::ion-row/ion-col[4][@size='24']");
	
//		@FindBy(xpath = "//div/h3[.='Agent']/following-sibling::ion-row/ion-col[4]/div/ion-button")
		private By SignatureOfAgent = By.xpath("//div/h3[.='Agent']/following-sibling::ion-row/ion-col[4]/div/ion-button");
	
//		@FindBy(xpath = "//canvas[@class='signature-pad-canvas hidden-xs-down']")
		private By signature_pad2 = By.xpath("//canvas[@class='signature-pad-canvas hidden-xs-down']");
	
//		@FindBy(xpath = "(//ion-col[@style='padding-right: 20px;']/ion-button)[1]")
		private By Padding_Right2 = By.xpath("(//ion-col[@style='padding-right: 20px;']/ion-button)[1]");
	
//		@FindBy(xpath = "(//img[@width='150'])[1]")
		private By Sign1 = By.xpath("(//img[@width='150'])[1]");
	
//		@FindBy(xpath = "(//img[@width='150'])[2]")
		private By Sign2 = By.xpath("(//img[@width='150'])[2]");
	
//		@FindBy(id="applicationButton")
		private By application_btn = By.id("applicationButton");
	
		//img[@width='150']
	
		public void Disclosure_and_Signature() throws Exception {
	
			String Max_Name = "sdfsadfgdfsfghfghxfghjdsfghdfghdfghjdfsghdsfghretyu";
			String Max_error_ ="The maximum number of characters is 50.";
			String Mandatory_Err = "Please enter a value.";
			String hold_Date_Err = "Hold Date required or click No for delayed payment";
			
	
//			C.Mandate_Click2(driver, act, NextStep8,Error_SignedCity, e, Test.Case8(1), Test.Exp8(1));
			WebUI.moveToElement(NextStep8);
			WebUI.sleep(2);
			WebUI.clickElement(NextStep8);
			WebUI.sleep(2);
			WebUI.scrollToElementAtBottom(Error_SignedCity);
			WebUI.verifyElementVisible(Error_SignedCity,1);
	
//			C.Empty_Input(driver, Error_SignedCity, Mandatory_Err, e, Test.Case8(4), Test.Exp8(4));
			WebUI.verifyContains(getTextElement(Error_SignedCity).trim(), Mandatory_Err);
	
//			Thread.sleep(1000);
			WebUI.sleep(1);
			
			//-----------------Commented Previously-----------------------------------------------------------
//			WebElement ContinueButton =driver.findElement(By.xpath("//span[text()='Continue']"));
//			Thread.sleep(1000);
//			ContinueButton.click();
//			Thread.sleep(1000);
			//-----------------Commented Previously-----------------------------------------------------------
			
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(25), Test.Exp8(25));
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(26), Test.Exp8(26));
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(29), Test.Exp8(29));
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(30), Test.Exp8(30));
			
			
//			act.moveToElement(signedCity).build().perform();
			WebUI.moveToElement(signedCity);
//			act.moveToElement(ProposedInsurerSignature).build().perform();
			WebUI.moveToElement(ProposedInsurerSignature);
			
//			C.Max_Char_Act(driver, act, signedCity, Error_SignedCity, Max_Name,Max_error_, e, Test.Case8(3), Test.Exp8(3));
			WebUI.clearAndFillText(signedCity, Max_Name);
			WebUI.sleep(1);
			WebUI.moveToElement(Error_SignedCity);
			WebUI.verifyElementVisible(Error_SignedCity, 1);
			WebUI.verifyContains(getTextElement(Error_SignedCity).trim(), Max_error_);
			
//			act.moveToElement(signedCity).build().perform();
			WebUI.moveToElement(signedCity);
			
//			C.Send_verify_Valid_C(driver, signedCity, e, "Alabama", Test.Case8(2), Test.Exp8(2));
//			WebUI.clearAndFillText(signedCity, PropertiesHelpers.getValue("signed_City"));
//			WebUI.sleep(1);
//			WebUI.verifyContains(getAttributeElement(signedCity, "value"), PropertiesHelpers.getValue("signed_City"));
			String RandomCity = DataGenerateUtils.randomCity();
			WebUI.clearAndFillText(signedCity,RandomCity);
			WebUI.sleep(1);
			WebUI.verifyContains(getAttributeElement(signedCity,"value"),RandomCity);
//			act.moveToElement(signedCity).build().perform();
			WebUI.moveToElement(signedCity);
			
//			C.Fields(driver, signedCity, e,  Test.Case8(4), Test.Exp8(4));

			
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(31), Test.Exp8(31));
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(32), Test.Exp8(32));
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(5), Test.Exp8(5));
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(6), Test.Exp8(6));
//			C.Fields(driver, Date_Signed, e,  Test.Case8(7), Test.Exp8(7));
	
//			C.act_scroll2(driver, act, Error_SignatureProposedInsurer, HoldDateRadioButton_No, e, Test.Case8(38), Test.Exp8(38));
			WebUI.scrollToElementAtBottom(Error_SignatureProposedInsurer);
			WebUI.sleep(2);
			WebUI.scrollToElementAtBottom(HoldDateRadioButton_No);
			WebUI.verifyElementPresent(HoldDateRadioButton_No, 1);
			WebUI.sleep(1);
	
//			C.Empty_Input(driver, Error_SignatureProposedInsurer, Mandatory_Err, e, Test.Case8(39), Test.Exp8(39));
			WebUI.verifyContains(getTextElement(Error_SignatureProposedInsurer).trim(), Mandatory_Err);
			
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(11), Test.Exp8(11));

//			C.Signature(driver, act, ProposedInsurerSignature, signature_pad1, Padding_Right1, Sign1,
//					25, 25, 35, 30, 16, 26, -76, -26, 18, 56, -52, -36, -21,-25, 36, 26, -54, 56, e, 
//					Test.Case8(12), Test.Exp8(12));
			WebUI.sleep(1);
			WebUI.clickElement(ProposedInsurerSignature);
			WebUI.sleep(2);
			WebUI.clickHold(signature_pad1);
			WebUI.moveToOffset(25, 25);
			WebUI.moveToOffset(35, 30);
			WebUI.moveToOffset(16, 26);
			WebUI.moveToOffset(-76, -26);
			WebUI.moveToOffset(18, 56);
			WebUI.moveToOffset(-52, -36);
			WebUI.moveToOffset(-21, -25);
			WebUI.moveToOffset(36, 26);
			WebUI.moveToOffset(-54, 56);
			WebUI.releaseElement(signature_pad1);
			WebUI.clickElement(Padding_Right1);
			WebUI.sleep(2);
			WebUI.verifyElementVisible(Sign1);
			
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(13), Test.Exp8(13));
//			
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(14), Test.Exp8(14));
//	
//			C.act_scroll1(driver, act, Error_HoldUntillDate, e, Test.Case8(40), Test.Exp8(40));
			WebUI.scrollToElementAtBottom(Error_HoldUntillDate);
			WebUI.verifyElementVisible(Error_HoldUntillDate);
			
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(15), Test.Exp8(15));
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(16), Test.Exp8(16));
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(18), Test.Exp8(18));
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(23), Test.Exp8(23));
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(24), Test.Exp8(24));
			
//			C.Empty_Input(driver, Error_HoldUntillDate, "Hold Date required or click No for delayed payment",e, Test.Case8(17), Test.Exp8(17));
			WebUI.verifyContains(getTextElement(Error_HoldUntillDate).trim(), hold_Date_Err);
			
//			C.Fields(driver, HoldDateRadioButton_No, e,  Test.Case8(19), Test.Exp8(19));
//	
//			C.Click_Scroll(driver, act, HoldDateRadioButton_No, NextStep8, e,  Test.Case8(41), Test.Exp8(41));
			WebUI.clickElement(HoldDateRadioButton_No);
			WebUI.scrollToElementAtBottom(NextStep8);
			WebUI.verifyElementVisible(NextStep8, 2);
//			
//			C.Empty_Input(driver, Error_SignatureOfAgent, Mandatory_Err,e, Test.Case8(41), Test.Exp8(41));
			WebUI.verifyContains(getTextElement(Error_SignatureOfAgent).trim(), Mandatory_Err);
			WebUI.sleep(1);
			
//			C.Fields(driver, HoldDateRadioButton_No, e,  Test.Case8(20), Test.Exp8(20));
//			C.Fields(driver, HoldDateRadioButton_No, e,  Test.Case8(21), Test.Exp8(21));
//			C.Fields(driver, HoldDateRadioButton_No, e,  Test.Case8(22), Test.Exp8(22));
	
//			C.Signature(driver, act, SignatureOfAgent, signature_pad2, Padding_Right2, Sign2,
//					25, 25, 35, 30, 16, 26, -76, -26, 18, 56, -52, -36, -21,-25, 36, 26, 112, 56, e,
//					Test.Case8(27), Test.Exp8(27));
			WebUI.clickElement(SignatureOfAgent);
			WebUI.sleep(1);
			WebUI.clickHold(signature_pad2); 
			WebUI.moveToOffset(25, 25);
			WebUI.moveToOffset(35, 30);
			WebUI.moveToOffset(16, 26);
			WebUI.moveToOffset(-76, -26);
			WebUI.moveToOffset(18, 56);
			WebUI.moveToOffset(-52, -36);
			WebUI.moveToOffset(-21, -25);
			WebUI.moveToOffset(36, 26);
			WebUI.moveToOffset(112, 56);
			WebUI.releaseElement(signature_pad2); 
			WebUI.clickElement(Padding_Right2);
			WebUI.sleep(2);
			WebUI.verifyElementVisible(Sign2);
//			
			WebUI.sleep(1);
			
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(5), Test.Exp8(5));
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(8), Test.Exp8(8));
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(9), Test.Exp8(9));
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(10), Test.Exp8(10));
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(28), Test.Exp8(28));
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(35), Test.Exp8(35));
//			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(39), Test.Exp8(39));
			
//			C.Click_Displayed(driver, NextStep8, application_btn, e, Test.Case8(36), Test.Exp8(36));
			WebUI.clickElement(NextStep8);
			WebUI.sleep(1);
			WebUI.verifyElementVisible(application_btn, 2);
			WebUI.sleep(1);
			
//			NextStep8.click();
			WebUI.clickElement(NextStep8);
			
			
			
		}
}
