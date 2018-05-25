package inheritance.labs;

/**
 * Inheritance Exercise 1:
 *
 *      1) Create one super class Class1 and two subclasses Class2 and Class3.
 *          -Class2 should extend Class1.
 *          -Class3 should extend Class2.
 *      2) Each class should have at least two instance variable, all private.
 *      3) Create getters and setters for all instance variables and demonstrate setting superclass
 *          variables from a subclass
 *      4) Demonstrate the use of (non getter and setter) methods in a superclass from a subclass.
 *      5) Add constructors to each class and demonstrate the use of a superclass constructor
 *          from a subclass.
 *      6) Demonstrate constructor overloading and the use of the "super" keyword.
 *      7) Demonstrate method overloading.
 *
 *      NOTE: We encourage you to be creative and try to think of an example of your own for this
 *       exercise but if you are stuck, some ideas include:
 *
 *       - A Vehicle superclass, with Truck and Motorcycle subclasses.
 *       - A Restaurant superclass, with Gourmet and FastFood subclasses.
 *
 *
 */


// A class for fish tanks.
class FishTank {
    // contains air + water.
    private int air; // air (0 no air/oxygen needed - 10 needs air/oxygen)
    private int water; // water gallon size (10,15,30, 60 gal)

    // accessor methods
    public int getAir() {
        return air;
    }

    public void setAir(int air) {
        this.air = air;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }
    void TankRequirements() {
        System.out.println("This fish tank needs " + air + " percentage of air and " + water + " gallons of water.");
    }

    // default constructor
    FishTank( int air, int water ) {
        air = 0;
        water = 0;
    }
}

// a subclass for fish tank water types
class FishWater extends FishTank {

    private String style;
    // contains fresh water + salt water.
    FishWater(int air, int water) {
    super(4,30);
    }
    int TankSize() {
        return getAir() + getWater();
    }
    void showStyle() {
        System.out.println("The fish tank is a " + style + " water tank.");
    }
}

// a subclass for fish tank chemicals
class FishHabitat   {
    public static void main(String[] args) {


        // contains habitats fresh water and salt water.
        FishWater fresh = new FishWater(10, 30);
        FishWater salt = new FishWater(0, 30);

        System.out.println("info for fresh water tank ");
        fresh.TankRequirements();
        fresh.showStyle();
        System.out.println("This style fish tank needs a percentage of " + fresh.TankSize() + " amount of air.");

        System.out.println("Info for salt water tank ");
        salt.TankRequirements();
        salt.showStyle();
        System.out.println("This style fish tank needs a percentage of " + salt.TankSize() + " amount of air." );
    }
}

