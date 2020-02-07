package com.Adactin.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.BaseClass.BaseClass;

public class SearchHotel extends BaseClass {
	
	@FindBy(id="location")
	private WebElement Location;
	@FindBy(id="hotels")
	private WebElement Hotels;
	@FindBy(id="room_type")
	private WebElement RoomType;
	@FindBy(id="room_nos")
	private WebElement RoomNums;
	
	@FindBy(id="datepick_in")
	private WebElement CheckInDate;

	@FindBy(id="datepick_out")
	private WebElement CheckOutDate;
	@FindBy(id="adult_room")
	private WebElement AdultPerRoom;
	
	@FindBy(id="child_room")
	private WebElement ChildPerRoom;

	@FindBy(id="Submit")
	private WebElement BookSubmit;
	
	@FindBy(id="datepick_in")
	private WebElement ClearCheckInDate;

	@FindBy(id="datepick_out")
	private WebElement ClearCheckOutDate;
	
	@FindBy(id="checkin_span")
	private WebElement checkinSpam;
	
	@FindBy(id="checkout_span")
	private WebElement checkoutSpam;
	
	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getRoomNums() {
		return RoomNums;
	}

	public WebElement getCheckInDate() {
		return CheckInDate;
	}

	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}

	public WebElement getAdultPerRoom() {
		return AdultPerRoom;
	}

	public WebElement getChildPerRoom() {
		return ChildPerRoom;
	}

	public WebElement getBookSubmit() {
		return BookSubmit;
	}
	

	public WebElement getClearCheckInDate() {
		return ClearCheckInDate;
	}

	public WebElement getClearCheckOutDate() {
		return ClearCheckOutDate;
	}

	
	public WebElement getCheckinSpam() {
		return checkinSpam;
	}

	public WebElement getCheckoutSpam() {
		return checkoutSpam;
	}

	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	

}
