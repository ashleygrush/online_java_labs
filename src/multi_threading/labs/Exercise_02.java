package multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class TrackTime extends Thread {

    public TrackTime (String name){
        super(name);
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " " + i);
        }
    }
}

class TrackTimeController {
    public static void main(String[] args) {
        TrackTime racer1 = new TrackTime("Ashley lap time - ");
        TrackTime racer2 = new TrackTime("Max lap time - ");
        System.out.println("Race Start.");
    }
}