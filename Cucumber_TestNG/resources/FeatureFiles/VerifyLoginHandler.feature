
Feature: Verify Salesforce Login


  
  Scenario Outline: Launch the Chrome Driver

    Given Launch the chrome browser using WebDriver and wedriver manager
    And Launch the salesforceports using "https://login.salesforce.com/"
    When login to the portal using username "<username>" and password "<password>" and submit  

    
    Then Click on Logout it should throwerror
    And Logout from Salesforce Website 
    And verify the redirect


    
     Examples: 
      | username  | password | 
      | shailahandigol2gmail.com |    Hanuman$84 | 
      
   

 
   
  

   
