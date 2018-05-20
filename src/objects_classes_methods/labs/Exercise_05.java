package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 5:
 *
 *      Demonstrate the use of static instance variables. Create a class with at least one static variable
 *      and one non-static variable. Create a few objects of that class and set the values of the variables.
 *      Use System.out.println to demonstrate when the variables are changed.
 *
 */

class Dog{
// Non-static variable
    private int size;
    private static int numOfDogs;

// Get/Set
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

// Constructor for Dog
    Dog() {
        numOfDogs++;
    }

// Print out results:
    public static void main(String[] args) {
        Dog a = new Dog();
        Dog b = new Dog();
        a.setSize(40);
        b.setSize(60);
        System.out.println("Dog A weighs " + a.getSize() + " lbs.");
        System.out.println("Dog B weighs " + b.getSize() + " lbs.");
        System.out.println("There are a total of " + numOfDogs + " dogs being counted.");
    }
}