Feature: FREE CRM login feature

#Scenario: FREE CRM login test scenario


#Given User is already on login page
#When title of login page is FREE CRM
#Then user enters "kushan" and "airtel@123"
#Then user clicks on login button
#Then user is on homepage
#Then close the browser

#Scenario: user is able to create a new contact
#Given user is already on homePage
#When user mouse hover on contacts link
#Then user clicks on new contact link
#Then user enters firstname and lastname
#Then user clicks on save button
#Then verify new contact created

#With examples keyword
Scenario Outline: FREE CRM login test scenario

Given User is already on login page
When title of login page is FREE CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on homepage
Then close the browser

Examples:
	| username | password |
	| kushan   | airtel@123 |
	| ishan12  | airtel@123 | 