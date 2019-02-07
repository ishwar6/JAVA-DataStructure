
class Customer {

     String email;

     Customer(String email) {
          this.email = email;
     }

}

public class Main {

     public static void main(String args[]) {

          Customer c1 = new Customer("gamil@rediff.com");
          Customer c2 = new Customer("xyz@gmail.com");

          System.out.print(checkEmail(c1, c2, "gmail"));

     }

     public static boolean checkEmail(Customer c1, Customer c2, String email_domain) {

          String email1 = c1.email;
          String email2 = c2.email;
          email_domain = "@" + email_domain;

          if (email1.contains(email_domain) & email2.contains(email_domain)) {
               return true;
          } else {
               return false;
          }

     }

}
