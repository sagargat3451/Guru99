package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilsLayer.Utils_Class;

import BaseLayer.BaseClass;
import UtilsLayer.HandleDropDown;

public class RegisterPage11 extends BaseClass {

	@FindBy(name = "firstName")
	WebElement FirstName;

	@FindBy(name = "lastName")
	WebElement LastName;

	@FindBy(name = "phone")
	WebElement Phone;

	@FindBy(name = "userName")
	WebElement email;

	@FindBy(name = "address1")
	WebElement Address;

	@FindBy(name = "city")
	WebElement City;

	@FindBy(name = "state")
	WebElement State;

	@FindBy(name = "postalCode")
	WebElement PostalCode;

	@FindBy(name = "country")
	WebElement Country;

	@FindBy(name = "email")
	WebElement Username;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(name = "confirmPassword")
	WebElement ConfirmPassword;

	@FindBy(name = "submit")
	WebElement Submit;

	public RegisterPage11() {
		PageFactory.initElements(driver, this);
	}

	public void contactInformation(String fname, String lname, String mob, String emailid) {

		Utils_Class.enterDataInTextBox(FirstName, fname);
		Utils_Class.enterDataInTextBox(LastName, lname);
		Utils_Class.enterDataInTextBox(Phone, mob);
		Utils_Class.enterDataInTextBox(email, emailid);
	}
	
	
	public void mailingInformation(String add, String city, String state, String pincode, String country) {
		Utils_Class.enterDataInTextBox(Address, add);
		Utils_Class.enterDataInTextBox(City, city);
		Utils_Class.enterDataInTextBox(State, state);
		Utils_Class.enterDataInTextBox(PostalCode, pincode);
		HandleDropDown.selectValueUsingVisibleText(Country, country);
	}

	public void userInformation(String uname, String pass, String cpass) {
		Utils_Class.enterDataInTextBox(Username, uname);
		Utils_Class.enterDataInTextBox(Password, pass);
		Utils_Class.enterDataInTextBox(ConfirmPassword, cpass);
		Utils_Class.clickOnButton(Submit);
	}

}
