package com.org.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.org.base.BaseClass.driver;

public class Myaccount {
	
	private WebElement  email;
	private WebElement  userName;
	private WebElement  password;
	private WebElement  createAccount;
	
	public WebElement getEmail(String emailAdd) {
		email=driver.findElement(By.xpath("//*[@id='email']"));
		email.sendKeys(emailAdd);
		return email;
	}
	public WebElement getUserName() {
		userName=driver.findElement(By.xpath("//*[@id='username']"));
		userName.click();
		
		return userName;
	}
	public WebElement getPassword(String pwd) {
		password=driver.findElement(By.xpath("//*[@id='new-password']"));
		password.sendKeys(pwd);
		return password;
	}
	public WebElement getCreateAccount() {
		createAccount=driver.findElement(By.xpath("//*[@id='submitBtn']"));
		createAccount.click();
		return createAccount;
	}

}
