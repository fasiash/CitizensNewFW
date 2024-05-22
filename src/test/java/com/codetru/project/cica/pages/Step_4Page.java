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


public class Step_4Page extends CommonPageCICA {


//	@FindBy(xpath = "(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[3]")
	private By NextStep4 = By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[3]"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryFirstName']/input")
	private By BenificiaryFirstname = By.xpath("//ion-input[@formcontrolname='BeneficiaryFirstName']/input");
	
//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryBusinessName']/input")
	private By Business_name = By.xpath("//ion-input[@formcontrolname='BeneficiaryBusinessName']/input");

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '8' and @size='24'])[6]")
	private By Error_BenificicartFirstName_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '8' and @size='24'])[6]"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryMiddleName']/input")
	private By BenificiaryMiddlename = By.xpath("//ion-input[@formcontrolname='BeneficiaryMiddleName']/input"); 

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '8' and @size='24'])[7]")
	private By Error_BenificicartMiddleName_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '8' and @size='24'])[7]"); 

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '8' and @size='24'])[8]")
	private By Error_BenificicaryLastName_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '8' and @size='24'])[8]"); 

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '24' and @size='24'])[4]")
	private By Error_BenificicaryAddress_1_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '24' and @size='24'])[4]"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryLastName']/input")
	private By BenificiaryLastname = By.xpath("//ion-input[@formcontrolname='BeneficiaryLastName']/input");

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryAddress1']/input")
	private By BenificiaryAddress_1 = By.xpath("//ion-input[@formcontrolname='BeneficiaryAddress1']/input");

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryAddress2']/input")
	private By BenificiaryAddress_2 = By.xpath("//ion-input[@formcontrolname='BeneficiaryAddress2']/input"); 

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '24' and @size='24'])[5]")
	private By Error_MaximumBenificiaryAddress_2_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '24' and @size='24'])[5]"); 

//	@FindBy(xpath = "//ion-button[normalize-space()='Add Beneficiary']")
	private By AddBenificiary = By.xpath("//ion-button[normalize-space()='Add Beneficiary']"); 

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '10' and @size='24'])[2]")
	private By Error_BenificicaryCity_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '10' and @size='24'])[2]"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryCity']/input")
	private By BenificiaryCity = By.xpath("//ion-input[@formcontrolname='BeneficiaryCity']/input"); 

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '7' and @size='24'])[4]")
	private By Error_BenificicaryState_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '7' and @size='24'])[4]"); 

//	@FindBy(xpath = "//select[@formcontrolname='BeneficiaryState']")
	private By benificiaryState = By.xpath("//select[@formcontrolname='BeneficiaryState']"); 

//	@FindBy(xpath = "(//option[.=' Arizona'])[2]")
	private By Arizona_State = By.xpath("(//option[.=' Arizona'])[2]"); 

	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '7' and @size='24'])[5]")
	private By Error_BenificicaryZipCode_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '7' and @size='24'])[5]"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryZipCode']/input")
	private By benificiaryZipcode = By.xpath("//ion-input[@formcontrolname='BeneficiaryZipCode']/input"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryEmailAddress']/input")
	private By benificiaryEmailAddress = By.xpath("//ion-input[@formcontrolname='BeneficiaryEmailAddress']/input"); 

//	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[1]")
	private By Error_Message_BenificiaryEmailAddress = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[1]"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname= 'BeneficiaryPhone']/input")
	private By benificiaryPhone = By.xpath("//ion-input[@formcontrolname= 'BeneficiaryPhone']/input"); 

//	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[2]")
	private By Error_Message_MinimumBenificiaryPhone = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[2]"); 

//	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[3]")
	private By Error_Message_MinimumBenificiarySSN = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[3]"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiarySSN']/input")
	private By BenificiarySSN = By.xpath("//ion-input[@formcontrolname='BeneficiarySSN']/input"); 

//	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[4]")
	private By Error_Message_BenificiaryDOB = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[4]"); 

