package pages;

import org.openqa.selenium.By;

import connection.Browser;

public class P18_ChooseActivityType extends Browser {
	static By dropdown = By.xpath("/html/body/main/section/div/form/fieldset/div/div[1]/div");
	static By choosetype = By.linkText("Tests");
	public static void dropdown() {
		driver.findElement(dropdown).click();
	}
	public static void choosetest() {
		driver.findElement(choosetype).click();
	}
}
