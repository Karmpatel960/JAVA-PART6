package Practical4;

public class Main {
    public static void main(String[] args) {
        firstthread obj1 = new firstthread();
        Secondthread obj2 = new Secondthread();
        Thirdthread obj3 = new Thirdthread();

        System.out.println("First thread priority before Set : " + obj1.getPriority());
        System.out.println("Second thread priority before Set : " + obj2.getPriority());
        System.out.println("Third thread priority before Set : " + obj3.getPriority());

        obj1.setPriority(3);
        obj2.setPriority(5);
        obj3.setPriority(7);

        System.out.println("First thread priority : " + obj1.getPriority());
        System.out.println("Second thread priority : " + obj2.getPriority());
        System.out.println("Third thread priority : " + obj3.getPriority());

        System.out.println("Prepared By PATEL KARM HITESHKUMAR(21CE095)");

    }
}
