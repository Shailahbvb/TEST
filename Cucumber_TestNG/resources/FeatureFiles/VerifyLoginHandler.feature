
Feature: Verify Salesforce Login

  
  Scenario Outline: Launch the chrome browser
    Given Launch the chrome browser using WebDriver and wedriver manager
    And Launch the salesforceports using "https://login.salesforce.com/"
    When login to the portal using username "<username>" and password "<password>" and submit  
   
    Then Click on cancel or logout and test
   And if cancel then cancel or logout from the website
    
     Examples: 
      | username  | password | 
      | shailahandigol2gmail.com |    Hanuman$84 | 
      
   

 
   
  

   
