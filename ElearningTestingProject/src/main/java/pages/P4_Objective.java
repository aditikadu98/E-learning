package pages;

import org.openqa.selenium.By;

import connection.Browser;

public class P4_Objective extends Browser {
	static By objectiveicon = By.xpath("/html/body/main/section/div/div[3]/div/div/div/div/a[2]");
	static By titlebox = By.xpath("//*[@id=\"course_description_title\"]");
	static By iframe = By.xpath("/html/body/main/section/div/form/fieldset/div[2]/div[1]/div/div/div/iframe");
	static By contentbox = By.xpath("/html/body");
	static By objectivesubmit = By.id("course_description_submit");

	public static void icon() {
		driver.findElement(objectiveicon).click();
	}

	public static void title(String text) {
		driver.findElement(titlebox).sendKeys(text);
	}

	public static void iframe() {
		driver.findElement(iframe).click();
	}

	public static void content(String text) {
		driver.findElement(contentbox).sendKeys(text);
	}

	public static void submit() {
		driver.findElement(objectivesubmit).click();
	}
}
