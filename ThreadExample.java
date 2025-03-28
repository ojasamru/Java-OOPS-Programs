class Task extends Thread {
    private String taskName;

    Task(String name) {
        this.taskName = name;
    }

    public void run() {
        System.out.println(taskName + " is executing...");
    }
}

public class Thread1 {
    public static void main(String[] args) {
        Task t1 = new Task("Task 1");
        Task t2 = new Task("Task 2");

        t1.start();
        t2.start();
    }
}
