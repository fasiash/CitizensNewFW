package com.codetru.project.cica.pages;

import static com.anhtester.keywords.WebUI.getAttributeElement;
import static com.anhtester.keywords.WebUI.getTextElement;

import org.openqa.selenium.By;

import com.anhtester.constants.FrameworkConstants;
import com.anhtester.helpers.PropertiesHelpers;
import com.anhtester.keywords.WebUI;
import com.anhtester.utils.DataGenerateUtils;
import com.codetru.project.cica.CommonPageCICA;

public class Step_2Page extends CommonPageCICA {


//	@FindBy(xpath = "//span[text()='Step 2: Proposed Insured Information']")
	private By step_2 = By.xpath("//span[text()='Step 2: Proposed Insured Information']");

//	@FindBy(xpath = "(//ion-col/ion-button[starts-with(@class, 'md button')])[2]")
	private By NextStep2 = By.xpath("(//ion-col/ion-button[starts-with(@class, 'md button')])[2]");

//	@FindBy(xpath = "//ion-input[@formcontrolname='ProposedSSN']/input")
	private By SSN_Number = By.xpath("//ion-input[@formcontrolname='ProposedSSN']/input");

//	@FindBy(xpath = "//ion-col[@class = 'md hydrated' and @size-md = '14']")
	private By ErrorSSN_NumberMessage = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '6'])[3]");

//	@FindBy(xpath="//ion-input[@formcontrolname='ProposedEmailAddress']/input")
	private By EmailAddress = By.xpath("//ion-input[@formcontrolname='ProposedEmailAddress']/input");

//	@FindBy(xpath="(//h3[text() = 'Contact Information']/following-sibling::ion-row//ion-col[@size-md = '8'])[1]")
	private By Error_EmailAddressMessage = By.xpath("(//h3[text() = 'Contact Information']/following-sibling::ion-row//ion-col[@size-md = '8'])[1]");

//	@FindBy(xpath="(//h3[text() = 'Contact Information']/following-sibling::ion-row//ion-col[@size-md = '8'])[1]")
	private By Error_EmailCorrectFormatMessage = By.xpath("(//h3[text() = 'Contact Information']/following-sibling::ion-row//ion-col[@size-md = '8'])[1]");

//	@FindBy(xpath = "//ion-input[@formcontrolname='ProposedMobilePhone']/input")
	private By phoneNumber = By.xpath("//ion-input[@formcontrolname='ProposedMobilePhone']/input");

//	@FindBy(xpath = "(//h3[text() = 'Contact Information']/following-sibling::ion-row//ion-col[@size-md = '8'])[2]")
	private By Error_PhoneNumberMessage = By.xpath("(//h3[text() = 'Contact Information']/following-sibling::ion-row//ion-col[@size-md = '8'])[2]");

//	@FindBy(xpath = "//ion-input[@formcontrolname='ProposedPhysicalAddress1']/input")
	private By Address_1_Message = By.xpath("//ion-input[@formcontrolname='ProposedPhysicalAddress1']/input");

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '24'])[1]")
	private By Error_Address_1_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '24'])[1]");

//	@FindBy(xpath = "//ion-input[@formcontrolname='ProposedPhysicalAddress2']/input")
	private By Address_2_Message = By.xpath("//ion-input[@formcontrolname='ProposedPhysicalAddress2']/input");

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '24'])[2]")
	private By Error_Address_2_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '24'])[2]");

//	@FindBy(xpath = "//ion-input[@formcontrolname='ProposedPhysicalZipCode']/input")
	private By ZipCode = By.xpath("//ion-input[@formcontrolname='ProposedPhysicalZipCode']/input");

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '7'])[1]")
	private By Error_ZipCode_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '7'])[1]");

//	@FindBy(xpath = "//ion-input[@formcontrolname='ProposedPhysicalZipCode']/following-sibling::ion-button")
	private By Proposed_ZipCode = By.xpath("//ion-input[@formcontrolname='ProposedPhysicalZipCode']/following-sibling::ion-button");

//	@FindBy(xpath = "//select[@formcontrolname='ProposedPhysicalCity']")
	private By city = By.xpath("//select[@formcontrolname='ProposedPhysicalCity']");

//	@FindBy(xpath = "//option[.='Dodge City ']")
	private By CitySelection = By.xpath("//option[.='Dodge City ']");

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '10'])[1]")
	private By Error_City_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '10'])[1]");

