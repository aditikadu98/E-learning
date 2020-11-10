package pages;

import org.openqa.selenium.By;

import connection.Browser;

public class P15_Question_2 extends Browser {
	static By option1 = By.xpath("//input[contains(@id,'-1')]");
	static By finish = By.xpath("/html/body/main/section/div/div[4]/form/div[3]/div[3]/button[2]");
	
	public static void selectoption1() {
		driver.findElement(option1).click();
	}

	public static void finishbutton() {
		driver.findElement(finish).click();
	}
}
