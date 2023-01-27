# string-operations-analyzer
Java recursive function that create a tree of operations from a given string input.

Created a function that take as input a string in the format "<5, 6, +>" and return a tree representing the sequence of operations with the right order. 

The string has 3 parameters that can be a digit, an operator or a nested string representing another operation with corresponding operator and values.

Ex. "<digit, digit, operator>" --> "< 5, 6, + >"
Ex. "<<digit, digit, operator>, <digit, digit, operator>, operator>" --> "<<5,6,+>, <6,4,->, +>"

Each output tree represented the initial string with operator as a root and digit as leafs of the tree.

For the first example the output tree is: 
     +
  5     6 

For the second example the output tree is:

     +
  +      -
5   6  6   4

The project is fully written in Java with JUnit tests based on TDD practices and abstracted with corresponding digits and operator classes.

