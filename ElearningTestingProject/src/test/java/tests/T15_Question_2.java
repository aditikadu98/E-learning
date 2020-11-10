package tests;

import pages.P15_Question_2;

public class T15_Question_2  {
	public static void question2() throws InterruptedException {
		Thread.sleep(2000);
		P15_Question_2.selectoption1();
		Thread.sleep(3000);
		P15_Question_2.finishbutton();
	}
}
