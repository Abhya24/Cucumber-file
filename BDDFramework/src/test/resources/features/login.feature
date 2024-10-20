Feature: Login to Suace demmo application by Automation
Scenario Outline: Check Login is succesfull with valid creds
Given User is on Login page
When User enters valid "<username>" and "<password>"
And Click on Login button
Then User should navigate to the home  page
And Closed the browser

Examples:
| username | password |
| standard_user | secret_sauce |
| locked_out_user | secret_sauce |
| problem_user | secret_sauce |
| performance_glitch_user | secret_sauce |