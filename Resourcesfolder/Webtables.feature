Feature: Webtable validations
Description: Validate that if user is able to access each data in web table

Scenario: Validate that if user user is able to view company details based on group B name
Given user is on redif money gainers home page
When Webtable header name is "Top Gainers"
And User is able to see Top gainers information 
Then Validate that if user is able to click on Company name based on Group B 




