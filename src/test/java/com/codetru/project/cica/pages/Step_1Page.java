package com.codetru.project.cica.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.anhtester.utils.DataGenerateUtils;
import com.anhtester.utils.DataFakerUtils;
import static com.anhtester.keywords.WebUI.*;

import com.anhtester.helpers.PropertiesHelpers;
import com.anhtester.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;


public class Step_1Page extends CommonPageCICA{


	private By page_Error = By.xpath("//p[.='There are some errors on this page. Please correct before continuing.']");

	private By FirstName = By.xpath("//ion-input[@formcontrolname='ProposedFirstName']/input");

	private By Error_Message_FirstName = By.xpath("(//ion-col[@size='24' and @size-md='8'])[1]");

	private By MiddleName = By.xpath("//ion-input[@formcontrolname='ProposedMiddleName']/input");

	private By Error_Message_MiddleName = By.xpath("(//ion-col[@size='24' and @size-md='8'])[2]");

	private By LastName = By.xpath("//ion-input[@formcontrolname='ProposedLastName']/input");

	private By Error_Message_LastName = By.xpath("(//ion-col[@size='24' and @size-md='8'])[3]");

	private By StateDropdown = By.xpath("//select[@formcontrolname='ProposedPhysicalState']");

	private By Error_Message_State = By.xpath("(//ion-col[@size='24' and @size-md='4'])[1]");

	private By state = By.xpath("(//option[.=' Louisiana'])[1]");

	private By genderDropdown = By.xpath("//select[@formcontrolname='ProposedGender']");

	private By gender = By.xpath("//option[.='Male']");

	private By Error_Message_Gender = By.xpath("(//ion-col[@size='24' and @size-md='4' and @class='md hydrated']/following-sibling::ion-col[@size='24' and @class='md hydrated'])[1]");

	private By DateOfBirth = By.xpath("//input[@formcontrolname='ProposedBirthDate']");

	private By age = By.xpath("//ion-input[@formcontrolname='ProposedAge']");

	private By Error_Message_DateOfBirth = By.xpath("(//ion-col[@size='24' and @size-md='4' and @class='md hydrated']/following-sibling::ion-col[@size='24' and @class='md hydrated'])[2]");

	private By Error_Message_ApplicantLocation = By.xpath("(//ion-col[@size='24' and @size-md='4' and @class='md hydrated']/following-sibling::ion-col[@size='24' and @class='md hydrated'])[4]");

	private By signedStateDropdown = By.xpath("//select[@formcontrolname='SignedState']");
	private By SignedState = By.xpath("(//option[.=' Louisiana'])[2]");
	private By preferredlanguage = By.xpath("//select[@formcontrolname='ProposedPreferredLanguage']");
	private By language = By.xpath("//option[.=' English']");
	private By Call_Yes = By.xpath("(//ion-label[.='Yes'])[1]");
	private By Call_No = By.xpath("(//ion-label[.='No'])[1]");
	private By Error_Message_Language = By.xpath("(//ion-col[@size='24' and @size-md='4' and @class='md hydrated']/following-sibling::ion-col[@size='24' and"
			+ " @class='md hydrated'])[5]");
	private By ErrorMessage_BasePlan = By.xpath("//ion-col[@class = 'md hydrated' and @size-md = '7']");
	private By plan = By.xpath("//select[@formcontrolname='Plan']");
	private By selectPlan = By.xpath("//option[.=' Allegiant Superior Choice Standard Issue']");
	private By selectPlan_CICA = By.xpath("//option[.=' CICA Life Plus Standard Issue']");
	private By selectPlan_Garuntee = By.xpath("//option[.=' CICA Life Plus Guaranteed Issue']");
	private By Accidental_Checkbox = By.xpath("//ion-Checkbox[@formcontrolname='ADB']");
	private By FaceAmount = By.xpath("//ion-input[@formcontrolname='AmountOfInsurance']/input");
	private By ErrorMessage_FaceAmount = By.xpath("//ion-col[@class = 'md hydrated' and @size-md = '3']");
	private By Annually = By.xpath("//ion-label[text()='Annually']/following-sibling::ion-radio");
	private By Semi_Annually = By.xpath("//ion-label[text()='Semi-Annually']/following-sibling::ion-radio");
	private By Quarterly = By.xpath("//ion-label[text()='Quarterly']/following-sibling::ion-radio");
	private By Monthly = By.xpath("//ion-label[text()='Monthly']/following-sibling::ion-radio");
	private By Yes = By.xpath("(//ion-label[text()='Yes']/following-sibling::ion-radio)[2]");
	private By No = By.xpath("(//ion-label[text()='No']/following-sibling::ion-radio)[2]");
	private By Nextstep_1 = By.xpath("(//ion-col/ion-button[starts-with(@class, 'md button')])[5]");
	private By premiumType = By.xpath("//ion-label[text()='Monthly']/following-sibling::ion-radio");
	private By loanRadioBtn = By.xpath("(//ion-label[text()='Yes']/following-sibling::ion-radio)[2]");
	private By calculate = By.xpath("(//div/ion-row/ion-col/ion-button[starts-with(@class, md)])[2]");
	private By step_2 = By.xpath("//span[normalize-space()='Step 2: Proposed Insured Information']");
	
