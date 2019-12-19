public class Test {
    public static void main(String[] args) {
        First first1 = new First();
        First first2 = new First();
        First first3 = new First();
        new Thread(first1).start();
        new Thread(first2).start();
        new Thread(first3).start();
    }
}