//	@FindBy(xpath = "(//ion-row/ion-col/ion-button[starts-with(@class, 'md button')])[8]")
	private By NextStep3 = By.xpath("(//ion-row/ion-col/ion-button[starts-with(@class, 'md button')])[8]");

	public void Proposed_Insured_Information() throws Exception {
		
		String Email_Max = "destinysdfghdfghdfsgdsfgsdfgdfghdfghdsfghjdsfghdfghdfghfgh";
		String Add_Max = "280 SIERRA DR. APT. B407 1142 SW ARLINGTON BLVD 1142 SW ARLINGTON BLVD";
		String Max_error ="The maximum number of characters is 33.";
		String Max_error_ ="The maximum number of characters is 50";
		String Min_error_Pn ="The minimum number of characters is 10.";
		String Max_error_Pn ="The maximum number of characters is 10.";
		String Min_error_Zp ="The minimum number of characters is 5.";
		String Max_error_Zp ="The maximum number of characters is 5.";
		String Mandatory_Error = "Please enter a value.";
		String Ssn_error = "SSN should have exactly 9 digits.";
		String Ssn_error1 = "The last 4 digits of SSN should be from 0001 to 9999";
		String Chars_only = "abcdefghijklmnopqrstuvwxyz";
		String Ssn_Num_Error = "Please use a number format.";
		String incorrect_Email_Error = "Email is not in the correct format";
		String phone_Num_Format_Error = "Please use a number format.";
		
//		C.Click_Displayed(driver, step_2, SSN_Number, e, Test.Case2(1),Test.Exp2(1));
		WebUI.waitForPageLoaded();
		WebUI.clickElement(step_2);
		WebUI.verifyElementVisible(SSN_Number);

//		C.Scroll_C_scroll2(driver, act, NextStep2, SSN_Number, e, Test.Case2(35), Test.Exp2(35));
		WebUI.scrollToElementAtBottom(NextStep2);
		WebUI.verifyElementClickable(NextStep2);
		WebUI.clickElement(NextStep2);
		WebUI.scrollToElementAtTop(SSN_Number);
		WebUI.verifyElementPresent(SSN_Number, "Error message not displayed");

//		C.Empty_Input(driver, ErrorSSN_NumberMessage, Ssn_error, e, Test.Case2(8), Test.Exp2(8));
		WebUI.verifyContains(getTextElement(ErrorSSN_NumberMessage).trim(), Ssn_error);

//		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "abcdefghijklmnopqrstuvwxyz", "Must be a number", e,
//		Test.Case2(4), Test.Exp2(4));
		WebUI.clearText(SSN_Number);
		WebUI.setText(SSN_Number, Chars_only);
		WebUI.verifyElementVisible(ErrorSSN_NumberMessage);
		WebUI.verifyContains(getTextElement(ErrorSSN_NumberMessage).trim(), Ssn_Num_Error);

//		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "25478451", Ssn_error, e,Test.Case2(6), Test.Exp2(6));
		WebUI.clearText(SSN_Number);
		WebUI.setText(SSN_Number, "25478451");
		WebUI.verifyElementVisible(ErrorSSN_NumberMessage);
		WebUI.verifyContains(getTextElement(ErrorSSN_NumberMessage).trim(), Ssn_error);
		
//		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "25478451123", Ssn_error, e,Test.Case2(7), Test.Exp2(7));
		WebUI.clearText(SSN_Number);
		WebUI.setText(SSN_Number, "25478451123");
		WebUI.verifyElementVisible(ErrorSSN_NumberMessage);
		WebUI.verifyContains(getTextElement(ErrorSSN_NumberMessage).trim(), Ssn_error);

//		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "1234asasa", Ssn_error1, e,Test.Case2(5), Test.Exp2(5));
		WebUI.clearText(SSN_Number);
		WebUI.setText(SSN_Number, "1234asasa");
		WebUI.verifyElementVisible(ErrorSSN_NumberMessage);
		WebUI.verifyContains(getTextElement(ErrorSSN_NumberMessage).trim(), Ssn_error1);

//		C.Send_verify_Valid_C(driver, SSN_Number, e, "254798741", Test.Case2(3), Test.Exp2(3));
//		WebUI.clearAndFillText(SSN_Number, PropertiesHelpers.getValue("ssn_Number"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(SSN_Number, "value"), PropertiesHelpers.getValue("ssn_Number"));
		String RandomSSNNumber = DataGenerateUtils.randomValidSSN();
		WebUI.clearAndFillText(SSN_Number,RandomSSNNumber);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(SSN_Number,"value"),RandomSSNNumber);
//		C.act_scroll1(driver, act, ZipCode, e, Test.Case2(27), Test.Exp2(27));
		WebUI.scrollToElementAtBottom(ZipCode);
		WebUI.verifyElementVisible(ZipCode);

//		C.Empty_Input(driver, Error_EmailAddressMessage, Mandatory_Error, e, Test.Case2(12), Test.Exp2(12));
		WebUI.verifyContains(getTextElement(Error_EmailAddressMessage).trim(), Mandatory_Error);

