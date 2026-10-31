ICS4U1
Unit 3 OOP - Part A - Classes and Objects - Exercises
(Rectangle Class) Create a class Rectangle. The class has attributes length and width, each of which defaults to 1. It has methods that calculate the perimeter and the area of the rectangle. It has set and get methods for both length and width. The set methods should verify that length and width are each floating-point numbers larger than 0.0 and less than 20.0. Write a program to test class Rectangle.

(Complex Numbers) Create a class called Complex for performing arithmetic with complex numbers. Complex numbers have the form:
realPart + imaginaryPart * i , where i  is

Write a program to test your class. Use floating-point variables to represent the private data of the class. Provide a constructor that enables an object of this class to be initialized when it is declared. Provide a no-argument constructor with default values in case no initializers are provided. Provide public methods that perform the following operations: 
Add two Complex numbers: The real parts are added together and the imaginary parts are added together. 
Subtract two Complex numbers: The real part of the right operand is subtracted from the real part of the left operand, and the imaginary part of the right operand is subtracted from the imaginary part of the left operand. 
Print Complex numbers in the form (a, b), where a is the real part and b is the imaginary part.

(Enhanced Rectangle Class) Create a more sophisticated EnhancedRectangle class than the one you created in Exercise 1. This class stores only the Cartesian coordinates of the four corners of the rectangle. Define a Point class that holds the coordinates of a single point.  Include a distanceTo method that has a Point parameter and returns the distance from that point to the current point itself.  The constructor method for the EnhancedRectangle should call a set method that accepts the four coordinates as a Point array and verifies that each coordinate is in the first quadrant with no single x- or y-coordinate larger than 20.0. The set method also verifies that the supplied coordinates specify a rectangle. Provide methods to calculate the length, width, perimeter and area. The length is the larger of the two dimensions. Include a predicate method isSquare which determines whether the rectangle is a square. Write a program to test class EnhancedRectangle - it should define an array of four Points and pass the array to the EnhancedRectangle constructor.  Next, the program should test the other methods in the EnhancedRectangle class.

**Note: there is a built-in Double.compareTo() method that you can use to determine whether two double values are
 greater than, equal to, or less than each other.

