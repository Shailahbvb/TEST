
Feature: Verify Salesforce Login

  /* Comment to test Chrome browser*/
  Scenario Outline: Launch the Firefox webdriver and Chrome driver
    Given Launch the chrome browser using WebDriver and wedriver manager
    And Launch the salesforceports using "https://login.salesforce.com/"
    When login to the portal using username "<username>" and password "<password>" and submit  
   
    Then Click on Logout and verify the logs

   And Logout from Salesforce Website

    
     Examples: 
      | username  | password | 
      | shailahandigol2gmail.com |    Hanuman$84 | 
      
   

 
   
  

   