//		C.Max_Char(driver, EmailAddress, Error_EmailCorrectFormatMessage, "destiny", "Email is not in the correct format",
//		e, Test.Case2(10), Test.Exp2(10));
		WebUI.clearText(EmailAddress);
		WebUI.setText(EmailAddress, "destiny001");
		WebUI.verifyElementVisible(Error_EmailCorrectFormatMessage);
		WebUI.verifyContains(getTextElement(Error_EmailCorrectFormatMessage).trim(), incorrect_Email_Error);

//		C.Max_Char(driver, EmailAddress, Error_EmailCorrectFormatMessage, Email_Max,Max_error_,e, Test.Case2(11),Test.Exp2(11));
		WebUI.clearText(EmailAddress);
		WebUI.setText(EmailAddress, Email_Max);
		WebUI.verifyElementVisible(Error_EmailCorrectFormatMessage);
		WebUI.verifyContains(getTextElement(Error_EmailCorrectFormatMessage).trim(), Max_error_);

//		C.Send_verify_Valid_C(driver, EmailAddress, e, "destiny@none.com", Test.Case2(9), Test.Exp2(9));
//		WebUI.clearAndFillText(EmailAddress, PropertiesHelpers.getValue("email_Id"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(EmailAddress, "value"), PropertiesHelpers.getValue("email_Id"));
		String RandomEmailAddress = DataGenerateUtils.randomEmail();
		WebUI.clearAndFillText(EmailAddress,RandomEmailAddress);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(EmailAddress,"value"),RandomEmailAddress);
//		C.Empty_Input(driver, Error_PhoneNumberMessage, Mandatory_Error, e, Test.Case2(17), Test.Exp2(17));
		WebUI.verifyContains(getTextElement(Error_PhoneNumberMessage).trim(), Mandatory_Error);

//		C.Max_Char(driver, phoneNumber, Error_PhoneNumberMessage, "abc", "Please use a number format.", e, Test.Case2(14),Test.Exp2(14));
		WebUI.clearText(phoneNumber);
		WebUI.setText(phoneNumber, "abcd");
		WebUI.verifyElementVisible(Error_PhoneNumberMessage);
		WebUI.verifyContains(getTextElement(Error_PhoneNumberMessage).trim(), phone_Num_Format_Error);
		
//		C.Max_Char(driver, phoneNumber, Error_PhoneNumberMessage, "78945612", Min_error_Pn,e, Test.Case2(15),Test.Exp2(15));
		WebUI.clearText(phoneNumber);
		WebUI.setText(phoneNumber, "98765432");
		WebUI.verifyElementVisible(Error_PhoneNumberMessage);
		WebUI.verifyContains(getTextElement(Error_PhoneNumberMessage).trim(), Min_error_Pn);

//		C.Max_Char(driver, phoneNumber, Error_PhoneNumberMessage, "12548152251",Max_error_Pn ,e, Test.Case2(16),Test.Exp2(16));
		WebUI.clearText(phoneNumber);
		WebUI.setText(phoneNumber, "98765432100");
		WebUI.verifyElementVisible(Error_PhoneNumberMessage);
		WebUI.verifyContains(getTextElement(Error_PhoneNumberMessage).trim(), Max_error_Pn);

//		C.Send_verify_Valid_C(driver, phoneNumber, e, "1254815225", Test.Case2(13),Test.Exp2(13));
//		WebUI.clearAndFillText(phoneNumber, PropertiesHelpers.getValue("phone_Number"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(phoneNumber, "value"), PropertiesHelpers.getValue("phone_Number"));
		String RandomPhoneumber = DataGenerateUtils.randomPhoneNumber();
		WebUI.clearAndFillText(phoneNumber,RandomPhoneumber);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(phoneNumber,"value"),RandomPhoneumber);
//		C.Empty_Input(driver, Error_Address_1_Message, Mandatory_Error, e, Test.Case2(19),Test.Exp2(19));
		WebUI.verifyContains(getTextElement(Error_Address_1_Message).trim(), Mandatory_Error);

//		C.Max_Char(driver, Address_1_Message, Error_Address_1_Message, Add_Max,Max_error,e, Test.Case2(20),Test.Exp2(20));
		WebUI.clearText(Address_1_Message);
		WebUI.setText(Address_1_Message, Add_Max);
		WebUI.verifyElementVisible(Error_Address_1_Message);
		WebUI.verifyContains(getTextElement(Error_Address_1_Message).trim(), Max_error);

//		C.Send_verify_Valid_C(driver, Address_1_Message, e, "7412 PINNACLE POINT", Test.Case2(18),Test.Exp2(18));
//		WebUI.clearAndFillText(Address_1_Message, PropertiesHelpers.getValue("address_1"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(Address_1_Message, "value"), PropertiesHelpers.getValue("address_1"));
		String RandomAddress = DataGenerateUtils.randomShortAddress();
		WebUI.clearAndFillText(Address_1_Message,RandomAddress);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(Address_1_Message,"value"),RandomAddress);
