package week10;

import java.util.Scanner;

public class BST_Insertion {

  public static Node insert(Node root, int data) {
    if (root == null) {
      return new Node(data);
    }
    if (root.data > data) {
      root.left = insert(root.left, data);
    } else if (root.data < data) {
      root.right = insert(root.right, data);
    }
    return root;
  }

  public static void preOrder( Node root ) {

    if( root == null)
      return;

    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);

  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    Node root = null;
    while (t-- > 0) {
      int data = scan.nextInt();
      root = insert(root, data);
    }
    scan.close();
    preOrder(root);
  }
}

class Node {

  Node left;
  Node right;
  int data;

  Node(int data) {
    this.data = data;
    left = null;
    right = null;
  }

}