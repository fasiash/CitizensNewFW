package com.codetru.project.cica.pages;

import static com.anhtester.keywords.WebUI.getTextElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.anhtester.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;

public class Step_5Page extends CommonPageCICA {

//	@FindBy(xpath = "(//ion-label[text()='No ']/following-sibling::ion-radio[@slot='start'])[1]")
	private By exist_no = By.xpath("(//ion-label[text()='No ']/following-sibling::ion-radio[@slot='start'])[1]");

//	@FindBy(xpath = "(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[4]")
	private By NextStep5 = By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[4]");

//	@FindBy(xpath = "(//h3[text()='Existing Insurance']/following-sibling::ion-row[@class='md hydrated'])[1]")
	private By error_Message_ExistingInsurQuest_1 = By.xpath("(//h3[text()='Existing Insurance']/following-sibling::ion-row[@class='md hydrated'])[1]");

//	@FindBy(xpath = "(//h3[text()='Existing Insurance']/following-sibling::ion-row[@class='md hydrated'])[2]")
	private By error_Message_ExistingInsurQuest_2 = By.xpath("(//h3[text()='Existing Insurance']/following-sibling::ion-row[@class='md hydrated'])[2]");

//	@FindBy(xpath = "(//ion-label[text()='No ']/following-sibling::ion-radio[@slot='start'])[1]")
	private By ExitingInsurance_Question_1 = By.xpath("(//ion-label[text()='No ']/following-sibling::ion-radio[@slot='start'])[1]");

//	@FindBy(xpath = "//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated']")
	private By Error_HealthQuestions_1 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated']");

	public void Existing_Insurance() throws Exception {

		String Mandatory_Error = "Please enter a value.";

		WebUI.sleep(1);
//		C.Mandate_Click1(driver, act, NextStep5, e, Test.Case5(7), Test.Exp5(7));
		WebUI.moveToElement(NextStep5);
		WebUI.sleep(1);
		WebUI.clickElement(NextStep5);

//		C.Fields(driver, ExitingInsurance_Question_1, e, Test.Case5(2), Test.Exp5(2));

//		C.Empty_Input(driver, error_Message_ExistingInsurQuest_1, Mandatory_Error, e, Test.Case5(4), Test.Exp5(4));
		WebUI.verifyContains(getTextElement(error_Message_ExistingInsurQuest_1).trim(), Mandatory_Error);

//		C.Fields(driver, ExitingInsurance_Question_1, e, Test.Case5(3), Test.Exp5(3));
//		C.Fields(driver, ExitingInsurance_Question_1, e, Test.Case5(1), Test.Exp5(1));
//		C.Fields(driver, ExitingInsurance_Question_1, e, Test.Case5(5), Test.Exp5(5));

//		C.Empty_Input(driver, error_Message_ExistingInsurQuest_2, Mandatory_Error, e, Test.Case5(8), Test.Exp5(8));
		WebUI.verifyContains(getTextElement(error_Message_ExistingInsurQuest_2).trim(), Mandatory_Error);

//		C.step_5_(driver, ExitingInsurance_Question_1, NextStep5, Error_HealthQuestions_1, e, Test.Case5(6), Test.Exp5(6));
		WebUI.clickElement(ExitingInsurance_Question_1);
		WebUI.clickElement(NextStep5);
		WebUI.verifyElementVisible(Error_HealthQuestions_1, 2);

//121
	}

}
