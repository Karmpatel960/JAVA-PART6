package Practical1;

public class runnableint implements Runnable {
    public void run() {
        try {
            System.out.println("Hello World By Runnable Interface");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
