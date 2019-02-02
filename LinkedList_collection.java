
import java.util.Scanner;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

     public static void main(String args[]) {

          LinkedList<String> staff_list = new LinkedList<>();

          staff_list.add("Aranav");
          staff_list.add("Bob");
          staff_list.add("Cary");
          staff_list.add("Desoja");
          staff_list.add("Ishu");
          staff_list.add("Jadjav");

          ListIterator<String> iter = staff_list.listIterator();

          System.out.println(iter.next()); // Aranav

          iter.add("Arun Pandey");

          iter.next(); // Moved one step again

          iter.add("Ankit Arya");
          iter.add("Ankit ");

          System.out.println(staff_list); // [Aranav, Arun Pandey, Bob, Ankit Arya, Cary,
          // Desoja, Ishu, Jadjav]

          iter.previous();
          iter.remove();
          // iter.remove(); WILL GIVE ERROR

          System.out.println(staff_list);

     }

}

// You haven't called next() on your Iterator, so it's not referring to the
// first item yet. You can't remove the item that isn't specified yet.

// Call next() to advance to the first item first, then call remove().
