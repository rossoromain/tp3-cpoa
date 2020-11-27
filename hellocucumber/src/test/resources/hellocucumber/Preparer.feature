#Author: Romain AURY


Feature: Preparer une pizza

  Je veux pouvoir préparer un pizza spécifique

  Scenario: Trying to create 2 different cheese pizze
    Given a pizzeriaBrest A and a pizzeriaStrasbourg B
    When A creates a cheese pizza
    Then B's pizza hasn't the same name


  Scenario: Trying to create 2 same pizza from different pizzeria
    Given a pizzeriaBrest A and a pizzeriaStrasbourg B
    When A and B creates a greek pizza
    Then A's and B's pizze are the same