//		C.Max_Char(driver, Address_2_Message, Error_Address_2_Message, Add_Max,Max_error,e, Test.Case2(22),Test.Exp2(22));
		WebUI.clearText(Address_2_Message);
		WebUI.setText(Address_2_Message, Add_Max);
		WebUI.verifyElementVisible(Error_Address_2_Message);
		WebUI.verifyContains(getTextElement(Error_Address_2_Message).trim(), Max_error);

//		C.Send_verify_Valid_C(driver, Address_2_Message, e, "668 WOODSIDE DR", Test.Case2(21),Test.Exp2(21));
		WebUI.clearAndFillText(Address_2_Message, PropertiesHelpers.getValue("address_2"));
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(Address_2_Message, "value"), PropertiesHelpers.getValue("address_2"));

//		C.Empty_Input(driver, Error_ZipCode_Message, Mandatory_Error, e, Test.Case2(28),Test.Exp2(28));
		WebUI.verifyContains(getTextElement(Error_ZipCode_Message).trim(), Mandatory_Error);

//		C.Max_Char(driver, ZipCode, Error_ZipCode_Message,"1234",Min_error_Zp,e, Test.Case2(24),Test.Exp2(24));
		WebUI.clearText(ZipCode);
		WebUI.setText(ZipCode, "1234");
		WebUI.verifyElementVisible(Error_ZipCode_Message);
		WebUI.verifyContains(getTextElement(Error_ZipCode_Message).trim(), Min_error_Zp);

//		C.Max_Char(driver, ZipCode, Error_ZipCode_Message,"123456",Max_error_Zp,e, Test.Case2(25),Test.Exp2(25));
		WebUI.clearText(ZipCode);
		WebUI.setText(ZipCode, "123456");
		WebUI.verifyElementVisible(Error_ZipCode_Message);
		WebUI.verifyContains(getTextElement(Error_ZipCode_Message).trim(), Max_error_Zp);

//		C.Send_verify_Valid_C(driver, ZipCode, e, "67801", Test.Case2(23),Test.Exp2(23));
		WebUI.clearAndFillText(ZipCode, PropertiesHelpers.getValue("zip_Code"));
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(ZipCode, "value"), PropertiesHelpers.getValue("zip_Code"));
//		String RandomZipCode = DataGenerateUtils.randomZipCode();
//		WebUI.clearAndFillText(ZipCode,RandomZipCode);
//		WebUI.sleep(1);
//		System.out.println(FrameworkConstants.LOCATE);
//		WebUI.verifyContains(getAttributeElement(ZipCode,"value"),RandomZipCode);

//		C.Mandate_Click1(driver, act, Proposed_ZipCode, e, Test.Case2(26),Test.Exp2(26));
		WebUI.moveToElement(Proposed_ZipCode);
		WebUI.clickElement(Proposed_ZipCode);

//		C.Scroll_Click(driver, wait, act, NextStep2, e, Test.Case2(37),Test.Exp2(37));
		WebUI.scrollToElementAtBottom(NextStep2);
		WebUI.waitForElementVisible(NextStep2);
		WebUI.clickElement(NextStep2);

//		C.Empty_Input(driver, Error_City_Message, Mandatory_Error, e, Test.Case2(31),Test.Exp2(31));
		WebUI.verifyContains(getTextElement(Error_City_Message).trim(), Mandatory_Error);
		WebUI.sleep(1);

//		C.W_C2(driver, wait, city, CitySelection, e, Test.Case2(30),Test.Exp2(30));
		WebUI.waitForElementVisible(city);
		WebUI.clickElement(city);
		WebUI.sleep(1);
		WebUI.waitForElementVisible(CitySelection);
		WebUI.clickElement(CitySelection);

//		C.Mandate_Click(driver, NextStep2, e, Test.Case2(36),Test.Exp2(36));
		WebUI.clickElement(NextStep2);
		
//		C.Fields(driver, ZipCode, e,Test.Case2(2),Test.Exp2(2));
//		
//		C.Fields(driver, ZipCode, e,Test.Case2(29),Test.Exp2(29));
//		
//		C.Fields(driver, ZipCode, e,Test.Case2(32),Test.Exp2(32));
//		
//		C.Fields(driver, ZipCode, e,Test.Case2(33),Test.Exp2(33));
//		
//		C.Fields(driver, ZipCode, e,Test.Case2(34),Test.Exp2(34));
//		
//		C.Fields(driver, ZipCode, e,Test.Case2(38),Test.Exp2(38));
		
//70
	}

}
