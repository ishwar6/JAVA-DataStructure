
public class Main extends Thread {

     public static void main(String args[]) {

          Thread t = Thread.currentThread();
          System.out.print(t);
          t.setName("ishwar");
          System.out.print(t);
          // Thread.currentThread().join();

          ChildThread ct = new ChildThread();

          System.out.println("Child thread priority: " + ct.getPriority());

     

          ct.start();
     }

}

class ChildThread extends Thread {
     @Override
     public void run() {
          for (int i = 0; i < 5; i++) {
               System.out.println("Child thread");
          }
     }
}
