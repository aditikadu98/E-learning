package pages;

import org.openqa.selenium.By;

import connection.Browser;

public class P22_AttachCertificate extends Browser {
	static By certificate = By.xpath("/html/body/main/section/div/div[3]/div/section/div[1]/div/div[2]/a[2]/img");

	public static void attachcertificate_icon() {
		driver.findElement(certificate).click();
	}
}
