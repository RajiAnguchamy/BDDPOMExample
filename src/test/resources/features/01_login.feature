Feature: CRM login feature

#Scenario: Valid Login Scenario
#Given User is already on login page
#When User enters login credentials
#   | Rajiramesh417@gmail.com | Success@123 |
#Then User is on home page
#And close the browser

Scenario: Valid Login Scenario
Given User is already on login page
When User enters login credentials
   | username | password |
   | Rajiramesh417@gmail.com | Success@123 |
Then User is on home page
And close the browser