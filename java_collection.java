
import java.util.Scanner;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.PriorityQueue;
import java.lang.Comparable;

public class Main {

     public static void main(String args[]) {

          HashSet<String> staff_list = new HashSet<>();
          TreeSet<String> staff_list2 = new TreeSet<>();

          staff_list.add("Aranav");
          staff_list.add("Bob");
          staff_list.add("Cary");
          staff_list.add("Desoja");
          staff_list.add("Ishu");
          staff_list.add("Jadjav");

          staff_list2.add("Aranav");
          staff_list2.add("Bob");
          staff_list2.add("Cary");
          staff_list2.add("Desoja");
          staff_list2.add("Ishu");
          staff_list2.add("Jadjav");
          // Iterator<String> iter = staff_list.Iterator();

          System.out.println(staff_list); // [Bob, Ishu, Cary, Desoja, Aranav, Jadjav]
          System.out.println(staff_list2); // [Aranav, Bob, Cary, Desoja, Ishu, Jadjav]

          Stack<String> s = new Stack<>();
          s.push("If");
          s.push("In the");
          s.push("stack TOP");
          String head = s.peek();
          System.out.println(s);
          System.out.println(head);

          Queue<Integer> q = new LinkedList<>();
          q.add(11);
          q.add(12);
          q.add(23);
          q.add(32);
          int q_head = q.peek();
          System.out.println(q_head);
          int first = q.remove();
          System.out.println(q);

          PriorityQueue<WorkOrder> p_queue = new PriorityQueue<>();
          p_queue.add(new WorkOrder(3, "Shampoo carpets"));
          p_queue.add(new WorkOrder(1, "Fix broken sink"));
          p_queue.add(new WorkOrder(2, "Order cleaning supplies"));
          System.out.println(p_queue);

     }

}

class WorkOrder implements Comparable<WorkOrder> {
     int priority;
     String description;

     WorkOrder(int p, String s) {
          priority = p;
          description = s;
     }

     public int compareTo(WorkOrder wo) {
          if (priority == wo.priority)
               return 0;
          else if (priority > wo.priority)
               return 1;
          else
               return -1;
     }

     public String toString() {
          return description + " Has priority " + priority;
     }
}
