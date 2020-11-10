package pages;

import org.openqa.selenium.By;

import connection.Browser;

public class P20_EditButton extends Browser {
	static By edit = By
			.xpath("/html/body/main/section/div/div[3]/div/section/form/div/table/tbody/tr[2]/td[6]/a[1]/img");

	public static void edit() {
		driver.findElement(edit).click();
	}

}
