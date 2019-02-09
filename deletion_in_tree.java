
class Node {

     int data;
     Node left, right, root;

     Node(int data) {
          this.data = data;
     }

     public void insert(int value) {

          if (data <= value) {

               // System.out.printf("put the new node in right and data is ", value,
               // data);

               if (right == null) {
                    right = new Node(value);
                    if (root == null) {
                         root = right;
                    }
               } else {
                    right.insert(value);
               }

          } else {
               // System.out.printf("GO to left this time ", value, data);
               if (left == null) {
                    left = new Node(value);
                    if (root == null) {
                         root = right;
                    }
               } else {
                    left.insert(value);
               }
          }

     }

     public boolean contain(int value) {

          if (data == value) {
               return true;
          } else if (data > value) {
               System.out.printf("put the new node in left   and data is  ", value, data);

               if (left == null) {
                    return false;
               } else {
                    return left.contain(value);
               }

          } else {
               System.out.printf("GO to right this time value is   and data here is  ", value, data);
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

public class Main {

     public static Node deleteNode(Node root, int value) {
          if (root == null)
               return null;
          if (root.data > value) {
               System.out.printf("put the new node in left   and data is  ");
               root.left = deleteNode(root.left, value);
          } else if (root.data < value) {
               System.out.printf("put the new node in Right   and data is  ");
               root.right = deleteNode(root.right, value);

          } else {
               // if nodeToBeDeleted have both children
               if (root.left != null && root.right != null) {
                    Node temp = root;
                    // Finding minimum element from right
                    Node minNodeForRight = minimumElement(temp.right);
                    // Replacing current node with minimum node from right subtree
                    root.data = minNodeForRight.data;
                    // Deleting minimum node from right now
                    deleteNode(root.right, minNodeForRight.data);

               }
               // if nodeToBeDeleted has only left child
               else if (root.left != null) {
                    System.out.printf("has only left child   and data is  ", value);
                    root = root.left;
               }
               // if nodeToBeDeleted has only right child
               else if (root.right != null) {
                    root = root.right;
               }
               // if nodeToBeDeleted do not have child (Leaf node)
               else
                    root = null;
          }
          return root;
     }

     public static Node minimumElement(Node root) {
          if (root.left == null)
               return root;
          else {
               return minimumElement(root.left);
          }
     }

     public static void main(String args[]) {

          Node n = new Node(12);
          n.insert(2);
          n.insert(5);
          n.insert(3);
          n.insert(43);
          n.insert(2);
          n.insert(53);
          n.insert(83);
          n.insert(43);
          n.insert(24);
          n.insert(53);
          n.insert(37);
          n.insert(43);
          boolean b = n.contain(3);
          System.out.println(b);
          // n.inorder_traverse();
          System.out.println("right");
          // n.pre_order_traverse();

          n.post_order_traverse();
          Node nn = deleteNode(n, 2);
          nn.post_order_traverse();

     }

}
