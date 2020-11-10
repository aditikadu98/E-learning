package pages;

import org.openqa.selenium.By;
import connection.Browser;

public class P3_Description extends Browser {
	static By descriptionicon = By.linkText("Course description");
	static By courselink = By.xpath("/html/body/main/section/div/div[3]/div/div/div/div/a[1]/img");
	static By titlebox = By.id("course_description_title");
	static By click_iframe = By.xpath("/html/body/main/section/div/form/fieldset/div[2]/div[1]/div/div/div/iframe");
	static By coursecontent = By.xpath("/html/body");
	static By descriptionsubmit = By.id("course_description_submit");
	
	public static void course() {
		driver.findElement(descriptionicon).click();
	}
	public static void courseclick() {
		driver.findElement(courselink).click();
	}
	public static void title(String text) {
		driver.findElement(titlebox).sendKeys(text);
	}
	public static void iframe1() {
		driver.findElement(click_iframe).click();
	}
	public static void content(String text) {
		driver.findElement(coursecontent).sendKeys(text);
	}
	public static void submit() {
		driver.findElement(descriptionsubmit).click();
	}
}
