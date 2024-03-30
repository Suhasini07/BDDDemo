Feature: Test login functionality

  Scenario: Verify error message when user enters invalid username or password
    And user is on login page
    When user enter valid username and invalid password
    And user clicks on login button
    Then user logged in successfully
    
    #Scenario: Verify login page when user enter valid username and password
    #Given: Browser is launched
     #And user is on login page
    #When user enter valid username and valid password
    #And user clicks on login button
    #Then user logged in successfully
    #Then user gets logged out
   
    
