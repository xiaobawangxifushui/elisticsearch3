package Thread;

public class Test {
    public static void main(String[] args) {
        Thread newThread1 = new NewThread();
        newThread1.start();
        Thread newThread2 = new NewThread();
        newThread2.start();
        System.out.println(Thread.currentThread());
    }
}
