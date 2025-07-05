package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import pages.locators.LoginPageLocators;
import base.BasePage;

public class LoginPage extends BasePage {
	private static final Logger logger = LogManager.getLogger(LoginPage.class);
    
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    
    public LoginPage enterUsername(String username) {
    	logger.info("Entering username: " + username);
        type(LoginPageLocators.USERNAME_FIELD, username);
        return this;
    }
    
    public LoginPage enterPassword(String password) {
    	 logger.info("Entering password");
        type(LoginPageLocators.PASSWORD_FIELD, password);
        return this;
    }
    
    public void clickLogin() {
        logger.info("Clicking on Login button");
        click(LoginPageLocators.LOGIN_BUTTON);
    }
    public LoginPage enterSignupname(String name) {
    	type(LoginPageLocators.NewUserSignupname, name);
    	return this;
    }
   
    public LoginPage entersignupmail(String email) {
    	type(LoginPageLocators.NewUseremail, email);
    	return this;
    }
    
    public void clicksignup() {
    	click(LoginPageLocators.signup_button);
    }
    
    public String getErrorMessage() {
       String error = getText(LoginPageLocators.ERROR_MESSAGE);
        logger.warn("Login failed. Error message: " + error);
        return error;
    }
    
    // Comprehensive login method
    public void login(String username, String password) throws InterruptedException {
        enterUsername(username).enterPassword(password).clickLogin();
        Thread.sleep(3000);
    }
    
    //Comprehensive Signup 
    public void signupfirst(String username, String email) throws InterruptedException {
    	enterSignupname(username).entersignupmail(email).clicksignup();
    	Thread.sleep(3000);
    	
    	
    }
    
    
    public boolean isLoginSuccessful() {
        try {
            // Wait for the element to appear (up to 15 seconds)
            waitForElement(LoginPageLocators.DELETE_ACCOUNTMESSAGE);
            logger.info("Login successful.");
            return true;
        } catch (Exception e) {
        	logger.error("Login not successful", e);
            return false;
        }
    }

}