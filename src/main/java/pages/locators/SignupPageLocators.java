package pages.locators;
import org.openqa.selenium.By;


public interface SignupPageLocators {
	By gender = By.xpath("//*[@id= 'id_gender1']");
	By password= By.xpath("//*[@id= 'password']");
	By dayDropdown = By.cssSelector("select[data-qa='days']");
	By monthDropdown = By.cssSelector("select[data-qa='months']");
	By yearDropdown = By.cssSelector("select[data-qa='years']");
	By firstname = By.xpath("//*[@id = 'first_name']");
	By lastname = By.xpath("//*[@id = 'last_name']");
	By state = By.xpath("//*[@id = 'state']");
	By city = By.xpath("//*[@id = 'city']");
	By zipcode = By.xpath("//*[@id = 'zipcode']");
	By mobile = By.xpath("//*[@id = 'mobile_number']");
	By country = By.xpath("//*[@id = 'country']");
	By address = By.cssSelector("input[data-qa='address']");
	By createac = By.cssSelector("button[data-qa='create-account']");
	By cntbtn = By.cssSelector("a[data-qa='continue-button']");
	By deleteac = By.xpath("//a[@href='/delete_account']");
	
	 	
	
	

}
