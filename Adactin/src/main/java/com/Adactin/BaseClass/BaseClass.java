package com.Adactin.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver initializeBrowser(String browserName) throws Throwable {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
						+ "\\src\\test\\resource\\com\\Adactin\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
			} else {
				throw new Exception("Not a valid browser");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); // Implicit wait
			return driver;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void launchUrl(String url) throws Throwable {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
	public static void enterText(WebElement element, String value) {
		try {

			element.sendKeys(value);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickbt(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dropDown(WebElement element, String values, String options) {
		
		Select s = new Select(element);
		
		if (options.equalsIgnoreCase("values")) {
		s.selectByValue(values);	
		} else if (options.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(values));
		} else {
			s.selectByVisibleText(values);
		}		
	}
	public static void driverQuit() {
		driver.quit();
	}	
	public static void mouseHovertoElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
		
	}
	
	public static void clearValuesintheElement(WebElement element) throws Exception {
		element.clear();
	}
	
	public static boolean elementIsDisplayed(WebElement element) throws Exception {
		try {
			boolean displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
	
}
