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


// Class 1 - Coffee Controller
// Needs to make two objects using second and third class.
class Coffee {

        int region; //region of coffee (1-7)
        int roast; // light (1), medium (2) or dark (3)
        int caf; // decaf (1) or regular (2)

// constructor for coffee.
    Coffee (int region, int roast, int caf) {
        this.region = region;
        this.roast = roast;
        this.caf = caf;
    }
// return, which roast is strongest?
        int range () { return roast + caf;}


// Which region has the strongest coffee?
        int strongest = region + range();

}


// Class 2 - Dark coffee blends.
// needs three instance variables using the constructor
class DarkCoffee {
    public static void main(String[] args) {

    // construct coffee blend.
    Coffee african = new Coffee(5, 2, 2);
    Coffee italian = new Coffee(  2, 2, 2);
    Coffee french = new Coffee(2, 3, 2);

    int level;
    int scale = 10;

    level = african.strongest - scale;

    System.out.println("African Blend has a caffeine level of " + level +
                " on a scale of "+ scale);

    level = italian.strongest = scale;

    System.out.println("Italian Blend has a caffeine level of " + level +
                " on a scale of " + scale);

    level = french.strongest = scale;

    System.out.println("French Blend has a caffeine level of " + level +
                " on a scale of " + scale);

    }

}


// Class 3 - Light coffee blends.
// needs three instance variables using the constructor
class LightCoffee {
    public static void main(String[] args) {

     // construct
     Coffee kona = new Coffee(1,1,2 );
     Coffee brazillian = new Coffee(2,2,2);
     Coffee guatamala = new Coffee(4, 1, 1);

     int level;
     int scale = 10;

     level = kona.strongest - scale;

     System.out.println("Kona Blend has a caffeine level of " + level +
                " on a scale of " + scale);

     level = brazillian.strongest = scale;

     System.out.println("Brazilian Blend has a caffeine level of " + level +
                " on a scale of " + scale);

     level = guatamala.strongest = scale;

     System.out.println("Guatamala Blend has a caffeine level of " + level +
                " on a scale of " + scale);

    }


}