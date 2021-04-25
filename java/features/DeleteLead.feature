Feature: DeleteLead Functionality for Leaftaps page

Scenario: TC004_Delete lead verification check

Given Enter username as DemoSalesManager
And Enter password as crmsfa
When Login button is clicked
Then Home page is displayed
When crmsfa link is clicked
Given click leads in the homepage on top
And Click Find Lead
And Phonenumber is clicked
And phonenumber as '99'
And Click find Lead
And find first Lead I'd value 
And first lead in the result is clicked
When Click the delete lead
Given Click Find Lead1
And Enter the LeadId in field leadid
And Click find lead
And Verify lead match found or not
Then Delete Lead is done