//	@FindBy(xpath = "//input[@formcontrolname='BeneficiaryBirthDate']")
	private By BenificiaryDOB = By.xpath("//input[@formcontrolname='BeneficiaryBirthDate']"); 

//	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[1]")
	private By Error_Message_BenificiaryPercent = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[1]"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryPercent']/input")
	private By BenificiaryPercent = By.xpath("//ion-input[@formcontrolname='BeneficiaryPercent']/input"); 

	@FindBy(xpath = "//p[normalize-space()='Primary Beneficiaries must equal 100']")
	private By benificiaryMaxPercentError = By.xpath("//p[normalize-space()='Primary Beneficiaries must equal 100']"); 

//	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[2]")
	private By Error_Message_BenificiaryRelationShip = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[2]"); 

//	@FindBy(xpath = "//select[@formcontrolname='BeneficiaryRelation']")
	private By Benificiaryrelation = By.xpath("//select[@formcontrolname='BeneficiaryRelation']"); 

	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[3]")
	private By error_Message_BenificiaryRelationShipForElementOthers = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[3]"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryOtherExplain']/input")
	private By benificiaryOthersRelationsship = By.xpath("//ion-input[@formcontrolname='BeneficiaryOtherExplain']/input"); 

//	@FindBy(xpath = "//option[.=' Other']")
	private By Other = By.xpath("//option[.=' Other']");

//	@FindBy(xpath="(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[4]")
	private By NextStep5 = By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[4]");


	public void Beneficiary_Information() throws Exception {


		String Max_Name = "sdfsadfgdfsfghfghxfghjdsfghdfghdfghjdfsghdsfghretyu";
		String Add_Max = "913 Alena Lakes Suite 843 35311 Kub Extensions Apt.Lakes Suite 843 ";
		String Max_error ="The maximum number of characters is 33.";
		String Max_error_ ="The maximum number of characters is 50";
		String Mandatory_Error = "Please enter a value.";
		String Min_error_Zp ="The minimum number of characters is 5.";
		String Max_error_Zp ="The maximum number of characters is 5.";
		String Min_error_Pn ="The minimum number of characters is 10.";
		String Max_error_Pn ="The maximum number of characters is 10.";
		String Min_error_ssn ="The minimum number of characters is 9.";
		String Max_error_ssn ="The maximum number of characters is 9.";
		String incorrect_email_error = "Email is not in the correct format";
		String benif_max_percentage_error = "Primary Beneficiaries must equal 100";
		

//		C.Scroll_C_scroll2(driver, act,NextStep4 , BenificiaryFirstname, e, Test.Case4(50), Test.Exp4(50));
		WebUI.scrollToElementAtBottom(NextStep4);
		WebUI.verifyElementClickable(NextStep4);
		WebUI.clickElement(NextStep4);
		WebUI.scrollToElementAtTop(BenificiaryFirstname);
		WebUI.verifyElementPresent(BenificiaryFirstname, "Error message not displayed");

//		C.Empty_Input(driver, Error_BenificicartFirstName_Message,Mandatory_Error , e, Test.Case4(5), Test.Exp4(5));
		WebUI.verifyContains(getTextElement(Error_BenificicartFirstName_Message).trim(), Mandatory_Error);

//		C.Max_Char(driver, BenificiaryFirstname, Error_BenificicartFirstName_Message, Max_Name,Max_error, e, Test.Case4(4), Test.Exp4(4));
		WebUI.clearText(BenificiaryFirstname);
		WebUI.setText(BenificiaryFirstname, Max_Name);
		WebUI.verifyElementVisible(Error_BenificicartFirstName_Message);
		WebUI.verifyContains(getTextElement(Error_BenificicartFirstName_Message).trim(), Max_error);

//		C.Send_verify_Valid_C(driver, BenificiaryFirstname, e, "Perry", Test.Case4(3), Test.Exp4(3));
//		WebUI.clearAndFillText(BenificiaryFirstname, PropertiesHelpers.getValue("benif_FName"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(BenificiaryFirstname, "value"), PropertiesHelpers.getValue("benif_FName"));
		String RandomBenificiaryfirstname = DataGenerateUtils.randomFirstName();
		WebUI.clearAndFillText(BenificiaryFirstname,RandomBenificiaryfirstname);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BenificiaryFirstname,"value"),RandomBenificiaryfirstname);
