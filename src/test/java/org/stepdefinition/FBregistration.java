package org.stepdefinition;

import io.cucumber.datatable.*;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.SignInPojo;

import bas.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBregistration extends BaseClass{
	
	SignInPojo s;
	
@Given("To launch the browser and maximise window")
public void to_launch_the_browser_and_maximise_window() {
	launchBrowser();
	windowMaximize();
    
}

@When("To launch the url fb application")
public void to_launch_the_url_fb_application() {
	launchUrl("https://en-gb.facebook.com/");
    
}

@When("To click the create new account button")
public void to_click_the_create_new_account_button() {
	
	s = new SignInPojo();
   WebElement createBtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
   createBtn.click();
}

@When("To pass first name in firstname text box")
public void to_pass_first_name_in_firstname_text_box(DataTable d) throws InterruptedException {
	
	Thread.sleep(3000);
	
	Map<String, String> m = d.asMap(String.class, String.class);
	s = new SignInPojo();
	WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
    firstname.sendKeys(m.get("firstname3"));
   

}

@When("To pass secondname in secondname text box")
public void to_pass_secondname_in_secondname_text_box() {
	
	s = new SignInPojo();
	
	WebElement lastname = driver.findElement(By.name("lastname"));
	lastname.sendKeys("sammy");
    
}

@When("To pass mobileno or email in email text box")
public void to_pass_mobileno_or_email_in_email_text_box(DataTable d) {
	
	s = new SignInPojo();
	
	List<Map<String, String>> m1 = d.asMaps();
	
	WebElement email = driver.findElement(By.name("reg_email__"));
	email.sendKeys(m1.get(2).get("password3"));
   
}

@When("To create new password using new password text box")
public void to_create_new_password_using_new_password_text_box() {
	
	s = new SignInPojo();
	
	WebElement password = driver.findElement(By.name("reg_passwd__"));
	password.sendKeys("sammy@3000");
    
}

@Then("To close the chrome browser")
public void to_close_the_chrome_browser() {
	//closeEntireBrowser();
    
}


}
