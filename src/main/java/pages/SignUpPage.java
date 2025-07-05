package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

import base.BasePage;
import pages.locators.SignupPageLocators;

public class SignUpPage extends BasePage {
    private static final Logger logger = LogManager.getLogger(SignUpPage.class);

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public SignUpPage selectGender() {
        logger.info("Clicking on Gender (Male)");
        click(SignupPageLocators.gender);
        return this;
    }

    public SignUpPage enterPassword(String password) {
        logger.info("Entering password: " + password);
        type(SignupPageLocators.password, password);
        return this;
    }

    public SignUpPage selectDateOfBirth(String day, String month, String year) {
        logger.info("Selecting Date of Birth: " + day + "-" + month + "-" + year);
        selectDropdownByVisibleText(SignupPageLocators.dayDropdown, day);
        selectDropdownByVisibleText(SignupPageLocators.monthDropdown, month);
        selectDropdownByVisibleText(SignupPageLocators.yearDropdown, year);
        return this;
    }

    public SignUpPage enterFirstName(String firstName) {
        logger.info("Entering first name: " + firstName);
        type(SignupPageLocators.firstname, firstName);
        return this;
    }

    public SignUpPage enterLastName(String lastName) {
        logger.info("Entering last name: " + lastName);
        type(SignupPageLocators.lastname, lastName);
        return this;
    }

    public SignUpPage enterState(String state) {
        logger.info("Entering state: " + state);
        type(SignupPageLocators.state, state);
        return this;
    }

    public SignUpPage enterCity(String city) {
        logger.info("Entering city: " + city);
        type(SignupPageLocators.city, city);
        return this;
    }

    public SignUpPage enterZipCode(String zipCode) {
        logger.info("Entering zip code: " + zipCode);
        type(SignupPageLocators.zipcode, zipCode);
        return this;
    }

    public SignUpPage enterMobileNumber(String mobileNumber) {
        logger.info("Entering mobile number: " + mobileNumber);
        type(SignupPageLocators.mobile, mobileNumber);
        return this;
    }

    public SignUpPage selectCountry(String country) {
        logger.info("Selecting country: " + country);
        selectDropdownByVisibleText(SignupPageLocators.country, country);
        return this;
    }
    public SignUpPage clickcreateac() {
    	 logger.info("Clicking Carete AC");
    	 click(SignupPageLocators.createac);
    	 return this;
    }
    public SignUpPage enteradd(String Address) {
    	logger.info("Entering address");
    	type(SignupPageLocators.address, Address);
    	return this;
    }
    public SignUpPage continuebuttonclick() {
   	 logger.info("Clicking Continue button");
   	 click(SignupPageLocators.cntbtn);
   	 return this;
   }
    public SignUpPage deleteac() {
      	 logger.info("Clicking Delete Ac button");
      	 click(SignupPageLocators.deleteac);
      	 return this;
      }

    private void selectDropdownByVisibleText(By locator, String value) {
        WebElement dropdownElement = waitForElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(value);
    }
    
    public void completeSignup(
         
            String password,
            String Address,
            String day, String month, String year,
            String firstName, String lastName,
            String state, String city, String zipCode,
            String mobileNumber, String country
    ) throws InterruptedException {
        selectGender()
        
            .enterPassword(password)
            .enteradd(Address)
            .selectDateOfBirth(day, month, year)
            .enterFirstName(firstName)
            .enterLastName(lastName)
            .enterState(state)
            .enterCity(city)
            .enterZipCode(zipCode)
            .enterMobileNumber(mobileNumber)
            .selectCountry(country)
            .clickcreateac();
        
        

        Thread.sleep(3000);
        continuebuttonclick(); 
        Thread.sleep(3000);
        deleteac();
       
        // For demo purposes (better use WebDriverWait)
    }
    
}
