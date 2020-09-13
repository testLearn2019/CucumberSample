Feature: Login feature

Scenario Outline: Verify Login Page
Given Application URL
When valid "<username>" and "<password>" is entered
And Login button is clicked

Examples:

| username | password |
| admin    | admin123 |
| admmm    | fafkj    |
