Feature: FREE CRM Create Contacts

Scenario Outline: FREE CRM create a new contact scenario

Given User is already on login page
When title of login page is FREE CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on homepage
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:
	| username | password   | firstname | lastname | position |
	| kushan   | airtel@123 | mukesh	| verma	   | manager  |
	| kushan   | airtel@123 | Ravi		| sharma   | director |		
