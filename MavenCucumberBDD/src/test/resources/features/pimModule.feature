
Feature: Test PIM functionality in OrangeHRM application

Background: 
    Given user is already in OrangeHRM login page
    And logged in with valid username and password
    And click on PIM link

  Scenario: Verify PIM Creation
   When User click on AddEmployee menu
    And enters firstname, lastname click on save button
    And close the browser for OrangeHRM
 		
  Scenario: Verify PIM Modification
  When user click on EmployeeList menu and type name in hint and click on search button
  And click on edit button and update middle name in personal Details and click on Save button 
  And close the browser for OrangeHRM  
  
   Scenario: Verify PIM Deletion
  When user click on EmployeeList menu and type hint and click on search button
  And select checkbox  and click on delete button
  And click on yes as given delete popup
  And LogOut OrangeHRM Application 
  And close the browser for OrangeHRM
   