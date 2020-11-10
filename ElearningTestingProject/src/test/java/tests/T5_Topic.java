package tests;

import pages.P5_Topic;

public class T5_Topic {
	public static void addtopic() throws InterruptedException {
		P5_Topic.icon();
		P5_Topic.title("selenium course for begineer!");
		Thread.sleep(10000);
		P5_Topic.iframe();
		Thread.sleep(3000);
		P5_Topic.content("selenium course for begineer!");
		P5_Topic.submit();
		P5_Topic.podiumclick();

	}
}
