package pages;

import org.openqa.selenium.By;

import connection.Browser;

public class P17_OnlineActivity extends Browser {
	static By addicon = By.xpath("/html/body/main/section/div/div[3]/div/section/div[1]/div/div[1]/a[2]/img");

	public static void add_online_activity_click() {
		driver.findElement(addicon).click();
	}
}
