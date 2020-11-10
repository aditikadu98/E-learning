package pages;

import org.openqa.selenium.By;

import connection.Browser;

public class P7_Tests extends Browser {

	static By testbutton = By.xpath("/html/body/main/section/div/div[4]/div/a");
	static By namebox = By.id("exercise_title"); // send
	static By advancedsetting = By.id("advanced_params");
	static By iframe = By.xpath("/html/body/main/section/div/form/fieldset/div[3]/div[1]/div[1]/div/div/div/iframe");
	static By testbox = By.xpath("/html/body"); // send
	static By enable_start_time = By.name("activate_start_date_check");
	static By validtime = By.xpath("/html/body/main/section/div/form/fieldset/div[3]/div[13]/div/div[1]/div/span[1]");
	static By selectdate = By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[2]/a");
	static By donebutton = By.xpath("/html/body/div[4]/div[3]/button[2]");
	static By percentagebox = By.xpath("//*[@id=\"pass_percentage\"]"); // send
	static By proceedbutton = By.id("exercise_admin_submitExercise");

	public static void test() {
		driver.findElement(testbutton).click();
	}

	public static void name(String text) {
		driver.findElement(namebox).sendKeys(text);
	}

	public static void settings() {
		driver.findElement(advancedsetting).click();
	}

	public static void iframe() {
		driver.findElement(iframe).click();
	}

	public static void testenter(String text) {
		driver.findElement(testbox).sendKeys(text);
	}

	public static void timecheckbox() {
		driver.findElement(enable_start_time).click();
	}

	public static void selecttime() {
		driver.findElement(validtime).click();
	}

	public static void date() {
		driver.findElement(selectdate).click();
	}

	public static void donebutton() {
		driver.findElement(donebutton).click();
	}
	public static void percentage(String text) {
		driver.findElement(percentagebox).sendKeys(text);
	}
	public static void proceedbutton() {
		driver.findElement(proceedbutton).click();
	}

}
