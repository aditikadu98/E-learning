package tests;

import pages.P1_Login;

public class T1_Login {

	public static void login() throws InterruptedException {
		Thread.sleep(2000);
		P1_Login.setUsername("admin");
		P1_Login.setPassword("admin@123");
		P1_Login.clickLoginButton();

	}

}