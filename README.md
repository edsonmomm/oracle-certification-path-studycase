# Course "Java Explorer"
## Java 11 Certification Path
It contains the exercises for <a href="https://github.com/stars/edsonmomm/lists/java-certification" target="_blank">Java Explorer</a> course.<br>
Case Study: Create an APP for Human Resources

## Employee Class
Each employee has an *int* identification number, a *string* name and a *double* salary.<br>
Encapsulate all fields, and provide getter and setter methods for each.<br>
Initialize this fields with a constructor.<br>
Override *toString* method to print these fields.

## Department Class
Create additional fields as needed, as you write methods to process *Department* data.<br>
The program must not crash as a result of calling this methods.
- Create a *private Employee* array field to store all *Employees* in a *Department*;
- The *Department* should have a capacity of 10 *Employees*.
- Provide a method to add an *Employee* to the *Department*.<br>Ensure the number of *Employees* does not exceed the Department's capacity and ID is not repeated.
- Provide a method to return an array of all *Employees* in the *Department*. This array must not contain *null* values.
- Provide a method to return the number of *Employees* currently in the *Department*.
- Provide a method to identify an *Employee* based on their identification number. <br>Return the *Employee* if exists.
- Provide a method that returns the total *salary* of all *Employees* in the *Department*.
- Provide a method that returns the average *salary* of all *Employees* in the *Department*.

## HR App
This class contains a single *main* method.<br>
This where the test will be written, including test scenarios where code may be vulnerable to crash.<br>
Create a *print* statement to say the application is starting.<br>
Create new *Department*.<br>
Create a few *Employees* and add them to the *Department*.<br>
Locate an *Employee* by their identification number and call *toString* to print the information abound the *Employee*.<br>
Get every *Employee* in the *Department* and print their information.<br>
Print the total *salary* of the *Department*.<br>
Print the average *salary* of the *Department*.<br>