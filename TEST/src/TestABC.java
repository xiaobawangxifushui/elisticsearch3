import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Ticket {
    private int ticket = 30;
    private Lock lock = new ReentrantLock();



    public  void sale() {
        List l = new ArrayList();
        try {
            if (ticket > 0) {
                System.out.println("售出第" + (ticket--) + " " + Thread.currentThread().getName());
            }
        }finally {
            lock.unlock();
        }

    }
    /*public synchronized void sale() {
        if (ticket > 0) {
            System.out.println("售出第" + (ticket--) + " " + Thread.currentThread().getName());
        }
    }*/
}

public class TestABC {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(() -> {
            for (int i = 0; i < 35; i++) ticket.sale();
        }, "a").start();
        new Thread(() -> {
            for (int i = 0; i < 35; i++) ticket.sale();
        }, "b").start();
        new Thread(() -> {
            for (int i = 0; i < 35; i++) ticket.sale();
        }, "c").start();
//        new Thread(()->ticket.sale(),"b").start();
        new Thread(ticket::sale(),"c").start();
//        new Thread(()->ticket::sale).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true){
//                    ticket.sale();
//                }
//            }
//        },"a").start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true){
//                    ticket.sale();
//                }
//            }
//        },"b").start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true){
//                    ticket.sale();
//                }
//            }
//        },"c").start();
    }
}
