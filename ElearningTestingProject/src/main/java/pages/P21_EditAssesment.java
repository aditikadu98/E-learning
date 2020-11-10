package pages;

import org.openqa.selenium.By;

import connection.Browser;

public class P21_EditAssesment extends Browser {
	static By weightage_box = By.id("weight_mask");
	static By editlink = By.id("edit_link_form_submit");

	public static void addweightage(String text) {
		driver.findElement(weightage_box).sendKeys(text);
	}

	public static void editlink_button() {
		driver.findElement(editlink).click();
	}
}
