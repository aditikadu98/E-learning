package pages;

import org.openqa.selenium.By;

import connection.Browser;

public class P6_Podium extends Browser{
	static By podiumclick = By.linkText("podium");
	static By testclick = By.xpath("//*[@id=\"istooldesc_198\"]");
	
	public static void clickonpodium() {
		driver.findElement(podiumclick).click();
	}
	public static void clickontests() {
		driver.findElement(testclick).click();
	}
}
