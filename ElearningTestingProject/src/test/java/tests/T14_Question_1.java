package tests;

import pages.P14_Question_1;

public class T14_Question_1 {
	public static void question1() throws InterruptedException {
		Thread.sleep(2000);
		P14_Question_1.selectoption1();
		Thread.sleep(3000);
		P14_Question_1.clicknextbutton();
	}
}
