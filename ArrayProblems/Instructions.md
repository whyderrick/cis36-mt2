# Array Problems

Write a class called `MyArray` that takes in an array. It should work for a
variable number of arguments between 3 and 20.

Define the following methods on MyArray:
- `sumWithout`. This should return a new array, the same size as your input
  array. Each value in it should equal the sum of the entire array minus the
  element at the current index.
    - Ex. Called on MyArray initialized with [1, 2, 3, 4] it should return [9, 8, 7, 6]
- `product`. This method should return an int or double depending on the types
  in your array. The return value should be the result of multiplying every
  number in the array together.
    - Ex. Called on MyArray initialized with [1, 2, 3, 4] it should return 24.
- `productR`. This should return the same as product, but should be implemented
  recursively.
- (bonus points). `sumWithoutR`. This is `sumWithout` calculated recursively.
  Hint: You'll need a  way to keep track of your new array.
