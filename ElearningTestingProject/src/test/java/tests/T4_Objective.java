package tests;

import pages.P4_Objective;

public class T4_Objective {
	public static void addobjective() throws InterruptedException {
		P4_Objective.icon();
		P4_Objective.title("selenium course for begineers!");
		Thread.sleep(15000);
		P4_Objective.iframe();
		Thread.sleep(3000);
		P4_Objective.content("selenium course for begineers!");
		P4_Objective.submit();
	}
}
