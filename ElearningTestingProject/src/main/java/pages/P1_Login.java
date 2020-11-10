package pages;

import org.openqa.selenium.By;

import connection.Browser;

public class P1_Login extends Browser {

	static By usernamefind = By.xpath("//*[@id=\"login\"]");
	static By passwordfind = By.id("password");
	static By loginclick = By.id("form-login_submitAuth");

	public static void setUsername(String username) {
		driver.findElement(usernamefind).sendKeys(username);
	}

	public static void setPassword(String password) {
		driver.findElement(passwordfind).sendKeys(password);
	}

	public static void clickLoginButton() {
		driver.findElement(loginclick).click();
	}

}
