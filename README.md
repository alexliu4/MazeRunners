# MazeRunners
## personnel
Yin On Chan  
Alex Liu
## statement of problem
What is the boolean value of the statement "it is possible to get from the starting position to the treasure"?
## recursive abstraction 
When I am asked is it possible to get from this position to the treasure  
The recursive abstraction can return if it's possible to get from the next intersection to the treasure.
## base case
A maze with a straight path to the treasure.
## English or pseudocode description of algorithm
given a starting position
check if it's a treasure in the 4 spaces around it.  
if it is then return true.  
else check if there is a a possible path to take that has not been taken before.
if yes, return false || recursive solve starting at the starting at that intersection  
if no return false
## class(es), with fields and methods

## version*n* wish list
What is the shortest path to the treasure?
