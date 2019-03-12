Feature: Login feature of application 
Scenario Outline: Login page scenario with examples keyword

Given user is already on login page
When title of login page is snapdeal
When user is entred "<Username>" and "<password>"
And user is clicked on loginbutton
Then  user is on home page


Examples:
| Username  | password |
|9533538818 | @Purple1 |
|8886126745 | @Second1 |



