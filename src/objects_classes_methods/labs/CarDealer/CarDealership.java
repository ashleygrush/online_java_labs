package objects_classes_methods.labs.CarDealer;

public class CarDealership {
    public static void main(String[] args) {
        Car fj = buildCar("Toyota","Cruiser", 283000);
        Car blue = buildCar("Nissan", "XTerra", 200000);
        Car lonely = buildCar("Toyota", "Prius", 0 );

        fj = sellCar(fj);
        blue = sellCar(blue);
        printCarDetails(fj);
        printCarDetails(blue);
        printCarDetails(lonely);
    }


    public static Car buildCar (String make, String model, int mileage ){
        Car car = new Car(make,model, mileage);
        return car;
    }
    public static Car sellCar (Car car){
        car.setSold(true);
        return car;
    }
    public static void printCarDetails (Car car){
        System.out.println(car.toString());
        System.out.println(car.numCarsCreated);
        System.out.println(car.getMake());
    }


}
