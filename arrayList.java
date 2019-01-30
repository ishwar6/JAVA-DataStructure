
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

     public static void main(String[] args) {

          ArrayList<String> names = new ArrayList<String>();

          names.add("Bob");
          names.add("Alice");
          System.out.println(names.size());
          System.out.println(names.get(1));
          names.set(0, "Bob");
          // names.add(4, "Ishwar"); Error
          System.out.println(names.size());
          System.out.println(names.get(1));

          for (String s : names) {
               System.out.println("Item is " + s);
          }
          Scanner in = new Scanner(System.in);

          ArrayList<Double> inputs = new ArrayList<Double>();
          while (in.hasNextDouble()) {
               inputs.add(in.nextDouble());
          }

     }
}
