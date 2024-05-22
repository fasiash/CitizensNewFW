package com.codetru.project.cica.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.anhtester.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;

import net.bytebuddy.description.ModifierReviewable.OfAbstraction;


public class Step_9Page extends CommonPageCICA {
	
//	public 	WebDriver driver;
	
	
	
//	@FindBy(id = "applicationButton")
	private By ApplicationModule1 = By.id("applicationButton");	
	
//	@FindBy(xpath = "//span[.='Step 8: Upload Application ']")
	private By Upload_Application = By.xpath("//span[.='Step 8: Upload Application ']");
	
	private By List_application1 = By.xpath("//div[@class='applicationDropdown']/div[1]");

//	@FindBy(xpath = "(//ion-col[@size='24' and@size-md='18' ]/ion-button[@class = 'md button button-solid ion-activatable ion-focusable hydrated'])[13]")
	private By Table_Of_Content = By.xpath("(//ion-col[@size='24' and@size-md='18' ]/ion-button[@class = 'md button button-solid ion-activatable ion-focusable hydrated'])[13]");
	
//	@FindBy(xpath = "(//td/ion-button[@title='Edit Application'])[last()]")
	private By ListEdit_application1 = By.xpath("(//td/ion-button[@title='Edit Application'])[last()]");
	

    public void Edit_Submit() throws Exception 
    {
    	

    	WebUI.waitForPageLoaded(2);
    	WebUI.clickElement(ApplicationModule1);
		WebUI.sleep(2);
		WebUI.clickElement(List_application1);
		WebUI.sleep(2);
		WebUI.scrollToElementAtBottom(ListEdit_application1);
		WebUI.sleep(1);
		WebUI.verifyElementVisible(ListEdit_application1,2);
		WebUI.clickElement(ListEdit_application1,2);
		WebUI.sleep(1);
//    	WebUI.clickElement(Table_Of_Content);
//    	WebUI.waitForPageLoaded(3);
    	WebUI.clickElement(Upload_Application, 2);
		WebUI.sleep(3);
;
		
    }
    
}
