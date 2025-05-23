Feature: login and check the numer of users

  Scenario: login with valid user
    Given Navigate to wesite
    When user enter email password the login 
    And go to admin page and save the number of users
    Then add new user and verify num. of records
    And delete this user and verify num. of records

   
