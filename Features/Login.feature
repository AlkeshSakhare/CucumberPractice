Feature: Visit facebook.com

Scenario: View Facebook Page
	Given chrome browser is launched
	And User navigate to facebook.com
	Then verify page title
	Then close browser