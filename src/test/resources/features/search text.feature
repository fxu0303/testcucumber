#windows + V for clipboard
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@feature
Feature: Search Text
  I want to use google to search text

  #@backgroud 
  @scenario
  Scenario Outline: Go to url
    Given I launch web browser <browser>
    When I navigate to url <url>
    Then I check page <page>

    #And check more outcomes
    Examples: 
      | browser | url                    | page           |
      | chrome  | https://www.google.com | googlehomepage |

  #@scenario
  #Scenario: Accept cookies
    #Given I check popin cookies
    #When I click button accept all cookies
    #Then I verify the popin disappear
#
  #@scenario
  #Scenario Outline: Search text
    #Given I check popin cookiesf
    #When I set text <search text> in search field
    #And I send key <key>
    #Then I verify quantity of results
#
    #Examples: 
      #| search text              | key   | quantity of results |
      #| sirxofmesrfxrvctycrtuntn | enter |                   0 |
      #| test                     | enter | >0                  |