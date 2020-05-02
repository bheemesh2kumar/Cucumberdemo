Feature: employee table validation 
	Description: Validate that if employee table is having correct records

Scenario: Validate employee table 
	Given user is able to connect mysll database 
	
@employeetableval 
Scenario: Validate employee table records 
	Given user is already connected mysql database 
	Then employee column values of empid,empname,empsal,empdept should be displayed as below 
		|120  |ramesh |5000  |software|
		
		
		
		
		
		
		
