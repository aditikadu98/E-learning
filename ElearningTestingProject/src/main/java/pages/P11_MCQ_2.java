package pages;

import org.openqa.selenium.By;

import connection.Browser;

public class P11_MCQ_2 extends Browser {
	static By questionbox = By.id("question_admin_form_questionName");
	static By iframe_1 = By
			.xpath("/html/body/main/section/div/form/fieldset/table/tbody/tr[1]/td[3]/div/div/div/iframe");
	static By option_1 = By.xpath("/html/body"); // send
	static By iframe_2 = By
			.xpath("/html/body/main/section/div/form/fieldset/table/tbody/tr[2]/td[3]/div/div/div/iframe");
	static By option_2 = By.xpath("/html/body"); // send
	static By iframe_3 = By
			.xpath("/html/body/main/section/div/form/fieldset/table/tbody/tr[3]/td[3]/div/div/div/iframe");
	static By option_3 = By.xpath("/html/body"); // send
	static By iframe_4 = By
			.xpath("/html/body/main/section/div/form/fieldset/table/tbody/tr[4]/td[3]/div/div/div/iframe");
	static By option_4 = By.xpath("/html/body"); // send
	static By submit_question = By.id("submit-question");

	public static void icon(String text) {
		driver.findElement(questionbox).sendKeys(text);
	}

	public static void iframe_aa() {
		driver.findElement(iframe_1).click();
	}

	public static void option_aa(String text) {
		driver.findElement(option_1).sendKeys(text);
	}

	public static void iframe_bb() {
		driver.findElement(iframe_2).click();
	}

	public static void option_bb(String text) {
		driver.findElement(option_2).sendKeys(text);
	}

	public static void iframe_cc() {
		driver.findElement(iframe_3).click();
	}

	public static void option_cc(String text) {
		driver.findElement(option_3).sendKeys(text);
	}

	public static void iframe_dd() {
		driver.findElement(iframe_4).click();
	}

	public static void option_dd(String text) {
		driver.findElement(option_4).sendKeys(text);
	}

	public static void submit() {
		driver.findElement(submit_question).click();
	}

}
