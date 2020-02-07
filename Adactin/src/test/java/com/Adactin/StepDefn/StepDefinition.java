package com.Adactin.StepDefn;

import com.Adactin.BaseClass.BaseClass;
import com.Adactin.object.SearchHotel;
import com.Adactin.object.LogInPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {

	@Given("^user open the Chrome browser$")
	public void user_open_the_Chrome_browser() throws Throwable {

//	initializeBrowser("chrome");
	}

	@When("^user open the Adactin page$")
	public void user_open_the_Adactin_page() throws Throwable {
		launchUrl("https://adactin.com/HotelApp/");
	}

	@When("^user enter the username in Username field$")
	public void user_enter_the_username_in_Username_field() throws Throwable {
		LogInPage lp = new LogInPage();
		enterText(lp.getUsername(), "GLokesh123");
	}

	@When("^user enter the Password in Password Field$")
	public void user_enter_the_Password_in_Password_Field() throws Throwable {
		LogInPage lp = new LogInPage();
		enterText(lp.getPassword(), "Greens@12345");

	}

	@Then("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {
		LogInPage lp = new LogInPage();
		clickbt(lp.getLogInbtn());
		Thread.sleep(2000);
	}

	@When("^user select location from dropdown$")
	public void user_select_location_from_dropdown() throws Throwable {
		SearchHotel sh =new SearchHotel();
		dropDown(sh.getLocation(), "Melbourne", "value");
				
	}

	@When("^user select the Hotels from dropdown$")
	public void user_select_the_Hotels_from_dropdown() throws Throwable {
		SearchHotel sh =new SearchHotel();
		dropDown(sh.getHotels(), "Hotel Sunshine", "value");
		
	}

	@When("^user select the Room type from dropdown$")
	public void user_select_the_Room_type_from_dropdown() throws Throwable {
		SearchHotel sh =new SearchHotel();
		dropDown(sh.getRoomType(), "Deluxe", "value");
		Thread.sleep(2000);

	}

	@When("^user select the Number of Rooms from dropdown$")
	public void user_select_the_Number_of_Rooms_from_dropdown() throws Throwable {
		SearchHotel sh =new SearchHotel();
		dropDown(sh.getRoomNums(), "2", "index");
		Thread.sleep(2000);
	}

	@When("^user gives the Check In Date$")
	public void user_gives_the_Check_In_Date() throws Throwable {
		SearchHotel sh =new SearchHotel();
		clearValuesintheElement(sh.getClearCheckInDate());
		enterText(sh.getCheckInDate(), "12/02/2020");
	}

	@When("^user gives the Check out Date$")
	public void user_gives_the_Check_out_Date() throws Throwable {
		SearchHotel sh =new SearchHotel();
		clearValuesintheElement(sh.getClearCheckOutDate());
		enterText(sh.getCheckOutDate(), "10/02/2020");
		Thread.sleep(2000);
	}

	@When("^user select the Adults per Room from dropdown$")
	public void user_select_the_Adults_per_Room_from_dropdown() throws Throwable {
		SearchHotel sh =new SearchHotel();
		dropDown(sh.getAdultPerRoom(), "4", "index");
		Thread.sleep(2000);
	}

	@When("^user select the Children per Room from dropdown$")
	public void user_select_the_Children_per_Room_from_dropdown() throws Throwable {
		SearchHotel sh =new SearchHotel();
		dropDown(sh.getChildPerRoom(), "3", "index");
	
	}

	@Then("^user clicks the Search button$")
	public void user_clicks_the_Search_button() throws Throwable {
		SearchHotel sh =new SearchHotel();
		clickbt(sh.getBookSubmit());
		Thread.sleep(2000);
	}
	@Then("^user checks in CheckIn date$")
	public void user_checks_in_CheckIn_date() throws Throwable {
		SearchHotel sh = new SearchHotel();
		elementIsDisplayed(sh.getCheckinSpam());
		String text = sh.getCheckinSpam().getText();
		System.out.println(text);
		Thread.sleep(2000);
		
	}

	@Then("^user checks in Checkout date$")
	public void user_checks_in_Checkout_date() throws Throwable {
		SearchHotel sh =new SearchHotel();
		elementIsDisplayed(sh.getCheckoutSpam());
		String text = sh.getCheckoutSpam().getText();
		System.out.println(text);
		Thread.sleep(2000);
	}

	
	}


