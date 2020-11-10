package pages;

import org.openqa.selenium.By;

import connection.Browser;

public class P13_Starttest extends Browser {
	static By testbutton = By.linkText("Start test");

	public static void starttestbutton() {
		driver.findElement(testbutton).click();
	}

}
