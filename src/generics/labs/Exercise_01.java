package generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

// generic class
class Generic <T> {

    // two instance variables
    T t;

    // constructor for obj
    public Generic(T t) {
        this.t = t;
    }

    // getter and setters
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

class GenericUsage {
    public static void main(String[] args) {
        Generic <Integer> intGen;

        intGen = new Generic<Integer>(11);

        intGen.toString();
        int x = intGen.getT();


        // print results
        System.out.println("Generic T is an int value of " + x);
        System.out.println();  // break

        Generic<String> stringGeneric;

        stringGeneric = new Generic<String>("Generic T is also a string.");

        stringGeneric.toString();
        String str = stringGeneric.getT();

        System.out.println(str);
    }
}

