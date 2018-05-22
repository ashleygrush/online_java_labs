package objects_classes_methods.labs.CarDealer;

public class Car {

    private String make;
    private String model;
    private int mileage;
    static int numCarsCreated;
    private boolean sold = false;


    public Car(String make, String model, int mileage) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        numCarsCreated++;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public static int getNumCarsCreated() {
        return numCarsCreated;
    }

    public static void setNumCarsCreated(int numCarsCreated) {
        Car.numCarsCreated = numCarsCreated;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", sold=" + sold +
                '}';
    }
}
