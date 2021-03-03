Feature: Landing page
  Agile Story: As a user, I should be able to see important functionalities of google landing page.

  Background: User should be on google landing page
    Given User is on the google landing page

  Scenario: Google landing page verification
    Then User should see title is "Google"
    Then User should see search box is displayed
    Then User should see Gmail link
    Then User should see google-apps icon
    Then User should see Settings link

  Scenario: Google landing page verification with title
    Then User should verify links on the landing page
      | About       |
      | Store       |
      | Gmail       |
      | Images      |
      | Ads         |
      | Commitments |
      | Business    |
      | Discover    |
      | Privacy     |
      | Terms       |




