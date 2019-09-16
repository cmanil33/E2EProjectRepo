Feature: login to the Application

Scenario Outline: Positive test case validating login
Given Initialize the browser with Chrome
And Navigate to "http://qaclickacademy.com" site
And Click on login lin in home page to land on secure sign in page
When User enter <username> and <password> and logs in
Then verify that user is successfully logged in
And close the browsers

Examples:
|username	|password	|
|test99@gmail.com	|123456	|
|test123@gmail.com	|12345	|