	private By insuredInfoElement = By.xpath("//h3[.='Proposed Insured Info']");
	


	public void Product_Information(String statex) throws Exception {

		String Mandate_Error = "Please enter a value.";
		String Max_Error = "The maximum number of characters is 33.";
		String Max_Char = "qwertyuiopqwertyuiopqwertyuiopqwertyu";
		String Page_Error_ = "There are some errors on this page. Please correct before continuing.";
		String Fc_MxErr = "The maximum amount is 30000.";
		String Fc_MnErr = "The minimum amount is 1000.";

		

		WebUI.scrollToElementAtBottom(calculate);
		WebUI.verifyElementClickable(calculate);
		WebUI.clickElement(calculate);
		WebUI.scrollToElementAtBottom(page_Error);
		WebUI.verifyElementPresent(page_Error, "Error message not displayed");
		

		WebUI.verifyContains(getTextElement(page_Error).trim(), Page_Error_);
	

		WebUI.scrollToElementAtBottom(calculate);
		WebUI.clickElement(calculate);
		WebUI.scrollToElementAtTop(FirstName);
		WebUI.verifyElementVisible(FirstName, "First Name textbox not displayed");
		

		WebUI.verifyContains(getTextElement(Error_Message_FirstName).trim(), Mandate_Error);


		WebUI.sleep(1);
		WebUI.scrollToElementAtTop(insuredInfoElement);
		WebUI.clearText(FirstName);
		WebUI.setText(FirstName, Max_Char);
		WebUI.sleep(1);
		WebUI.verifyElementVisible(Error_Message_FirstName);
		WebUI.sleep(1);
		WebUI.verifyContains(getTextElement(Error_Message_FirstName).trim(), Max_Error);
		WebUI.sleep(1);
		String Randomfirstname = DataGenerateUtils.randomFirstName();
		WebUI.clearAndFillText(FirstName,Randomfirstname);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(FirstName,"value"),Randomfirstname);
		WebUI.clearText(MiddleName);
		WebUI.setText(MiddleName, Max_Char);
		WebUI.verifyElementVisible(Error_Message_MiddleName);
		WebUI.verifyContains(getTextElement(Error_Message_MiddleName).trim(), Max_Error);
		
//		C.Send_verify_Valid_C(driver, MiddleName, e, "Cod", Test.Case1(2),Test.Exp1(2));
//		WebUI.clearAndFillText(MiddleName, PropertiesHelpers.getValue("middle_Name"));
//		WebUI.clearAndFillText(MiddleName,DataGenerateUtils.randomMiddleName());
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(MiddleName, "value"), PropertiesHelpers.getValue("middle_Name"));
		String Randommiddlename = DataGenerateUtils.randomMiddleName();
		WebUI.clearAndFillText(MiddleName,Randommiddlename);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(MiddleName,"value"),Randommiddlename);
//
//		C.Empty_Input(driver, Error_Message_LastName, Mandate_Error, e, Test.Case1(8),Test.Case1(8));
		WebUI.verifyContains(getTextElement(Error_Message_LastName).trim(), Mandate_Error);

//		C.Max_Char(driver, LastName, Error_Message_LastName, Max_Char,  Max_Error, e, Test.Case1(7), Test.Case1(7));
		WebUI.clearText(LastName);
		WebUI.setText(LastName, Max_Char);
		WebUI.verifyElementVisible(Error_Message_LastName);
		WebUI.verifyContains(getTextElement(Error_Message_LastName).trim(), Max_Error);

