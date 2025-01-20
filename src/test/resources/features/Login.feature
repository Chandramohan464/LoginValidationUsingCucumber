@SmokeFeature
Feature: Login Functionality
  @smoketest
  Scenario Outline: Valid Login
    Given I am on the login page
    When I enter valid "<username>" and password
    Then I should be redirected to the homepage
    Examples:
      | username |
      | standard_user |
      | problem_user |
      | performance_glitch_user |
      | error_user |
      | visual_user |