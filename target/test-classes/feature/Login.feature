Feature: Login the application

Scenario Outline: Login with multiple data
 

 When User should enter the username as <Uname>
 And User should enter the password as <Pword>
 And User should click on the submit button
 Then user should be login successfully
 
 Examples:
 |Uname							 |  Pword			|							URL								|
 |'demosalesmanager'|	 'crmsfa'		|'http://leaftaps.com/opentaps/'|
 |'democsr'         |  'crmsfa'		|'http://leaftaps.com/opentaps/'|
 
 
 Scenario: Login should not be login successfully
 
 When User should enter the username as 'democsr'
 And User should enter the password as 'Password123@'
 And User should click on the submit button
 Then user should not be login successfully