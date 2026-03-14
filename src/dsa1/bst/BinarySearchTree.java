package dsa1.bst;

import java.util.ArrayList;

public class BinarySearchTree {
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
    }
  }

  public static Node insert(Node root, int val) {
    if (root == null) {
      root = new Node(val);
      return root;
    }

    if (root.data > val) {
      // left Subtree
      root.left = insert(root.left, val);
    } else { // Right Subtree
      root.right = insert(root.right, val);
    }
    return root;
  }

  public static void inOrder(Node root) {
    if (root == null) {
      return;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
  }

  public static boolean search(Node root, int key) {
    if (root == null) {
      return false;
    }

    if (root.data == key) {
      return true;
    } else if (root.data > key) { // left subtree
      return search(root.left, key);
    } else { //right subtree
      return search(root.right, key);
    }
  }

  //delete a node in BST
  //Case1:- No Child(Leaf Node) - Return null to parent
  //Case2:- One Child - replace with child node
  //Case3:- Two Child - Replace value with inorder successor
  public static Node delete(Node root, int val){
      if(root == null) return null;

      //we are searching node to delete
      if(root.data>val){
          root.left = delete(root.left, val);
      }else if(root.data<val){
          root.right = delete(root.right, val);
      }else{ //root.data == null
          //case 1
          if(root.right == null && root.left == null){
              return null;
          }

          //case 2
          if (root.left == null){
              return root.right;
          }else if(root.right==null){
              return root.left;
          }

          //case 3
          Node Is = inOrderSuccessor(root.right);
          root.data = Is.data;
          root.right = delete(root.right,Is.data);
      }
      return root;
  }

  //To find inOrder successor
    private static Node inOrderSuccessor(Node root){
      while (root.left != null){
          root = root.left;
      }
      return root;
    }

    //print in range - inclusive
    public static void printInRange(Node root, int start, int end){
      if(root== null){
          return;
      }
      if(root.data>= start && root.data<=end){
          printInRange(root.left, start, end);
      System.out.print(root.data+ " ");
      printInRange(root.right,start,end);
      }
      else if(root.data>=end){
          printInRange(root.left,start,end);
      }else {
          printInRange(root.right,start,end);
      }

    }

    //Root to leaf Path
    //we will use Arraylist since arraylist does not have fix size
    private static void printRootToLeaf(Node root, ArrayList<Integer> path){
      if(root==null){
          return;
      }

      path.add(root.data);

      //leaf
        if(root.left == null && root.right == null){
            printPath(path);
        }
        else { //Non -leaf
            printRootToLeaf(root.left,path);
            printRootToLeaf(root.right,path);
        }
        path.remove(path.size()-1);
    }

    public static void printPath(ArrayList<Integer> path){
      for(int i = 0;i<path.size();i++){
      System.out.print(path.get(i)+"-> ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] values = {5, 1, 3, 4, 2, 7,0,9,6,8,12,34,56,78,11,23};
    Node root = null;
    for (int i = 0; i < values.length; i++) {
      root = insert(root, values[i]);
    }


    inOrder(root);
    System.out.println();
    boolean result = search(root,9);
    System.out.println(result);
    delete(root,718);
    inOrder(root);
    System.out.println();

    printInRange(root,6,10);
    System.out.println();

    printRootToLeaf(root, new ArrayList<>());
  }
}
