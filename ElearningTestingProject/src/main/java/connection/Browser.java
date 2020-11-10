package connection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver driver;

	public static WebDriver getDriver(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
			driver = new ChromeDriver();

		} else {
			System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("http://elearning.upskills.in/");
		driver.manage().window().maximize();
		return driver;
	}

	public static void driverClose() {
		System.out.println("The page title is: " + driver.getTitle());
		driver.close();
	}
}