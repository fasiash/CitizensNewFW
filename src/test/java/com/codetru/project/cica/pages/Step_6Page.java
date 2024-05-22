package com.codetru.project.cica.pages;

import static com.anhtester.keywords.WebUI.getTextElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.anhtester.keywords.WebUI;

public class Step_6Page {

//	@FindBy(xpath = "(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[5]")
	private By NextStep6 = By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[5]");

//	@FindBy(xpath = "//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated']")
	private By Error_HealthQuestions_1 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated']");

//	@FindBy(xpath = "//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[2]/ion-row/ion-col[@class='md hydrated']")
	private By Error_HealthQuestions_2 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[2]/ion-row/ion-col[@class='md hydrated']");

//	@FindBy(xpath = "//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[3]/ion-row/ion-col[@class='md hydrated']")
	private By Error_HealthQuestions_3 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[3]/ion-row/ion-col[@class='md hydrated']");

//	@FindBy(xpath = "//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[4]/ion-row/ion-col[@class='md hydrated']")
	private By Error_HealthQuestions_4 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[4]/ion-row/ion-col[@class='md hydrated']");

//	@FindBy(xpath = "//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[5]/ion-row/ion-col[@class='md hydrated']")
	private By Error_HealthQuestions_5 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[5]/ion-row/ion-col[@class='md hydrated']");

//	@FindBy(xpath = "//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[6]/ion-row/ion-col[@class='md hydrated']")
	private By Error_HealthQuestions_6 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[6]/ion-row/ion-col[@class='md hydrated']");

//	@FindBy(xpath = "//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[7]/ion-row/ion-col[@class='md hydrated']")
	private By Error_HealthQuestions_7 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[7]/ion-row/ion-col[@class='md hydrated']");

//	@FindBy(xpath = "//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[8]/ion-row/ion-col[@class='md hydrated']")
	private By Error_HealthQuestions_8 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[8]/ion-row/ion-col[@class='md hydrated']");

//	@FindBy(xpath = "(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[3]")
	private By HealthQuestions1 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[3]");

//	@FindBy(xpath = "(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[4]")
	private By HealthQuestions2 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[4]");

//	@FindBy(xpath = "(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[5]")
	private By HealthQuestions3 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[5]");

//	@FindBy(xpath = "(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[6]")
	private By HealthQuestions4 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[6]");

//	@FindBy(xpath = "(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[7]")
	private By HealthQuestions5 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[7]");

//	@FindBy(xpath = "(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[8]")
	private By HealthQuestions6 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[8]");

//	@FindBy(xpath = "(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[9]")
	private By HealthQuestions7 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[9]");

//	@FindBy(xpath = "(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[10]")
	private By HealthQuestions8 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[10]");

//	@FindBy(xpath = "//ion-checkbox[@formcontrolname='PhysicianNameCheckbox']")
	private By no_physician = By.xpath("//ion-checkbox[@formcontrolname='PhysicianNameCheckbox']");

//	@FindBy(xpath = "//ion-input[@formcontrolname='PhysicianName']/parent::ion-item/parent::ion-col")
	private By Error_NoPhysicanCheckBox = By.xpath("//ion-input[@formcontrolname='PhysicianName']/parent::ion-item/parent::ion-col");

//	@FindBy(xpath = "(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[6]")
	private By NextStep7 = By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[6]");

//	@FindBy(xpath = "//ion-input[@formcontrolname='PhysicianName']")
	private By Physician_textbox = By.xpath("//ion-input[@formcontrolname='PhysicianName']");

	public void Predetermination_Questions() throws Exception {

		String Mandatory_Err = "Please enter a value.";

//		C.Mandate_Click1(driver, act, NextStep6, e, Test.Case6(27), Test.Exp6(27));
		WebUI.moveToElement(NextStep6);
		WebUI.sleep(0.5);
		WebUI.clickElement(NextStep6);

//		C.Health_Question_M(driver, act, Error_HealthQuestions_1, Mandatory_Err, e, Test.Case6(3), Test.Exp6(3));
		WebUI.scrollToElementAtBottom(Error_HealthQuestions_1);
		WebUI.sleep(0.5);
		WebUI.verifyElementVisible(Error_HealthQuestions_1);
		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_1).trim(), Mandatory_Err);

