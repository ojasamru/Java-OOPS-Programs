class Cooking extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Cooking...");
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
        }
    }
}

class WatchingTV extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Watching TV...");
            try { Thread.sleep(1500); } catch (InterruptedException e) { }
        }
    }
}

public class DailyRoutine {
    public static void main(String[] args) {
        Cooking cook = new Cooking();
        WatchingTV tv = new WatchingTV();
        
        cook.start();
        tv.start();
    }
}
