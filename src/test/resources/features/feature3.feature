Feature: Title test
@smoke
Scenario Outline: Validate if the site has https. 

Given launch site with the url as "<url>" in "<browser>" browser
Then validate site security
When close site
 
 Examples: 
 |url                       |browser |
 |http://google.com/        |chrome  |
 |https://www.flipkart.com/ |firefox |
 |https://www.myntra.com/   |edge    |
 |https://github.com/       |chrome  |
 |http://gmail.com/         |firefox |
 |https://zoom.us/          |edge    |
 |https://www.instagram.com/|chrome  |