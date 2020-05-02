Feature: validation of commodities module 
Description: different commodities module in moneycontrol site

Scenario: validation of sensexboard in commodities page
Given user is on commodities home page 
When user is able to see sensex borad
And user is able to click on down navigation button 
And user is able to click on up navigation button 
Then user is able to see Cutomize link 
 
