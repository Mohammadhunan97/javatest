# java documentation:



## Mostly Variable stuff:

* everything is a class in java

* a public class or function is available to all other classes 

* every java class has a main function which executes first

* a static function means only a class can call for this function to execute

* void in front of a function means it does not return a value

* System.out is an object that has many functions such as System.out.println("") which is used to print a string

* running javac <filename> then java <filename> is the method to compile a java program

* final is a constant variable

* int is a regular integer whole number

* declaration statement is referred to as initially declaring a variable

* expression statement is doing some math operation on variables

* bytes, shorts, ints, and longs are all integers with different ranges (with bytes having the smallest range, and 
longs having the largest range; in order from smallest to largest range), likewise they are in order from smallest to largest bit size
, for instance: byte = 8 bits, shorts = 16 bits, ints = 32 bits, and longs = 64 bits. Ints are most commonly used, 
you can see a full image of this here: <br/> ![primitive data types graph](http://xoax.net/web/crs/java/lessons/Lesson3/Image1.png)

* floats and doubles are both floating point (decimal numbers), doubles are more common and have a larger range. 
Floats are 32 bits, while doubles are 64 bits. 

* Char is a single unicode that is 16 bits

* booleans are true/false values that are less than or equal to 1 bit.

* you can cast to a different datatype by newvar = (what you want to cast to) <old var>; for instance, int foo = (int) 3.14 // which equals 3

* in order to convert numbers to Strings you must do dataType.toString(variable) for instance String foo =  Integer.toString(15);

* to convert a string to a number you can do foo = dataType.parseInt("<number>"); for instance int foo = Integer.parseInt("3"); or float bar = Float.parseFloat("3.14159141552");


# Part two:

* you can import an external class by import java.util.<classname> or java.util.* to import the entire java util library
; for example java.util.Scanner;
*  Scanner userInput = new Scanner(System.in); defines a variable which is a new Scanner object, which takes the parameter of what type of scanner you would like to use, in this case System.in (aka user keyboard)

* to check if a user input is a certain type you can run userInput.hasNext<data type>()  for instance if(userInput.hasNextInt()){}

* you can store the value of the input, by setting it to a variable like such: int numberEntered = userInput.nextInt();

* you can use the math class by doing, import java.lang.Math; at the top of the page, and including which ever math methods you need (this is very similar to javascript); for example, System.out.println((int) Math.floor(3.14));

* Xor operator if(bla ^ foo) only one can be true and the other is false. There is also a distinction with && and & and || and |, where the shorter ones are bitwise (| and &)  but the longer ones (|| and &&) are conditional and should be used commonly
