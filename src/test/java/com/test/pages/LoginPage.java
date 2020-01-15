package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageBase
{
	public LoginPage(final WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "")
	WebElement loginButton;

	By loginBy = By.xpath("");

	public void clickLoginButton()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginBy));
		loginButton.click();
	}
}
