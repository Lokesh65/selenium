package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static WebDriver driver;

	public static void initializeBrowser(String browser) {
		try {

			System.setProperty("webdriver.chrome.driver",
					"D:\\WorkingPath\\Selenium\\JavaProject\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} catch (Exception e) {
		}
	}

	public static void launchApp(String url) {
		try {
			driver.get(url);

		} catch (Exception e) {
		}

	}

	public static void enterText(WebElement element, String value) {
		try {

			element.sendKeys(value);

		} catch (Exception e) {
		}

	}

	public static void clickbt(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
		}
	}
	
	

}
