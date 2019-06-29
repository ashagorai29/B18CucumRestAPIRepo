Feature:First  Rest Assured test22

Scenario: Test my get method 22

Given user start the rest assured test 
When user hit the get request
When user check the limit
Then user checks the status code
#Then  user check the count or size
Then  user checks at path "MRData.CircuitTable.Circuits.CircuitId[0]" with the "albert_park" value

