public class Main {
    volatile static int counter = 0;
    public static void main(String[] args) {
         Thread t = new Thread(new Animal("T" , 3));
         Thread l = new Thread(new Animal("L" , 10));
         t.start();
         l.start();
         //comment


    }
}