//		C.Max_Char(driver, BenificiaryMiddlename, Error_BenificicartMiddleName_Message, Max_Name,Max_error, e, Test.Case4(7), Test.Exp4(7));
		WebUI.clearText(BenificiaryMiddlename);
		WebUI.setText(BenificiaryMiddlename, Max_Name);
		WebUI.verifyElementVisible(Error_BenificicartMiddleName_Message);
		WebUI.verifyContains(getTextElement(Error_BenificicartMiddleName_Message).trim(), Max_error);

//		C.Send_verify_Valid_C(driver, BenificiaryMiddlename, e, "Cannyse", Test.Case4(6), Test.Exp4(6));
//		WebUI.clearAndFillText(BenificiaryMiddlename, PropertiesHelpers.getValue("benif_Mid_Name"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(BenificiaryMiddlename, "value"), PropertiesHelpers.getValue("benif_Mid_Name"));
		String RandomBenificiaryMiddlename = DataGenerateUtils.randomMiddleName();
		WebUI.clearAndFillText(BenificiaryMiddlename,RandomBenificiaryMiddlename);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BenificiaryMiddlename,"value"),RandomBenificiaryMiddlename);
//		C.Empty_Input(driver, Error_BenificicaryLastName_Message,Mandatory_Error , e, Test.Case4(10), Test.Exp4(10));
		WebUI.verifyContains(getTextElement(Error_BenificicaryLastName_Message).trim(), Mandatory_Error);

//		C.Max_Char(driver, BenificiaryLastname, Error_BenificicaryLastName_Message, Max_Name,Max_error, e, Test.Case4(9), Test.Exp4(9));
		WebUI.clearText(BenificiaryLastname);
		WebUI.setText(BenificiaryLastname, Max_Name);
		WebUI.verifyElementVisible(Error_BenificicaryLastName_Message);
		WebUI.verifyContains(getTextElement(Error_BenificicaryLastName_Message).trim(), Max_error);

//		C.Send_verify_Valid_C(driver, BenificiaryLastname, e, "Cormier", Test.Case4(8), Test.Exp4(8));
//		WebUI.clearAndFillText(BenificiaryLastname, PropertiesHelpers.getValue("benif_LName"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(BenificiaryLastname, "value"), PropertiesHelpers.getValue("benif_LName"));
		String RandomBenificiaryLastname = DataGenerateUtils.randomLastName();
		WebUI.clearAndFillText(BenificiaryLastname,RandomBenificiaryLastname);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BenificiaryLastname,"value"),RandomBenificiaryLastname);
//		C.Empty_Input(driver, Error_BenificicaryAddress_1_Message,Mandatory_Error, e, Test.Case4(12), Test.Exp4(12));
		WebUI.verifyContains(getTextElement(Error_BenificicaryAddress_1_Message).trim(), Mandatory_Error);

//		C.Max_Char(driver, BenificiaryAddress_1, Error_BenificicaryAddress_1_Message, Add_Max,Max_error, e, Test.Case4(13), Test.Exp4(13));
		WebUI.clearText(BenificiaryAddress_1);
		WebUI.setText(BenificiaryAddress_1, Add_Max);
		WebUI.verifyElementVisible(Error_BenificicaryAddress_1_Message);
		WebUI.verifyContains(getTextElement(Error_BenificicaryAddress_1_Message).trim(), Max_error);

