Feature: Title test
@smoke
Scenario Outline: Validate title of the search result. 

Given launch site with the url as "<url>" in "<browser>" browser
Then validate homepage title with "<title>" 
When close site
 
 
 Examples: 
 |url													| title   |browser|
 |http://google.com/					| google  |chrome |
 |https://www.flipkart.com/		| flipkart|Firefox|
 |https://www.myntra.com/			|myntra   |opera  |
 |https://github.com/					|github   |chrome |
 |http://gmail.com/						|gmail    |firefox|
 |https://zoom.us/						|zoom     |opera  |
 |https://www.instagram.com/	|instagram|chrome |
 |https://www.facebook.com/   |facebook |firefox|
 