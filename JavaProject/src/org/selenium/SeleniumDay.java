package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkingPath\\Selenium\\JavaProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select s = new Select(day);
		s.selectByIndex(6);
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s1 = new Select(month);
		s1.selectByValue("5");
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1997");
			
		}
	}