//		C.Send_verify_Valid_C(driver, BenificiaryAddress_1, e, "31120 Thurman Course Suite 255", Test.Case4(11), Test.Exp4(11));
//		WebUI.clearAndFillText(BenificiaryAddress_1, PropertiesHelpers.getValue("benif_Address1"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(BenificiaryAddress_1, "value"), PropertiesHelpers.getValue("benif_Address1"));
		String RandomBenificiaryAddress = DataGenerateUtils.randomShortAddress();
		WebUI.clearAndFillText(BenificiaryAddress_1,RandomBenificiaryAddress);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BenificiaryAddress_1,"value"),RandomBenificiaryAddress);
//		C.Max_Char(driver, BenificiaryAddress_2, Error_MaximumBenificiaryAddress_2_Message, Add_Max,Max_error, e, Test.Case4(15), Test.Exp4(15));
		WebUI.clearText(BenificiaryAddress_2);
		WebUI.setText(BenificiaryAddress_2, Add_Max);
		WebUI.verifyElementVisible(Error_MaximumBenificiaryAddress_2_Message);
		WebUI.verifyContains(getTextElement(Error_MaximumBenificiaryAddress_2_Message).trim(), Max_error);

//		C.Send_verify_Valid_C(driver, BenificiaryAddress_2, e, "913 Alena Lakes Suite 843", Test.Case4(14), Test.Exp4(14));
//		WebUI.clearAndFillText(BenificiaryAddress_2, PropertiesHelpers.getValue("benif_Address2"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(BenificiaryAddress_2, "value"), PropertiesHelpers.getValue("benif_Address2"));
		String RandomBenificiaryAddress_2 = DataGenerateUtils.randomShortAddress();
		WebUI.clearAndFillText(BenificiaryAddress_2,RandomBenificiaryAddress_2);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BenificiaryAddress_2,"value"),RandomBenificiaryAddress_2);
//		C.act_scroll1(driver, act, AddBenificiary, e, Test.Case4(52), Test.Exp4(52));
		WebUI.scrollToElementAtBottom(AddBenificiary);
		WebUI.verifyElementVisible(AddBenificiary);

//		C.Empty_Input(driver, Error_BenificicaryCity_Message,Mandatory_Error, e, Test.Case4(53), Test.Exp4(53));
		WebUI.verifyContains(getTextElement(Error_BenificicaryCity_Message).trim(), Mandatory_Error);
		
//		C.Max_Char(driver, BenificiaryCity, Error_BenificicaryCity_Message, Max_Name,Max_error, e, Test.Case4(54), Test.Exp4(54));
		WebUI.clearText(BenificiaryCity);
		WebUI.setText(BenificiaryCity, Max_Name);
		WebUI.verifyElementVisible(Error_BenificicaryCity_Message);
		WebUI.verifyContains(getTextElement(Error_BenificicaryCity_Message).trim(), Max_error);

//		C.Send_verify_Valid_C(driver, BenificiaryCity, e, "Arizona City", Test.Case4(55), Test.Exp4(55));
//		WebUI.clearAndFillText(BenificiaryCity, PropertiesHelpers.getValue("benif_City"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(BenificiaryCity, "value"), PropertiesHelpers.getValue("benif_City"));
		String RandomBenificiaryCity = DataGenerateUtils.randomCity();
		WebUI.clearAndFillText(BenificiaryCity,RandomBenificiaryCity);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BenificiaryCity,"value"),RandomBenificiaryCity);
//		C.Empty_Input(driver, Error_BenificicaryState_Message,Mandatory_Error, e, Test.Case4(56), Test.Exp4(56));
		WebUI.verifyContains(getTextElement(Error_BenificicaryState_Message).trim(), Mandatory_Error);

//		C.W_C2(driver, wait, benificiaryState, Arizona_State, e, Test.Case4(19), Test.Exp4(19));
		WebUI.waitForElementVisible(benificiaryState);
		WebUI.clickElement(benificiaryState);
		WebUI.sleep(1);
		WebUI.waitForElementVisible(Arizona_State);
		WebUI.clickElement(Arizona_State);
		
