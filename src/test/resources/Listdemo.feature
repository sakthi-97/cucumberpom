Feature: Login Functionality
Scenario: Login
Given user must be registered
When login using below credentials
|username||password|
|abc||abc123|
|xyz||xyz123|
Then user must be in home page