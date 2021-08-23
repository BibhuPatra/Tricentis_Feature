Feature: Feature to test login fuctionality

Scenario: Check login is sucessful with valid credential

	Given user is on login page 
	When  User click on login link
	And put the credentials
	Then Click on login button
	#And close 

Scenario: Add to cart
	Given user is on home page with authenticated
	When user hover upon Coumpter in Navbar
	And clicking on the Desktop
	Then adding first product coming in the output
	And close
	
	
	
	
