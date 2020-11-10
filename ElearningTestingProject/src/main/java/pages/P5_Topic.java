package pages;

import org.openqa.selenium.By;

import connection.Browser;

public class P5_Topic extends Browser {
	static By topicicon = By.xpath("/html/body/main/section/div/div[3]/div/div/div/div/a[3]/img");
	static By titlebox = By.id("course_description_title");
	static By iframe = By.xpath("/html/body/main/section/div/form/fieldset/div[2]/div[1]/div/div/div/iframe");
	static By contentbox = By.xpath("/html/body");
	static By topicsubmit = By.id("course_description_submit");
	static By podium = By.linkText("podium");

	public static void icon() {
		driver.findElement(topicicon).click();
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
		driver.findElement(topicsubmit).click();
	}
	public static void podiumclick() {
		driver.findElement(podium).click();
	}
}