//		C.Send_verify_Valid_C(driver, LastName, e, "Markan",  Test.Case1(6),Test.Exp1(6));
//		WebUI.clearAndFillText(LastName, PropertiesHelpers.getValue("last_Name"));
//		WebUI.clearAndFillText(LastName,DataGenerateUtils.randomLastName());
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(LastName, "value"), PropertiesHelpers.getValue("last_Name"));
		String Randomlastname = DataGenerateUtils.randomLastName();
		WebUI.clearAndFillText(LastName,Randomlastname);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(LastName,"value"),Randomlastname);
//		C.Empty_Input(driver, Error_Message_State, Mandate_Error, e,  Test.Case1(11),Test.Exp1(11));		 
		WebUI.verifyContains(getTextElement(Error_Message_State).trim(), Mandate_Error);

//		C.C2(driver, StateDropdown, state, e, Test.Case1(10),Test.Exp1(10));
		WebUI.verifyElementClickable(StateDropdown);
		WebUI.clickElement(StateDropdown);
		WebUI.sleep(1);
		WebUI.clickElement(state);
//		WebUI.setText(StateDropdown, state);
//		WebUI.sendKeys(Keys.ENTER);
		
//		C.G_Displayed(driver, StateDropdown,e, Test.Case1(9),Test.Exp1(9));
		WebUI.verifyContains(getAttributeElement(StateDropdown,"value"), getAttributeElement(StateDropdown,"value"));

//		C.Empty_Input(driver, Error_Message_Gender, Mandate_Error, e,  Test.Case1(14),Test.Exp1(14));
		WebUI.verifyContains(getTextElement(Error_Message_Gender).trim(), Mandate_Error);
		
//		C.Selection(driver, act, genderDropdown, "Male", e, Test.Case1(13),Test.Exp1(13));
		WebUI.selectOptionByText(genderDropdown, PropertiesHelpers.getValue("gender"));

//		C.G_Displayed(driver, genderDropdown,e, Test.Case1(12),Test.Exp1(12));//
		WebUI.verifyContains(getAttributeElement(genderDropdown,"value"), getAttributeElement(genderDropdown,"value"));

//		C.Empty_Input(driver, Error_Message_DateOfBirth, Mandate_Error, e, Test.Case1(16),Test.Exp1(16));
		WebUI.verifyContains(getTextElement(Error_Message_DateOfBirth).trim(), Mandate_Error);

//		C.DOB_(driver, DateOfBirth, "13031999", e, Test.Case1(15),Test.Exp1(15));
		WebUI.setText(DateOfBirth, PropertiesHelpers.getValue("date_Of_Birth"));
		
		//--------------------------------------------------------------------------------------------------------------
//		C.Fields(driver, age,  e, Test.Case1(18),Test.Exp1(18));

//		C.Fields(driver, age, e, Test.Case1(20),Test.Exp1(20));
		//-----------------------------Check what to pass/verify in the above 2 lines of codes------------------------------------------------

//		C.Empty_Input(driver, Error_Message_ApplicantLocation, Mandate_Error, e,  Test.Case1(23),Test.Exp1(23));
		WebUI.verifyContains(getTextElement(Error_Message_ApplicantLocation).trim(), Mandate_Error);

//		C.C2(driver, signedStateDropdown, SignedState, e,Test.Case1(22),Test.Exp1(22));
		WebUI.verifyElementClickable(signedStateDropdown);
		WebUI.clickElement(signedStateDropdown);
		WebUI.sleep(1);
//		WebUI.clickElement(SignedState);
		WebUI.setText(signedStateDropdown, statex);
//		WebUI.sendKeys(Keys.ENTER);
//		C.Empty_Input(driver, Error_Message_Language, Mandate_Error, e,  Test.Case1(26),Test.Exp1(26));
		WebUI.verifyContains(getTextElement(Error_Message_Language).trim(), Mandate_Error);

//		C.C2(driver, preferredlanguage, language, e,Test.Case1(25),Test.Exp1(25));
		WebUI.verifyElementClickable(preferredlanguage);
		WebUI.clickElement(preferredlanguage);
		WebUI.sleep(1);
		WebUI.clickElement(language);

		WebUI.scrollToElementAtBottom(calculate);
		WebUI.verifyElementVisible(calculate);
//
//		C.Empty_Input(driver, ErrorMessage_BasePlan, Mandate_Error, e, Test.Case1(31),Test.Exp1(31)); 
		WebUI.verifyContains(getTextElement(ErrorMessage_BasePlan).trim(), Mandate_Error);

