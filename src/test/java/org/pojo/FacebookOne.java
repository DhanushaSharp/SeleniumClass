package org.pojo;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bas.BaseClass;

public class FacebookOne extends BaseClass {
	
	public FacebookOne() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(xpath = "//div[@class='_6luy _55r1 _1kbt _9nyh']")
	private WebElement password;
	
		@FindBy(name= "login")
	private WebElement loginBtn;
	
		public WebElement getEmail() {
			return email;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}


}
//"//input[@aria-label='password']"
//xpath = "//input[@class='inputtext _55r1 _6luy']"