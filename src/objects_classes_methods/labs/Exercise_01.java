package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 1:
 *
 *      Create three classes, all of which can be inside this file. The first class (the controller)
 *      should have the main method. The main method should create at least two objects using the
 *      constructors of the second and third class. The second and third class should each have at least
 *      three instance variables that should be set using the constructor when an object is created.
 *
 *      Once the objects are created, try changing the values of some of the instance variables.
 *
 *      Think about some of the examples we have seen from the lectures or Confluence Docs.
 *
 *      Be creative. Have some fun. Using Java objects you can model just about anything you want.
 *      Cars, animals, poker games, sports teams, trees, beers, people and so on.
 */

// Class 1 - Coffee Control: Main
// Needs to make two objects using second and third class.

class CoffeeControl {
    public static void main(String[] args) {

        // construct coffee blend.
        Coffee african = new Coffee(5, 2, 1);
        Coffee italian = new Coffee(  2, 2, 2);
        Coffee french = new Coffee(2, 3, 2);

        Brew small = new Brew(8, 170,2, african);
        Brew medium = new Brew( 12, 170, 4, italian);
        Brew large = new Brew(16, 170, 6, french);



        System.out.println("African Blend has a caffeine level of " + small.coffee.caffeine +
                " shot(s) of espresso per " + small.coz + " oz. cup of coffee.");


        System.out.println("Italian Blend has a caffeine level of " + medium.coffee.caffeine +
                " shots of espresso per " + medium.coz + " oz. cup of coffee.");


        System.out.println("French Blend has a caffeine level of " + large.coffee.caffeine +
                " shots of espresso per " + large.coz + " oz. cup of coffee.");

    }

}


// Class 2 - Coffee blends
// needs three instance variables using the constructor
class Coffee {

        int region; //region of coffee (1-7)
        int roast; // light (1), medium (2) or dark (3)
        int caffeine; // decaf (1) or regular (2)

// constructor for coffee.
    Coffee (int region, int roast, int caffeine) {
        this.region = region;
        this.roast = roast;
        this.caffeine = caffeine;
    }

}



// Class 3 - Coffee brewing process
// needs three instance variables using the constructor
class Brew {

        int water; // oz water needed
        int heat; // boiling temp (usually 160-175 degrees)
        int coz; // oz of coffee needed
        Coffee coffee;

// constructor for brewing coffee.
    Brew (int water, int heat, int coz, Coffee coffee) {
        this.water = water;
        this.heat = heat;
        this.coz = coz;
        this.coffee = coffee;
    }

}