//		C.C2(driver, plan, selectPlan, e, Test.Case1(30),Test.Exp1(30));
		WebUI.verifyElementClickable(plan);
		WebUI.clickElement(plan);
		WebUI.sleep(1);
		WebUI.clickElement(selectPlan_CICA);


		WebUI.verifyContains(getTextElement(ErrorMessage_FaceAmount).trim(), Mandate_Error);

//		C.Max_Char_Scroll(driver, act, FaceAmount, calculate, ErrorMessage_FaceAmount, "Testing", Test.Err_Msg(2, 4, 4), e, Test.Case1(33),Test.Exp1(33));
		WebUI.clearText(FaceAmount);
		WebUI.sleep(1);
		WebUI.setText(FaceAmount, "Testing");
		WebUI.moveToElement(calculate);
		WebUI.clickElement(calculate);
		WebUI.verifyElementVisible(ErrorMessage_FaceAmount);
		WebUI.verifyContains(getTextElement(ErrorMessage_FaceAmount), "Please use a number format.");

//		C.Max_Char(driver, FaceAmount, ErrorMessage_FaceAmount, "30001", Fc_MxErr, e,  Test.Case1(34),Test.Exp1(34));
		WebUI.scrollToElementAtTop(FaceAmount);
		WebUI.clearText(FaceAmount);
		WebUI.sleep(1);
		WebUI.setText(FaceAmount, "30001");
		WebUI.sleep(1);
		WebUI.verifyElementVisible(ErrorMessage_FaceAmount);
		WebUI.verifyContains(getTextElement(ErrorMessage_FaceAmount).trim(), Fc_MxErr);

//		C.SC_C_Send(driver, act, calculate,FaceAmount, ErrorMessage_FaceAmount, "999", Fc_MnErr, e, Test.Case1(35),Test.Exp1(35));
		WebUI.scrollToElementAtBottom(calculate);
		WebUI.sleep(1);
		WebUI.clickElement(calculate);
		WebUI.sleep(1);
		WebUI.clearAndFillText(FaceAmount, "999");
		WebUI.verifyElementVisible(ErrorMessage_FaceAmount);
		WebUI.verifyContains(getTextElement(ErrorMessage_FaceAmount).trim(), Fc_MnErr);

//		C.Send_verify_Valid_C(driver, FaceAmount, e, "3001", Test.Case1(32),Test.Exp1(32));
		WebUI.clearText(FaceAmount);
		WebUI.sleep(1);
//		WebUI.setText(FaceAmount, "3001");
		int fAmountGenerated = DataGenerateUtils.random4DigitNumberLessThan30000();
		WebUI.clearAndFillText(FaceAmount,String.valueOf(fAmountGenerated));
		WebUI.sleep(1);
		System.out.println(fAmountGenerated);
		WebUI.verifyContains(getAttributeElement(FaceAmount,"value"),String.valueOf(fAmountGenerated));

//		C.Clk_Is_Enabled(driver, Annually, e,  Test.Case1(42),Test.Exp1(42));
		WebUI.verifyElementClickable(Annually);
		WebUI.clickElement(Annually);
		
//		C.Clk_Is_Enabled(driver, Semi_Annually, e,  Test.Case1(43),Test.Exp1(43));
		WebUI.verifyElementClickable(Semi_Annually);
		WebUI.clickElement(Semi_Annually);
		
//		C.Clk_Is_Enabled(driver, Quarterly, e,  Test.Case1(44),Test.Exp1(44));
		WebUI.verifyElementClickable(Quarterly);
		WebUI.clickElement(Quarterly);
		
//		C.Clk_Is_Enabled(driver, Monthly, e,  Test.Case1(45),Test.Exp1(45));
		WebUI.verifyElementClickable(Monthly);
		WebUI.clickElement(Monthly);
		
//		C.Clk_Is_Enabled(driver, Yes, e, Test.Case1(46),Test.Exp1(46));
		WebUI.verifyElementClickable(Yes);
		WebUI.clickElement(Yes);
//		C.Clk_Is_Enabled(driver, No, e,  Test.Case1(47),Test.Exp1(47));
		WebUI.verifyElementClickable(No);
		WebUI.clickElement(No);
		WebUI.clickElement(calculate);
		
//		C.page_Navigation(driver, act, Nextstep_1, step_2, e, Test.Case1(59),Test.Exp1(59));
		WebUI.moveToElement(Nextstep_1);
		WebUI.clickElement(Nextstep_1);
		WebUI.waitForPageLoaded();
		WebUI.verifyElementVisible(step_2);
		//Nextstep_1.click();
	}
}



