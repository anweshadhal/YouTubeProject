@YouTubeNavigation
Feature: User should be able to naviagate to each sections of interests in YouTube

  Background: 
    Given User is on YouTube home page.

  @YouTubeMusic
  Scenario: User should be able to navigate to music section
    When User clicks on music tab on home page.
    Then should be able to naviagte to respective.

  @YouTubeMusicSearch
  Scenario Outline: User should be able to navigate to music section by searching text
    When types "<text>" in search tab.
    And hits enters
    Then should be able to naviagte to respective page.

    Examples: 
      | text                    |
      | automation step by step |
