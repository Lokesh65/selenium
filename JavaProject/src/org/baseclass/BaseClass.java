package org.baseclass;

import org.openqa.selenium.By;

public class BaseClass extends Base {

	public static void main(String[] args) {
		initializeBrowser("chrome");
		launchApp("https://www.facebook.com/");
		enterText(driver.findElement(By.id("email")), "Lokesh123@gmail.com");
		enterText(driver.findElement(By.id("pass")), "1234567");
        enterText(driver.findElement(By.name("firstname")), "Lokesh");
        enterText(driver.findElement(By.name("lastname")), "lok");
        enterText(driver.findElement(By.xpath("(//input[@type='text'])[3]")), "9121237625");
        enterText(driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")), "646536234");
        
      
		
		

		
	}

}
