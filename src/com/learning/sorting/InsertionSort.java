package com.learning.sorting;

public class InsertionSort {
static void insertionSort(int a[]) {
	for(int j=1; j< a.length ; j++) {
		int temp = a[j];
		int i=j-1;
		while(i>=0 && a[i] > temp) {
			a[i+1] = a[i];
			i--;
		}
		//put temp in a[i]
		a[i+1] = temp;
	}
}

public static void main(String args[]) {
int arr[] = {10, 7, 8, 9, 1, 5};
insertionSort(arr);
for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i]+" ");
}
}