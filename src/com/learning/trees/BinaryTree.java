package com.learning.trees;

public class BinaryTree
{

Node root;

public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
 
        if (tree.isBSTUtil(tree.root , min, max))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
		
		min = Integer.MIN_VALUE;
		max = Integer.MAX_VALUE;
		
		tree.root = new Node(3);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(4);
		
		if (tree.isBSTUtil(tree.root, min, max))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }
static int min = Integer.MIN_VALUE;
static int max = Integer.MAX_VALUE;

static boolean isBSTUtil(Node node, int min, int max)
    {
        /* an empty tree is BST */
        if (node == null)
            return true;
 
        /* false if this node violates the min/max constraints */
        if (node.data < min || node.data > max)
            return false;
 
        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.data-1) &&
                isBSTUtil(node.right, node.data+1, max));
    }

}

class Node
{
    int data;
    Node left, right;
 
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}