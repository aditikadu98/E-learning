package pages;

import org.openqa.selenium.By;

import connection.Browser;

public class P2_CreateCourse extends Browser {

	static By courselinkclick = By.linkText("Create a course");
	static By coursenamefind = By.id("update_course_title");
	static By codefind = By.id("visual_code");
	static By categorydropdown = By
			.xpath("/html/body/main/section/div/div[2]/div/section/form/fieldset/div[3]/div[1]/div/button/div/div");
	static By projectfind = By.xpath(
			"/html/body/main/section/div/div[2]/div/section/form/fieldset/div[3]/div[1]/div/div/div[2]/ul/li[4]/a");
	static By departmentfind  = By.id("department_name");
	static By languagedropdown= By.xpath(
			"/html/body/main/section/div/div[2]/div/section/form/fieldset/div[7]/div[1]/div/button/span/span");
	static By selectenglish=By.xpath(
			"/html/body/main/section/div/div[2]/div/section/form/fieldset/div[7]/div[1]/div/div/div[2]/ul/li[6]/a");
	static By submitclick = By.id("update_course_submit");
	static By selectcourse = By.xpath("/html/body/main/section/div/div[2]/div/section/form/div/table/tbody/tr[19]/td[2]");
	static By homebuttonclick = By.xpath("/html/body/main/section/div/div[2]/div/section/form/div/table/tbody/tr[5]/td[8]/a[2]/img");

	public static void courselink() {
		driver.findElement(courselinkclick).click();
	}
	public static void coursename(String text) {
		driver.findElement(coursenamefind).sendKeys(text);
	}
	public static void codename(String text) {
		driver.findElement(codefind).sendKeys(text);
	}
	public static void dropdownclick() {
		driver.findElement(categorydropdown).click();
	}
	public static void projectclick() {
		driver.findElement(projectfind).click();
	}
	public static void department(String text) {
		driver.findElement(departmentfind).sendKeys(text);
	}
	public static void language() {
		driver.findElement(languagedropdown).click();
	}
	public static void english() {
		driver.findElement(selectenglish).click();
	}
	public static void submit() {
		driver.findElement(submitclick).click();
	}
	public static void select() {
		driver.findElement(selectcourse).click();
	}
	public static void home() {
		driver.findElement(homebuttonclick).click();
	}
}
