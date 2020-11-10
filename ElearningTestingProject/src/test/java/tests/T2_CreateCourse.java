package tests;

import pages.P2_CreateCourse;

public class T2_CreateCourse {

	public static void createcourse() throws InterruptedException {
		Thread.sleep(2000);
		P2_CreateCourse.courselink();
		P2_CreateCourse.coursename("Selenium_ad");
		P2_CreateCourse.codename("SELENIUM16");
		P2_CreateCourse.dropdownclick();
		P2_CreateCourse.projectclick();
		P2_CreateCourse.department("Coumputer");
		P2_CreateCourse.language();
		P2_CreateCourse.english();
		P2_CreateCourse.submit();
		P2_CreateCourse.select();
		P2_CreateCourse.home();
	}
}
