package Practical3;

public class sleepmethod extends Thread {

    public void run() {
        int count = 0;
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                count++;
                System.out.println(count);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
