Feature: Login functionality check of Leaftap application

Scenario Outline: TC_001 Login with credentials

Given Enter username as DemoSalesManager
And Enter password as crmsfa
When Login button is clicked
Then Home page is displayed
When crmsfa link is clicked
Then Main page is diplayed
