
Feature:validate the demo automation form


Scenario:Demo Automation Form credentials
Given launch the browser
When launch the url
Then enter "Asha" as firstname "Maity" as lastname 
Then enter "Pune" as address "ashagorai29@gmail.com" as email
Then enter "525252" as valid phone number
Then select "FeMale" as gender
Then select "Cricket" and "Movies" as hobbies
Then  select the language
Then select skills
Then select country
Then select year month and date from date of birth tab
Then enter "demo123" as password
Then enter confirm password
Then click on submit button
Then click on refresh
