Feature: EditLead Functionality for Leaftaps page

Scenario: TC003_Edit the lead with different test data

Given Enter username as DemoSalesManager
And Enter password as crmsfa
When Login button is clicked
Then Home page is displayed
When crmsfa link is clicked
Given click leads in the homepage on top
And Click Find Lead
And Click Phone number
And phonenumber as <phoneNumber>
And Click find Lead
And Get the first Lead I'd value
And click the first lead in the result
When click edit
Given companyName <comName>
And click update
Then Edited lead is displayed

Examples:
|phoneNumber|comName|
|'98'|'Aspire Systems'|
