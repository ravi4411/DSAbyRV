package dsa1.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBuild {
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static class BinaryTree {
    static int idx = -1;

    static Node buildTree(int[] nodes) {
      idx++;
      if (nodes[idx] == -1) {
        return null;
      }

      Node newNode = new Node(nodes[idx]);
      newNode.left = buildTree(nodes);
      newNode.right = buildTree(nodes);
      return newNode;
    }
  }

  public static void preOrder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
  }

  public static void inOrder(Node root) {
    if (root == null) {
      return;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
  }

  public static void postOrder(Node root) {
    if (root == null) {
      return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");
  }

  public static void levelOrder(Node root) {
    if (root == null) {
      return;
    }

    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    while (!q.isEmpty()) {
      Node curr = q.remove();
      if (curr == null) {
        System.out.println();
        // queue empty
        if (q.isEmpty()) {
          break;
        } else {
          q.add(null);
        }
      } else {
        System.out.print(curr.data + " ");
        if (curr.left != null) {
          q.add(curr.left);
        }
        if (curr.right != null) {
          q.add(curr.right);
        }
      }
    }
  }

  public static int countOfNode(Node root) {
    if (root == null) {
      return 0;
    }
    int leftNodes = countOfNode(root.left);
    int rightNodes = countOfNode(root.right);
    return leftNodes + rightNodes + 1;
  }

  public static int sumOfNode(Node root) {
    if (root == null) {
      return 0;
    }
    int leftSum = sumOfNode(root.left);
    int rightSum = sumOfNode(root.right);
    return leftSum + rightSum + root.data;
  }

  public static int height(Node root) {
    if (root == null) {
      return 0;
    }
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);
    return Math.max(leftHeight, rightHeight) + 1;
  }

  // Approach 1
  // diameter through root -Complexity(n*n)
  // We are using height function to calculate height
  public static int diameter1(Node root) {
    if (root == null) {
      return 0;
    }
    int diam1 = diameter1(root.left);
    int diam2 = diameter1(root.right);
    int diam3 = height(root.left) + height(root.right) + 1;
    return Math.max(diam1, Math.max(diam2, diam3));
  }

  // Approach 2
  //isme hum diameter ke sath sath height bhi calculate krte chalenge
  //Time Complexity = O(H)
  //we have to create another class for this class name TreeInfo
  static class TreeInfo{
      int ht;
      int diam;
      TreeInfo(int ht, int diam){
          this.ht = ht;
          this.diam = diam;
      }
  }

  public static TreeInfo diameter(Node root){
      if(root==null){
          return new TreeInfo(0,0);
      }

      TreeInfo leftH =diameter(root.left);
      TreeInfo rightH = diameter(root.right);

      int myHeight = Math.max(leftH.ht,rightH.ht)+1;

      int diam1=leftH.ht+rightH.ht+1;
      int diam2 = leftH.diam;
      int diam3 = rightH.diam;

      int myDiam = Math.max(diam1,Math.max(diam2,diam3));
      return new TreeInfo(myHeight,myDiam);
  }


  public static void main(String[] args) {
    int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildTree(nodes);
    System.out.println(root.data);
    System.out.println("Preorder");
    preOrder(root);
    System.out.println();
    System.out.println("Inorder");
    inOrder(root);
    System.out.println();
    System.out.println("PostOrder");
    postOrder(root);
    System.out.println();
    System.out.println("LevelOrder");
    levelOrder(root);
    int count = countOfNode(root);
    System.out.println("Count of Nodes : " + count);
    int sum = sumOfNode(root);
    System.out.println("sum od Nodes = " + sum);
    int heightOfTree = height(root);
    System.out.println("Height of Tree = " + heightOfTree);
    int diam1 = diameter1(root);
    System.out.println("Diameter = " + diam1);
    TreeInfo diam = diameter(root);
    System.out.println("Diameter = "+ diam.diam);
  }
}