//		C.Empty_Input(driver, Error_BenificicaryZipCode_Message,Mandatory_Error , e, Test.Case4(24), Test.Exp4(24));
		WebUI.verifyContains(getTextElement(Error_BenificicaryZipCode_Message).trim(), Mandatory_Error);

//		C.Max_Char(driver, benificiaryZipcode, Error_BenificicaryZipCode_Message, "345",
//				Min_error_Zp, e, Test.Case4(21), Test.Exp4(21));
		WebUI.clearText(benificiaryZipcode);
		WebUI.setText(benificiaryZipcode, "345");
		WebUI.verifyElementVisible(Error_BenificicaryZipCode_Message);
		WebUI.verifyContains(getTextElement(Error_BenificicaryZipCode_Message).trim(), Min_error_Zp);

//		C.Max_Char(driver, benificiaryZipcode, Error_BenificicaryZipCode_Message, "3453456",
//				Max_error_Zp, e, Test.Case4(22), Test.Exp4(22));
		WebUI.clearText(benificiaryZipcode);
		WebUI.setText(benificiaryZipcode, "3456789");
		WebUI.verifyElementVisible(Error_BenificicaryZipCode_Message);
		WebUI.verifyContains(getTextElement(Error_BenificicaryZipCode_Message).trim(), Max_error_Zp);

//		C.Send_verify_Valid_C(driver, benificiaryZipcode, e, "67801", Test.Case4(20), Test.Exp4(20));
//		WebUI.clearAndFillText(benificiaryZipcode, PropertiesHelpers.getValue("benif_Zip"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(benificiaryZipcode, "value"), PropertiesHelpers.getValue("benif_Zip"));
		String RandomBenificiaryZipcode = DataGenerateUtils.randomZipCode();
		WebUI.clearAndFillText(benificiaryZipcode,RandomBenificiaryZipcode);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(benificiaryZipcode,"value"),RandomBenificiaryZipcode);
//		C.Max_Char(driver, benificiaryEmailAddress, Error_Message_BenificiaryEmailAddress, "asdsaf",
//				"Email is not in the correct format", e, Test.Case4(26), Test.Exp4(26));
		WebUI.clearText(benificiaryEmailAddress);
		WebUI.setText(benificiaryEmailAddress, "asdsaf");
		WebUI.verifyElementVisible(Error_Message_BenificiaryEmailAddress);
		WebUI.verifyContains(getTextElement(Error_Message_BenificiaryEmailAddress).trim(), incorrect_email_error);

//		C.Max_Char(driver, benificiaryEmailAddress, Error_Message_BenificiaryEmailAddress, Max_Name,Max_error_, e, Test.Case4(27), Test.Exp4(27));
		WebUI.clearText(benificiaryEmailAddress);
		WebUI.setText(benificiaryEmailAddress, Max_Name);
		WebUI.verifyElementVisible(Error_Message_BenificiaryEmailAddress);
		WebUI.verifyContains(getTextElement(Error_Message_BenificiaryEmailAddress).trim(), Max_error_);
////100
//		C.Send_verify_Valid_C(driver, benificiaryEmailAddress, e, "none@one.com", Test.Case4(25), Test.Exp4(25));
//		WebUI.clearAndFillText(benificiaryEmailAddress, PropertiesHelpers.getValue("benif_email"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(benificiaryEmailAddress, "value"), PropertiesHelpers.getValue("benif_email"));
		String RandomBenificiaryEmail = DataGenerateUtils.randomEmail();
		WebUI.clearAndFillText(benificiaryEmailAddress,RandomBenificiaryEmail);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(benificiaryEmailAddress,"value"),RandomBenificiaryEmail);
//		C.Max_Char(driver, benificiaryPhone, Error_Message_MinimumBenificiaryPhone, "124",
//				Min_error_Pn, e, Test.Case4(31), Test.Exp4(31));
		WebUI.clearText(benificiaryPhone);
		WebUI.setText(benificiaryPhone, "123");
		WebUI.verifyElementVisible(Error_Message_MinimumBenificiaryPhone);
		WebUI.verifyContains(getTextElement(Error_Message_MinimumBenificiaryPhone).trim(), Min_error_Pn);

