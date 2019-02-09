
public class Main {

     public static void main(String args[]) {

          Node n = new Node(12);
          n.insert(2);
          n.insert(5);
          n.insert(3);
          n.insert(43);
          boolean b = n.contain(3);
          System.out.println(b);
          n.inorder_traverse();
          System.out.println("Order Traversal");
          n.pre_order_traverse();
          System.out.print("Postorder traverse");
          n.post_order_traverse();

     }
}

class Node {

     int data;
     Node left, right;

     Node(int data) {
          this.data = data;
     }

     public void insert(int value) {

          if (data <= value) {

               // System.out.printf("put the new node in right%d and data is %d%n", value,
               // data);

               if (right == null) {
                    right = new Node(value);
               } else {
                    right.insert(value);
               }

          } else {
               // System.out.printf("GO to left this time%d%d%n", value, data);
               if (left == null) {
                    left = new Node(value);
               } else {
                    left.insert(value);
               }
          }

     }

     public boolean contain(int value) {

          if (data == value) {
               return true;
          } else if (data > value) {
               System.out.printf("put the new node in left %d and data is %d%n", value, data);

               if (left == null) {
                    return false;
               } else {
                    return left.contain(value);
               }

          } else {
               System.out.printf("GO to right this time value is %d and data here is %d%n", value, data);
               if (right == null) {
                    return false;
               } else {
                    return right.contain(value);
               }
          }

     }

     public void pre_order_traverse() {
          System.out.println(data);
          if (left != null) {
               System.out.print("Left");
               left.pre_order_traverse();
          }
          if (right != null) {
               right.pre_order_traverse();

          }
     }

     public void inorder_traverse() {

          System.out.println(data);

          if (left != null) {
               System.out.print("Left");
               left.inorder_traverse();
          }
          if (right != null) {
               right.inorder_traverse();

          }
     }

     public void post_order_traverse() {

          if (left != null) {
               System.out.print("Left");
               left.post_order_traverse();
          }
          if (right != null) {
               right.post_order_traverse();

          }
          System.out.println(data);
     }

}
