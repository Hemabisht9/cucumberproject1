@LoginFeature 
Feature: Techfios Other billing login page functionality validation



Scenario Outline: User should be able to login with valid credentials 
	and open a new account	
	 Given User is on the techfios login page
	When User enters username as "<username>" 
	When User enters  password as "<password>"
	And User clicks on login button
	Then User should land on Dashboard page 
	And User clicks on bankandCash button
	And User clicks on newAccount button
	And User enters accountTitleas as "<accountTitle>"
	And User enters description as "<description>"
	And User enters initialBalance as "<initialBalance>" 
	And User enters accountNumber as "<accountNumber>"
	And User enters contactPerson as "<contactPerson>" 
	And User enters Phone as "<Phone>"  
	And User enters internetBankingURL as "<internetBankingURL>"
	And User clicks on submit button
	Then User should be able to validate account created successfully
	
	Examples: 
	|    username     |password|accountTitle   |description    |initialBalance|accountNumber|contactPerson   | phone        |internetBankingURL         |
	|demo@techfios.com|abc123  |john           |bank of america|$ 3456     |46578333        | John           | 3456573456   |https://www.techfios.com/|
  
 
 
