Feature: Title test

Scenario Outline: Validate title of the page. 

Given launch site with url as "https://www.google.co.in" in "<browser>"
When enter the search word as "<searchword>"
Then validate the title of the page with "<searchword>"
When close site

Examples: 
|searchword|  browser|
|abdul kalam| chrome|
|nageshwar roa| firefox|
|manalisa| opera|
|rahul dravid| chrome|
|nagarjuna| firefox|
|steve jobs| opera|
|martin lutor| edge|
|elizabeth| opera|
|kangaroo| firefox|
|god ganesh| chrome|
 