package pages;

import org.openqa.selenium.By;

import connection.Browser;

public class P9_MCQ_1 extends Browser {
	static By questionbox = By.id("question_admin_form_questionName"); // send
	static By iframe_a = By
			.xpath("/html/body/main/section/div/form/fieldset/table/tbody/tr[1]/td[3]/div/div/div/iframe");
	static By option_a = By.xpath("/html/body"); // send
	static By iframe_b = By
			.xpath("/html/body/main/section/div/form/fieldset/table/tbody/tr[2]/td[3]/div/div/div/iframe");
	static By option_b = By.xpath("/html/body"); // send
	static By iframe_c = By
			.xpath("/html/body/main/section/div/form/fieldset/table/tbody/tr[3]/td[3]/div/div/div/iframe");
	static By option_c = By.xpath("/html/body"); // send
	static By iframe_d = By
			.xpath("/html/body/main/section/div/form/fieldset/table/tbody/tr[4]/td[3]/div/div/div/iframe");
	static By option_d = By.xpath("/html/body"); // send
	static By submit_question = By.id("submit-question");

	public static void box(String text) {
		driver.findElement(questionbox).sendKeys(text);
	}

	public static void iframe_a() {
		driver.findElement(iframe_a).click();
	}

	public static void option_a(String text) {
		driver.findElement(option_a).sendKeys(text);
	}

	public static void iframe_b() {
		driver.findElement(iframe_b).click();
	}

	public static void option_b(String text) {
		driver.findElement(option_b).sendKeys(text);
	}

	public static void iframe_c() {
		driver.findElement(iframe_c).click();
	}

	public static void option_c(String text) {
		driver.findElement(option_c).sendKeys(text);
	}

	public static void iframe_d() {
		driver.findElement(iframe_d).click();
	}

	public static void option_d(String text) {
		driver.findElement(option_d).sendKeys(text);
	}

	public static void submit() {
		driver.findElement(submit_question).click();
	}
}
