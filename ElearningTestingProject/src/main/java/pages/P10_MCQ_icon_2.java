package pages;

import org.openqa.selenium.By;

import connection.Browser;

public class P10_MCQ_icon_2 extends Browser {
 static By multiple_choice_icon_2 = By.xpath("/html/body/main/section/div/div[6]/div/ul/li[1]/div/a/img");
 
 public static void clickicon() {
		driver.findElement(multiple_choice_icon_2).click();
	}

}
