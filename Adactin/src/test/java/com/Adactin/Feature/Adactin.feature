Feature: Adactin Hotel Functionality

Scenario: LogIn Page
Given user open the Chrome browser
When user open the Adactin page
And user enter the username in Username field
And user enter the Password in Password Field
Then user click the login button

Scenario: Booking page
When user select location from dropdown
And user select the Hotels from dropdown
And user select the Room type from dropdown
And user select the Number of Rooms from dropdown
And user gives the Check In Date
And user gives the Check out Date
And user select the Adults per Room from dropdown
And user select the Children per Room from dropdown
Then user clicks the Search button
Then user checks in CheckIn date
Then user checks in Checkout date