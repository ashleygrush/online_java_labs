package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 4:
 *
 *      Demonstrate method overloading with at least three overloaded methods.
 *
 */

class Overload {
    void ovlDemo() {
        System.out.println("no parameters.");
    }

    void ovlDemo(int a) {
        System.out.println("one parameter: " +a);
    }

    int ovlDemo(int a, int b) {
        System.out.println("two parameters: " +a+ " and " +b);
        return a + b;
    }
    double ovlDemo(double a, double b){
        System.out.println("two double parameters: " +a+ " and " +b);
        return a + b;
    }
}

class OverloadDemo{
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        double resD;

        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4,6);
        System.out.println();

        resD = ob.ovlDemo(1.1,2.32);
        System.out.println();

    }
}