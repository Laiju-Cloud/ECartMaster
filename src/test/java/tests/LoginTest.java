package tests;

import org.testng.Assert;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import pages.SignUpPage;

public class LoginTest extends BaseTest {
    
    @Test(priority = 3 )
    public void testSuccessfulLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);        
        loginPage.login("automationtester123@gmail.com", "Test@123");
        Assert.assertEquals(loginPage.isLoginSuccessful(), true);
        Thread.sleep(3000);
      
        
   
    }
    
    @Test(priority = 2)
    public void testInvalidLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);        
        loginPage.login("invalid@gmail.com", "credentials");
        Assert.assertEquals(loginPage.getErrorMessage(), "Your email or password is incorrect!");
        Thread.sleep(3000);
    }
    @Test(priority = 1)
    public void signuptest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signupfirst("AutomationTester12qdsdsw", "autom123wwdsdsd@example.com");

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.completeSignup(
            "Pass@123","Thee Veedu", "23", "December", "1998",
            "Laii", "Test", "Kollam", "City", "691512",
            "9605784515", "India"
        );
        Thread.sleep(3000);
    }

    
    //automationtester123@gmail.com
    //Test@123
}