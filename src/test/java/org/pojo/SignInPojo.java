package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bas.BaseClass;

public class SignInPojo extends BaseClass{
	
	private void singInPojo() {
		PageFactory.initElements(driver, this);

	}
	

	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement createNewAcc;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstNameTxBox;
	
	@FindBy(name = "lastname")
	private WebElement lastNameTxBox;
	
	@FindBy(name = "reg_email__")
	private WebElement mobileorEmailTestBox;
	
	@FindBy(name = "reg_passwd__")
	private WebElement newPassword;

	public WebElement getCreateNewAcc() {
		return createNewAcc;
	}

	public WebElement getFirstNameTxBox() {
		return firstNameTxBox;
	}

	public WebElement getLastNameTxBox() {
		return lastNameTxBox;
	}

	public WebElement getMobileorEmailTestBox() {
		return mobileorEmailTestBox;
	}

	public WebElement getNewPassword() {
		return newPassword;
	}

}
