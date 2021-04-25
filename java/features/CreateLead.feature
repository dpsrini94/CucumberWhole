Feature: CreateLead Functionality for Leaftaps page

Scenario: TC002_Creating Lead with multiple test data

Given Enter username as DemoSalesManager
And Enter password as crmsfa
When Login button is clicked
Then Home page is displayed
When crmsfa link is clicked
Given click leads in the homepage on top
And Click Create Lead
And Enter the company name as <cname>
And Enter the first name as <fname>
And Enter teh second name as <sname>
When CreateLead is clicked and submitted
Then Create Lead is created 
Examples:
|cname|fname|sname|
|'HCL'|'Dhivya'|'Srinivasan'|
|'COngruent'|'Raghavan'|'Sivasankar'|