package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Area and Perimeter
 *
 *      Write the necessary code to calculate the area and perimeter of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 *
 * Formula :
 *
 * D is the diameter, h is the height, r is the radius.
 * Diameter = 2r
 *
 * Perimeter = 2 ( pi D +  h) or 2(pi + (r*2) = h).
 * Area = 2πrh+2πr2
 *
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        double h, pi, r, d, P, A;

        pi = 3.14;
        r = 3.14;
        h = 5;

        d = (2 * r);
        P = 2*pi*(r*2)+h;
        A = (2*pi*r*h)+(2*pi*d);

        System.out.println("The perimeter is " + P +
                " and the area is " + A);



    }
}
