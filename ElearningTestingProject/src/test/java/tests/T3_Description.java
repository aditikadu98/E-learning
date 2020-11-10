package tests;

import pages.P3_Description;

public class T3_Description {
	public static void adddescription() throws InterruptedException {
	P3_Description.course();
	P3_Description.courseclick();
	Thread.sleep(10000);
	P3_Description.title("Selenium course for begineer!");
	Thread.sleep(10000);
	P3_Description.iframe1();
	Thread.sleep(15000);
	P3_Description.content("Selenium course for begineer!");
	P3_Description.submit();
	}
}
