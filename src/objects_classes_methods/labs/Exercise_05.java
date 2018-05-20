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







/**
class Plant {

    int root;   // how many roots/plants will fit (1-2)
    int water;  // cups of water needed for a pot (1-4 cups)
    int soil;   // cups of soil needed for a pot (2-6 cups)

    // cups + water for growth
    int growth() {return water + soil;}

}

class Gardening {
    public static void main(String[] args) {

        Plant basil = new Plant();
        Plant tomatoe = new Plant();

        int bpot, tpot;

        // assign values
        basil.root = 2;
        basil.water = 1;
        basil.soil = 2;

        tomatoe.root = 1;
        tomatoe.water = 2;
        tomatoe.soil = 4;

        // get growth info

        bpot = basil.growth();
        tpot = tomatoe.growth();

        System.out.println("Basil uses " + basil.root + " roots to grow in pot size of " + bpot + " cups.");
        System.out.println("Tomatoe uses " + tomatoe.root + " roots to grow in pot size of " + tpot + " cups.");

    }

}
*/