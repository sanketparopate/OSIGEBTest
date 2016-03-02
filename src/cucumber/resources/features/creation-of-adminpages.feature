Feature: Creation of Admin Pages

	Scenario: Creation of client
    Given I am on the Dashboard page
    When I Click on Admin Page
    And Add Client name and location
    Then I should see in Clients and Location in the table.
       
	Scenario: Creation of Designation
    Given I am on the Dashboard page
    When I Click on Admin Page
    And Add Designation, Skill and Experience
    Then I should see in Designation, Skill and Experience in the table.
       
	Scenario: Creation of Skill-Set
    Given I am on the Dashboard page
    When I Click on Admin Page
    And Add Skill
    Then I should see Skill in the table.
    
    Scenario: Creation of Interview Rounds
    Given I am on the Dashboard page
    When I Click on Admin Page
    And Add Name of the Interview Round
    Then I should see Interview Round in the table.
    
    	