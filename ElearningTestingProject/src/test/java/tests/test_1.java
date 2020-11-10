package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import connection.Browser;

public class test_1 {
	@Test(priority=0)
	public void ELTC_031() throws InterruptedException {
		T1_Login.login();
		T2_CreateCourse.createcourse();
		T3_Description.adddescription();
		T4_Objective.addobjective();
		T5_Topic.addtopic();
	}
	@Test(priority=1)
	public void ELTC_032() throws InterruptedException{
		T6_Podium.selecttests();
		T7_Tests.createtest();
		T8_MCQ_icon.mcq_icon_1();
		T9_MCQ_1.addquestion_1();
		T10_MCQ_icon_2.mcq_icon_2();
		T11_MCQ_2.addquestion_2();
		T12_Previewicon.clickpreview();
		T13_Starttest.starttest();
		T14_Question_1.question1();
		T15_Question_2.question2();
	}
	@Test(priority=2)
	public void ELTC_033() throws InterruptedException{
		T16_Podium.selectassesment();
		T17_OnlineActivity.activity_icon();
		T18_ChooseActivityType.choose_activity();
		T19_ActivityCredential.addactivity();
		T20_EditButton.edit_activity();
		T21_EditAssesment.edit();
		T22_AttachCertificate.certificate();
	}

	@BeforeClass
	public void beforeClass() {
		Browser.getDriver("firefox");
	}

	@AfterClass
	public void afterClass() {
		//Browser.driverClose();
	}

}