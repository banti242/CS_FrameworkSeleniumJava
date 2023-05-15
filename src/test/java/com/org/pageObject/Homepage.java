package com.org.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.org.base.BaseClass.driver;

public class Homepage {
	
	private WebElement signIn;
	private WebElement createMyAccount;
	private WebElement continuewithEmail;

	

	public WebElement getSignIn() {
		signIn=driver.findElement(By.xpath("//*[text()='Sign In' and @class='title-text']"));
		signIn.click();
		return signIn;
	}
	
	public WebElement getCreateMyAccount() {
		createMyAccount=driver.findElement(By.xpath("//*[text()='Create My Account']"));
		createMyAccount.click();
		return createMyAccount;
	}
	
	public WebElement getcontinuewithEmail() {
		continuewithEmail=driver.findElement(By.xpath("//*[@id='sign-up-email']"));
		continuewithEmail.click();
		return continuewithEmail;
	}

}
