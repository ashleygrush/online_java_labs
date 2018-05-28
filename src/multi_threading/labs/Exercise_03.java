package multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */

// See Example 1.

class ChampionshipRace implements Runnable{

    Thread race1;
    int count;

    // Priority thread
    public ChampionshipRace (String name){
        race1 = new Thread(this, name);
        count++;

    }

    // Second thread.

    @Override
    public void run() {

        for (int i = 0; i <= 10; i++){
            System.out.println(race1.getName() + " " + i);
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class ChampionshipRaceController {
    public static void main(String[] args) {
        ChampionshipRace runner1 = new ChampionshipRace("Ashley lap - ");
        ChampionshipRace runner2 = new ChampionshipRace("Max lap - ");
        System.out.println("Start");

        // set the priorities
        runner1.race1.setPriority(Thread.NORM_PRIORITY+2);
        runner2.race1.setPriority(Thread.NORM_PRIORITY-2);

        // start the threads
        runner1.race1.start();
        runner2.race1.start();
    }
}