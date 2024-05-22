package com.codetru.project.cica.pages;

import com.anhtester.constants.FrameworkConstants;
import com.anhtester.helpers.PropertiesHelpers;
import com.codetru.project.cica.CommonPageCICA;

import org.openqa.selenium.By;

import static com.anhtester.keywords.WebUI.*;
//import static com.anhtester.keywords.WebUI.clickElement;

public class LoginPage extends CommonPageCICA {

    private By closeAdvertisementPopup = By.xpath("//button[@data-key='website-popup']");
    private By buttonLogin = By.xpath("(//a[normalize-space()='Registration']/parent::li)/preceding-sibling::li");
    private By buttonCopyAdminAcc = By.xpath("//button[normalize-space()='Copy']");
//    private By buttonSubmitLogin = By.xpath("//button[normalize-space()='Login']");
    private By buttonSubmitLogin = By.xpath("//ion-button[@type='submit']");
//    private By titleLoginPage = By.xpath("//h1[normalize-space() = 'Login to your account.']");
    private By titleLoginPage = By.xpath("//ion-button[@type='submit']");
//    private By messageRequiredEmail = By.xpath("//strong[contains(text(),'The email field is required when phone is not present.')]");
    private By userNameReqd = By.xpath("//p[text()='Please enter a value. ']");
//    private By inputEmail = By.xpath("//input[@id='email']");
    private By inputEmail = By.xpath("//input[@name='username']");
//    private By inputPassword = By.xpath("//input[@id='password']");
    private By inputPassword = By.xpath("//input[@name='password']");
//    private By messageAccDoesNotExist = By.xpath("//span[@data-notify='message']");
    private By messageUserDoesNotExist = By.xpath("//h2[.='Incorrect User Name or Password']");
//    private By messageRequiredPassword = By.xpath("//input[contains(@class, 'is-invalid') and @id = 'password']");
    private By messageRequiredPassword = By.className("errormsg");
//    private By application_btn = By.id("applicationButton");
    private By dashboardTab = By.xpath("//ion-button[text()=' Dashboard ']");
    
    
    private By titleAnhTesterAdminPage = By.xpath("//img[@alt='Active eCommerce CMS']");

    public void clickCloseAdvertisementPopup() {
        clickElement(closeAdvertisementPopup);
    }

    public void openLoginPage() {
        openWebsite(FrameworkConstants.URL_CMS_USER);
//        clickElement(closeAdvertisementPopup);
//        clickElement(buttonCookies);
//        clickElement(buttonLogin);
        waitForPageLoaded();
        verifyElementVisible(titleLoginPage, "Login page is NOT displayed");
    }

    public void verifyRedirectToAdminPage() {
        verifyElementVisible(avatarProfile, "Can not redirect to Admin page.");
    }

    public void loginFailWithEmailNull() {
        openLoginPage();
        sleep(2);
        clickElement(buttonSubmitLogin);
        waitForPageLoaded();
        sleep(1);
//        verifyEquals(getTextElement(messageRequiredEmail).trim(), "The email field is required when phone is not present.", "");
        verifyEquals(getTextElement(userNameReqd).trim(), "Please enter a value.", "");
    }

    public void loginFailWithEmailDoesNotExist(String email, String password) {
        openLoginPage();
        sleep(2);
        setText(inputEmail, email);
        setText(inputPassword, password);
        clickElement(buttonSubmitLogin);
        waitForPageLoaded();
        sleep(1);
//        verifyElementVisible(messageAccDoesNotExist, "Email is incorrect but valid is NOT displayed.");
        verifyElementVisible(messageUserDoesNotExist, "User Doesn't Exist. Please enter a valid User Name.");
    }

    public void loginFailWithNullPassword(String email) {
        openLoginPage();
        sleep(2);
        setText(inputEmail, email);
        clickElement(buttonSubmitLogin);
        waitForPageLoaded();
        sleep(1);
//        verifyElementPresent(messageRequiredPassword, "No warning password input");
        verifyElementPresent(messageRequiredPassword, "Did not enter the password");
    }

    public void loginFailWithIncorrectPassword(String email, String password) {
        openLoginPage();
        sleep(2);
        setText(inputEmail, email);
        clearText(inputPassword);
        setText(inputPassword, password);
        clickElement(buttonSubmitLogin);
        waitForPageLoaded();
        sleep(1);
        verifyElementVisible(messageUserDoesNotExist, "Password is failed but valid is NOT displayed.");
    }

    public void loginSuccessWithCustomerAccount(String email, String password) {
        openLoginPage();
        sleep(2);
        setText(inputEmail, email);
        clearText(inputPassword);
        setText(inputPassword, password);
        clickElement(buttonSubmitLogin);
        waitForPageLoaded();
        sleep(5);
        waitForElementVisible(dashboardTab);
        
        verifyElementVisible(dashboardTab, "Dashboard page is NOT displayed.");
//        waitForElementVisible(DashboardPage.titleDashboard);
//        verifyElementVisible(DashboardPage.titleDashboard, "Dashboard page is NOT displayed.");
    }

//    public CommonPageCICA loginSuccessAdminPage(String email, String password) {
//        openWebsite(FrameworkConstants.URL_CMS_ADMIN);
//        setText(inputEmail, email);
//        setText(inputPassword, password);
//        clickElement(buttonSubmitLogin);
//        waitForElementVisible(titleAnhTesterAdminPage);
//        verifyElementVisible(titleAnhTesterAdminPage, "Admin page is NOT displayed.");
//        return new CommonPageCICA();
//    }
//
//    public CommonPageCICA loginSuccessAdminPage() {
//        openWebsite(FrameworkConstants.URL_CMS_ADMIN);
//        setText(inputEmail, PropertiesHelpers.getValue("email"));
//        setText(inputPassword, PropertiesHelpers.getValue("password"));
//        clickElement(buttonSubmitLogin);
//        waitForElementVisible(titleAnhTesterAdminPage);
//        verifyElementVisible(titleAnhTesterAdminPage, "Admin page is NOT displayed.");
//        return new CommonPageCICA();
//    }
}


