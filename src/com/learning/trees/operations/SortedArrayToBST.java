package com.learning.trees.operations;

public class SortedArrayToBST {

static Node getSortedArrayToBST(int arr[] , int start, int end) {
	if(start > end) {
		return null;
	}
	int mid = (start + end)/2;
	Node n = new Node(arr[mid]);
	n.left = getSortedArrayToBST(arr , start , mid-1);
	n.right = getSortedArrayToBST(arr, mid+1, end);
	return n;
}

static void preOrder(Node n) {
	if(n== null) {
		return;
	}
	System.out.print(n.data+" ");
	preOrder(n.left);
	preOrder(n.right);
}

public static void main(String args[]) {
	int arr[] = new int[] {1, 2, 3, 4, 5, 6, 7};
	preOrder(getSortedArrayToBST(arr , 0 , arr.length-1));
}
}

class Node {
	int data;
	Node left;
	Node right;
	Node(int d) {
		data = d;
	}
}