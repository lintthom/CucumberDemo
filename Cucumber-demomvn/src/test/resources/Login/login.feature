Feature: To Validate the Login of the Application

Scenario: To test Login with Valid credentials

Given Login Page
When Enter a Valid user name "Admin"
And Enter a Valid password "admin123"
And Click on submit button
Then Login is Successful and see user name as "Welcome Paul"
