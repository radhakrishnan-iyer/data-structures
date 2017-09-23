package com.learning.deque;
import java.util.ArrayDeque;
import java.util.Deque;

public class MaxInSubArrays {
static void findMax() {
	int arr[] = new int[] {12, 1, 78, 90, 57, 89, 56};
	int k = 3;

Deque<Integer> Qi = new ArrayDeque<>();
int i=0;
for(i=0; i<k ; i++) {
	while(!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
		Qi.removeLast();
	Qi.addLast(i);
}

for(; i<arr.length ; i++) {
	System.out.print(arr[Qi.peek()]+" ");
	
	while(!Qi.isEmpty() && Qi.peek() <= i-k)
		Qi.removeFirst();
		
	while(!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
		Qi.removeLast();
	Qi.addLast(i);	
}

System.out.println(arr[Qi.peek()]);

}

public static void main(String args[]) {
	findMax();
}

}