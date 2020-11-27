# Author : Romain AURY

Feature: Construire une pizzeria

  Je veux pouvoir construire des pizzeria

  Scenario: Trying to create a simple pizzeria
    Given a random String A
    And A isn't Strasbourg or Brest
    When trying to create a pizzeria of type A
    Then the pizzeria isn't created

  Scenario: Trying to create a pizzeria in Brest
    Given a string Brest A
    When trying to create a pizzeria of type A
    Then the pizzeria is created

  Scenario: Trying to create a pizzeria in Strasbourg
    Given a string Strasbourg A
    When trying to create a pizzeria of type A
    Then the pizzeria is created