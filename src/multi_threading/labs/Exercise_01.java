package multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      Create an application that creates a Thread using the Runnable interface
 */

class TrackRunning implements Runnable{

    Thread runner;

    public TrackRunning (String name){
        runner = new Thread(this, name);
        runner.start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 2; i++){
            System.out.println(runner.getName() + " " + i);
        }
    }
}

class TrackRunningController {
    public static void main(String[] args) {
        TrackRunning lap1 = new TrackRunning("Ashley lap - ");
        TrackRunning lap2 = new TrackRunning("Max lap - ");
        System.out.println("Run complete.");
    }
}
