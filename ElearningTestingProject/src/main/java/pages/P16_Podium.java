package pages;

import org.openqa.selenium.By;

import connection.Browser;

public class P16_Podium extends Browser {
	static By podiumclick = By.linkText("podium");
	static By assesmentclick = By.linkText("Assessments");

	public static void clickonpodium() {
		driver.findElement(podiumclick).click();
	}

	public static void clickonassesments() {
		driver.findElement(assesmentclick).click();
	}
}