//		C.Max_Char(driver, benificiaryPhone, Error_Message_MinimumBenificiaryPhone, "12487451245871",
//				Max_error_Pn, e, Test.Case4(32), Test.Exp4(32));
		WebUI.clearText(benificiaryPhone);
		WebUI.setText(benificiaryPhone, "12487451245871");
		WebUI.verifyElementVisible(Error_Message_MinimumBenificiaryPhone);
		WebUI.verifyContains(getTextElement(Error_Message_MinimumBenificiaryPhone).trim(), Max_error_Pn);

//		C.Send_verify_Valid_C(driver, benificiaryPhone, e, "1254874512", Test.Case4(29), Test.Exp4(29));
//		WebUI.clearAndFillText(benificiaryPhone, PropertiesHelpers.getValue("benif_phone"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(benificiaryPhone, "value"), PropertiesHelpers.getValue("benif_phone"));
		String RandomBenificiaryPhone = DataGenerateUtils.randomPhoneNumber();
		WebUI.clearAndFillText(benificiaryPhone,RandomBenificiaryPhone);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(benificiaryPhone,"value"),RandomBenificiaryPhone);
//		C.Empty_Input(driver, Error_Message_MinimumBenificiarySSN,Mandatory_Error , e, Test.Case4(38), Test.Exp4(38));
		WebUI.verifyContains(getTextElement(Error_Message_MinimumBenificiarySSN).trim(), Mandatory_Error);

//		C.Max_Char(driver, BenificiarySSN, Error_Message_MinimumBenificiarySSN, "12345",
//				Min_error_ssn, e, Test.Case4(36), Test.Exp4(36));
		WebUI.clearText(BenificiarySSN);
		WebUI.setText(BenificiarySSN, "12345");
		WebUI.verifyElementVisible(Error_Message_MinimumBenificiarySSN);
		WebUI.verifyContains(getTextElement(Error_Message_MinimumBenificiarySSN).trim(), Min_error_ssn);

//		C.Max_Char(driver, BenificiarySSN, Error_Message_MinimumBenificiarySSN, "123455874512", 
//				Max_error_ssn, e, Test.Case4(37), Test.Exp4(37));
		WebUI.clearText(BenificiarySSN);
		WebUI.setText(BenificiarySSN, "123455874512");
		WebUI.verifyElementVisible(Error_Message_MinimumBenificiarySSN);
		WebUI.verifyContains(getTextElement(Error_Message_MinimumBenificiarySSN).trim(), Max_error_ssn);
		
//		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(1), Test.Exp4(1));
//		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(2), Test.Exp4(2));
//		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(59), Test.Exp4(59));
//		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(60), Test.Exp4(59));
		
//		C.Send_verify_Valid_C(driver, BenificiarySSN, e, "345845123", Test.Case4(34), Test.Exp4(34));
//		WebUI.clearAndFillText(BenificiarySSN, PropertiesHelpers.getValue("benif_ssn"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(BenificiarySSN, "value"), PropertiesHelpers.getValue("benif_ssn"));
		String RandomBenificiarySSN = DataGenerateUtils.randomSSNNumber();
		WebUI.clearAndFillText(BenificiarySSN,RandomBenificiarySSN);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BenificiarySSN,"value"),RandomBenificiarySSN);
//		C.Empty_Input(driver, Error_Message_BenificiaryDOB,Mandatory_Error , e, Test.Case4(40), Test.Exp4(40));
		WebUI.verifyContains(getTextElement(Error_Message_BenificiaryDOB).trim(), Mandatory_Error);

