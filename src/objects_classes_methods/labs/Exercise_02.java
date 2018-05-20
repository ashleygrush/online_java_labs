package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 2:
 *
 *      Create a class that demonstrates the following: (all methods below can be in the same class)
 *
 *      1) A static method that calls another static method.
 *      2) A static method that calls a non-static method.
 *      3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
 *      4) A non-static method1 that calls another non-static method2 and passes a value to method2.
 */


// Static to Static
class MethodCall{

// Static to non-static
    public static void main(String[] args){
        MethodCall obj = new MethodCall(); // create an object of class MethodCall
        obj.methodB(); // call methodB on the object obj

        int x = Math.subtractExact(4,2); // Math is always static, doesn't need to be an object.
    }

// none-static to non-static that returns a value
    public void methodB(){
        System.out.println("Inside methodB");
        methodD();

// non-static to non-static, passes value
    }
    public void methodD(){
        System.out.println("inside method D, outside method B.");


    }
}


