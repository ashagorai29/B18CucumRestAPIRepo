Feature: Automate Data Driven with cucumber in Form Demo automation

  Scenario Outline: Demo AutomationFormm Credentials
  Given launch the application
    Given user enter the name as "<firstname>"
    When user enter the surname as "<lastname>"
 #   Then user post the request

    Examples: 
      | firstname | lastname |
      | Asha      | maity    |
      | Chire     | Maity    |
      | Anil      | kale     |
