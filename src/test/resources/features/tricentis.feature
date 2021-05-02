Feature: Send a Vehicle Quotation

  Scenario: Send a vehicle quote successfully
    Given I filled out all tabs from application
    When I send quote
    Then should send the quote successfully