//		C.Health_Question_M(driver, act, Error_HealthQuestions_2, Mandatory_Err, e, Test.Case6(6), Test.Exp6(6));
		WebUI.scrollToElementAtBottom(Error_HealthQuestions_2);
		WebUI.sleep(0.5);
		WebUI.verifyElementVisible(Error_HealthQuestions_2);
		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_2).trim(), Mandatory_Err);

//		C.Health_Question_M(driver, act, Error_HealthQuestions_4, Mandatory_Err, e, Test.Case6(9), Test.Exp6(9));
		WebUI.scrollToElementAtBottom(Error_HealthQuestions_4);
		WebUI.sleep(0.5);
		WebUI.verifyElementVisible(Error_HealthQuestions_4);
		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_4).trim(), Mandatory_Err);

//		C.Health_Question_M(driver, act, Error_HealthQuestions_4, Mandatory_Err, e, Test.Case6(12), Test.Exp6(12));
		WebUI.scrollToElementAtBottom(Error_HealthQuestions_4);
		WebUI.sleep(0.5);
		WebUI.verifyElementVisible(Error_HealthQuestions_4);
		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_4).trim(), Mandatory_Err);

//		C.act_scroll1(driver, act, Error_HealthQuestions_7, e, Mandatory_Err, Mandatory_Err);
		WebUI.scrollToElementAtBottom(Error_HealthQuestions_7);
		WebUI.sleep(0.5);
		WebUI.verifyElementVisible(Error_HealthQuestions_7);

//		C.Health_Question_M(driver, act, Error_HealthQuestions_5, Mandatory_Err, e, Test.Case6(15), Test.Exp6(15));
		WebUI.scrollToElementAtBottom(Error_HealthQuestions_5);
		WebUI.sleep(0.5);
		WebUI.verifyElementVisible(Error_HealthQuestions_5);
		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_5).trim(), Mandatory_Err);
		
//		Thread.sleep(2000);
		WebUI.sleep(0.5);

//		C.Health_Question_M(driver, act, Error_HealthQuestions_6, Mandatory_Err, e, Test.Case6(18), Test.Exp6(18));
		WebUI.scrollToElementAtBottom(Error_HealthQuestions_6);
		WebUI.sleep(0.5);
		WebUI.verifyElementVisible(Error_HealthQuestions_6);
		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_6).trim(), Mandatory_Err);

//		C.Health_Question_M(driver, act, Error_HealthQuestions_7, Mandatory_Err, e, Test.Case6(21), Test.Exp6(21));
		WebUI.scrollToElementAtBottom(Error_HealthQuestions_7);
		WebUI.sleep(0.5);
		WebUI.verifyElementVisible(Error_HealthQuestions_7);
		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_7).trim(), Mandatory_Err);
		
//		C.act_scroll1(driver, act, no_physician, e, Mandatory_Err, Mandatory_Err);
		WebUI.scrollToElementAtBottom(no_physician);
		WebUI.sleep(0.5);
		WebUI.verifyElementVisible(no_physician);
		
//		C.Health_Question_M(driver, act, Error_HealthQuestions_8, Mandatory_Err, e, Test.Case6(24), Test.Exp6(24));
		WebUI.scrollToElementAtBottom(Error_HealthQuestions_8);
		WebUI.sleep(0.5);
		WebUI.verifyElementVisible(Error_HealthQuestions_8);
		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_8).trim(), Mandatory_Err);

//		Thread.sleep(2000);
		WebUI.sleep(2);

//		C.Health_Question_C(driver, act, HealthQuestions1, "1", e, Test.Case6(2), Test.Exp6(2));
		WebUI.scrollToElementAtBottom(HealthQuestions1);
		WebUI.sleep(0.5);
		WebUI.clickElement(HealthQuestions1);
		
