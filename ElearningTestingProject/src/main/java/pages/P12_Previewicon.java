package pages;

import org.openqa.selenium.By;

import connection.Browser;

public class P12_Previewicon extends Browser {
	static By previewicon = By.xpath("/html/body/main/section/div/div[4]/a[2]/img");

	public static void preview_click() {
		driver.findElement(previewicon).click();
	}
}
