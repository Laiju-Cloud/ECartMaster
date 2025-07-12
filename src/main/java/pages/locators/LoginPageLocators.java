package pages.locators;

import org.openqa.selenium.By;

public interface LoginPageLocators {
    By USERNAME_FIELD = By.xpath("//*[@placeholder='Email Address'][1]");
    By PASSWORD_FIELD = By.xpath("//*[@placeholder='Password']");
    By LOGIN_BUTTON = By.xpath("//*[@class='btn btn-default'][1]");
    By ERROR_MESSAGE = By.xpath("//*[text()='Your email or password is incorrect!']");
    By DELETE_ACCOUNTMESSAGE = By.xpath("//*[text()=\" Delete Account\"]");
    By NewUserSignupname = By.cssSelector("input[data-qa='signup-name']");
    By NewUseremail = By.cssSelector("input[data-qa='signup-email']");
    By signup_button = By.cssSelector("button[data-qa='signup-button']");
    //git addedded
}
