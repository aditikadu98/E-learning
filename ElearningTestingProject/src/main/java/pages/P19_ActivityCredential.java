package pages;

import org.openqa.selenium.By;

import connection.Browser;

public class P19_ActivityCredential extends Browser {
	static By clickbutton = By.id("add_link_submit");

	public static void click_addactivity() {
		driver.findElement(clickbutton).click();
	}
}
