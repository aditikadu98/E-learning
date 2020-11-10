package tests;

import pages.P9_MCQ_1;

public class T9_MCQ_1 {
	public static void addquestion_1() throws InterruptedException {
		P9_MCQ_1.box("Which course you are learning?");
		Thread.sleep(5000);
		P9_MCQ_1.iframe_a();
		P9_MCQ_1.option_a("Selenium");
		Thread.sleep(5000);
		P9_MCQ_1.iframe_b();
		P9_MCQ_1.option_b("Java");
		Thread.sleep(5000);
		P9_MCQ_1.iframe_c();
		P9_MCQ_1.option_c("C");
		Thread.sleep(5000);
		P9_MCQ_1.iframe_d();
		P9_MCQ_1.option_d("C#");
		P9_MCQ_1.submit();
	}
}
