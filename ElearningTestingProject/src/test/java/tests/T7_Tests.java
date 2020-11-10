package tests;

import pages.P7_Tests;

public class T7_Tests {
	public static void createtest() throws InterruptedException {
		P7_Tests.test();
		P7_Tests.name("Online Quiz-1");
		P7_Tests.settings();
		Thread.sleep(15000);
		P7_Tests.iframe();
		P7_Tests.testenter("Quiz");
		Thread.sleep(3000);
		P7_Tests.timecheckbox();
		P7_Tests.selecttime();
		P7_Tests.date();
		P7_Tests.donebutton();
		P7_Tests.percentage("50");
		P7_Tests.proceedbutton();

	}
}
