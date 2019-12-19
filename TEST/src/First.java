public class First implements  Runnable{
    private  static  int ticket = 30;
    @Override
    public void run() {
        while (ticket>=1) {
            synchronized ("aaaa") {
                    if (ticket>=1) {
                        System.out.println("剩余 " + (--ticket) + " " + Thread.currentThread());
                    }
                }
        }
    }
}
