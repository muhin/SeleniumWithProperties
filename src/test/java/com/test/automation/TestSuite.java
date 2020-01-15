package com.test.automation;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.test.pages.LoginPage;
import com.test.util.PropertyReader;

public class TestSuite extends TestBase
{
	@BeforeAll
	public void beforeAll() throws FileNotFoundException, IOException
	{
		PropertyReader.loadProperties();
		setup();
	}

	@AfterAll
	public void afterAll()
	{
		tearDown();
	}

	@Test
	@Order(1)
	public void goToUrl()
	{
		driver.get(System.getProperty("base.url"));
		Assertions.assertEquals("Google", driver.getTitle());
		System.out.println(System.getProperty("run.browser"));
	}

	@Test
	@Order(2)
	public void clikLogin()
	{
		final LoginPage loginPage = new LoginPage(driver);
		loginPage.clickLoginButton();
	}
}