//		C.Health_Question_C(driver, act, HealthQuestions2, "2", e, Test.Case6(5), Test.Exp6(5));
		WebUI.scrollToElementAtBottom(HealthQuestions2);
		WebUI.sleep(0.5);
		WebUI.clickElement(HealthQuestions2);
//		WebUI.sleep(0.5);

//		C.Health_Question_C(driver, act, HealthQuestions3, "3", e, Test.Case6(8), Test.Exp6(8));
		WebUI.scrollToElementAtBottom(HealthQuestions3);
		WebUI.sleep(0.5);
		WebUI.clickElement(HealthQuestions3);
//		WebUI.sleep(0.5);

//		C.Health_Question_C(driver, act, HealthQuestions4, "4", e, Test.Case6(11), Test.Exp6(11));
		WebUI.scrollToElementAtBottom(HealthQuestions4);
		WebUI.sleep(0.5);
		WebUI.clickElement(HealthQuestions4);
//		WebUI.sleep(0.5);

//		C.Health_Question_C(driver, act, HealthQuestions5, "5", e, Test.Case6(14), Test.Exp6(14));
		WebUI.scrollToElementAtBottom(HealthQuestions5);
		WebUI.sleep(0.5);
		WebUI.clickElement(HealthQuestions5);
//		WebUI.sleep(0.5);

//		C.Health_Question_C(driver, act, HealthQuestions6, "6", e, Test.Case6(17), Test.Exp6(17));
		WebUI.scrollToElementAtBottom(HealthQuestions6);
		WebUI.sleep(0.5);
		WebUI.clickElement(HealthQuestions6);
//		WebUI.sleep(0.5);

//		C.Health_Question_C(driver, act, HealthQuestions7, "7", e, Test.Case6(20), Test.Exp6(20));
		WebUI.scrollToElementAtBottom(HealthQuestions7);
		WebUI.sleep(0.5);
		WebUI.clickElement(HealthQuestions7);
//		WebUI.sleep(0.5);

//		C.Health_Question_C(driver, act, HealthQuestions8, "8", e, Test.Case6(23), Test.Exp6(23));
		WebUI.scrollToElementAtBottom(HealthQuestions8);
		WebUI.sleep(0.5);
		WebUI.clickElement(HealthQuestions8);
//		WebUI.sleep(0.5);

//		C.act_scroll1(driver, act, NextStep6, e, Test.Case6(29), Test.Exp6(29));
		WebUI.scrollToElementAtBottom(NextStep6);
		WebUI.sleep(0.5);
		WebUI.verifyElementVisible(NextStep6);

//		C.Empty_Input(driver, Error_NoPhysicanCheckBox, Mandatory_Err, e, Test.Case6(25), Test.Exp6(25));
		WebUI.verifyContains(getTextElement(Error_NoPhysicanCheckBox).trim(), Mandatory_Err);

//		C.Mandate_Click(driver, no_physician, e, Test.Case6(26), Test.Exp6(26));
		WebUI.clickElement(no_physician);

//		C.Mandate_Click(driver, NextStep6, e, Test.Case6(28), Test.Exp6(28));
		WebUI.clickElement(NextStep6);

//		C.Fields(driver, NextStep6, e, Test.Case6(1), Test.Exp6(1));
//		C.Fields(driver, NextStep6, e, Test.Case6(4), Test.Exp6(4));
//		C.Fields(driver, NextStep6, e, Test.Case6(7), Test.Exp6(7));
//		C.Fields(driver, NextStep6, e, Test.Case6(10), Test.Exp6(10));
//		C.Fields(driver, NextStep6, e, Test.Case6(13), Test.Exp6(13));
//		C.Fields(driver, NextStep6, e, Test.Case6(16), Test.Exp6(16));
//		C.Fields(driver, NextStep6, e, Test.Case6(19), Test.Exp6(19));
//		C.Fields(driver, NextStep6, e, Test.Case6(22), Test.Exp6(22));
//142
		
	}
}