//		C.DOB_(driver, BenificiaryDOB, "01011974", e, Test.Case4(39), Test.Exp4(39));
//		WebUI.setText(BenificiaryDOB, PropertiesHelpers.getValue("benif_Dob"));
		String RandomBenificiaryDOB = DataGenerateUtils.randomDateOfBirthDDMMYYYY();
		WebUI.clearAndFillText(BenificiaryDOB,RandomBenificiaryDOB);
		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(BenificiaryDOB,"value"),RandomBenificiaryDOB);
		System.out.println("Generated DOB: "+RandomBenificiaryDOB);
		System.out.println("Attribute DOB: "+getAttributeElement(BenificiaryDOB,"value"));
		
//		C.Empty_Input(driver, Error_Message_BenificiaryPercent,Mandatory_Error , e, Test.Case4(57), Test.Exp4(57));
		WebUI.verifyContains(getTextElement(Error_Message_BenificiaryPercent).trim(), Mandatory_Error);

//		C.Max_Char(driver, BenificiaryPercent, benificiaryMaxPercentError, "120", "Primary Beneficiaries must equal 100", 
//				e, Test.Case4(44), Test.Exp4(44));
		WebUI.clearText(BenificiaryPercent);
		WebUI.setText(BenificiaryPercent, "123455874512");
		WebUI.verifyElementVisible(benificiaryMaxPercentError);
		WebUI.verifyContains(getTextElement(benificiaryMaxPercentError).trim(), benif_max_percentage_error);

//		C.Send_verify_Valid_C(driver, BenificiaryPercent, e, "100", Test.Case4(43), Test.Exp4(43));
		WebUI.clearAndFillText(BenificiaryPercent, "100");
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BenificiaryPercent, "value"), "100");

//		C.Empty_Input(driver,Error_Message_BenificiaryRelationShip,Mandatory_Error, e, Test.Case4(49), Test.Exp4(49));
		WebUI.verifyContains(getTextElement(Error_Message_BenificiaryRelationShip).trim(), Mandatory_Error);

//		C.Dropdown_Verify(driver, Benificiaryrelation, Other, error_Message_BenificiaryRelationShipForElementOthers,
//				"Please Explain Other Relationship", e, Test.Case4(58), Test.Exp4(58));
		WebUI.clickElement(Benificiaryrelation);
		WebUI.sleep(1);
		WebUI.clickElement(Other);
		WebUI.sleep(2);
		WebUI.clickElement(Benificiaryrelation);
		WebUI.sleep(1);
		WebUI.isElementVisible(error_Message_BenificiaryRelationShipForElementOthers, 2);
		WebUI.verifyContains(getTextElement(error_Message_BenificiaryRelationShipForElementOthers).trim(), "Please Explain Other Relationship");

//		C.Send_verify_Valid(driver, benificiaryOthersRelationsship, e, "Others", Test.Case4(48), Test.Exp4(48));
		WebUI.clearAndFillText(benificiaryOthersRelationsship, "Others");
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(benificiaryOthersRelationsship, "value"), "Others");

//		C.page_Navigation(driver, act, NextStep4,NextStep5 , e, Test.Case4(51), Test.Exp4(51));
		WebUI.moveToElement(NextStep4);
		WebUI.sleep(1);
		WebUI.clickElement(NextStep4);
		WebUI.waitForPageLoaded();
		WebUI.verifyElementVisible(NextStep5);
		
//		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(16), Test.Exp4(16));
//		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(17), Test.Exp4(17));
//		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(18), Test.Exp4(18));
//		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(23), Test.Exp4(23));
//		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(28), Test.Exp4(28));
//		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(30), Test.Exp4(30));
//		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(33), Test.Exp4(33));
//		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(35), Test.Exp4(35));
//		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(41), Test.Exp4(41));
//		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(42), Test.Exp4(42));
//		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(35), Test.Exp4(35));
//		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(45), Test.Exp4(45));
//		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(46), Test.Exp4(46));
//		C.Fields(driver, BenificiaryFirstname, e, Test.Case4(47), Test.Exp4(47));
		
	//117
		
		}


}
