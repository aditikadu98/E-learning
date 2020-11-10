package tests;

import pages.P11_MCQ_2;

public class T11_MCQ_2 {
	public static void addquestion_2() throws InterruptedException {
		P11_MCQ_2.icon("Which language you are using in selenium ?");
		Thread.sleep(5000);
		P11_MCQ_2.iframe_aa();
		P11_MCQ_2.option_aa("Java");
		Thread.sleep(5000);
		P11_MCQ_2.iframe_bb();
		P11_MCQ_2.option_bb("Phython");
		Thread.sleep(5000);
		P11_MCQ_2.iframe_cc();
		P11_MCQ_2.option_cc("C");
		Thread.sleep(5000);
		P11_MCQ_2.iframe_dd();
		P11_MCQ_2.option_dd("C#");
		P11_MCQ_2.submit();

	}
}
