class Elevator implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Elevator moving to floor " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
        }
    }
}

class MusicSystem implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Playing song " + i);
            try { Thread.sleep(1500); } catch (InterruptedException e) { }
        }
    }
}

public class BuildingAutomation {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Elevator());
        Thread t2 = new Thread(new MusicSystem());

        t1.start();
        t2.start();
    }
}
