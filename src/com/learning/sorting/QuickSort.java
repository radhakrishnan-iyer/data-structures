package com.learning.sorting;

public class QuickSort {
static void quickSort(int arr[], int begin, int end) {
if(begin < end) {
int i = partition (arr , begin, end);
quickSort(arr, begin, i-1);
quickSort(arr, i+1, end);
}
}

static int partition(int arr[], int begin, int end) {
// choose last element as pivot
int pivot = arr[end];
int i = begin-1;
for(int j=begin; j<=end-1; j++) {
if(arr[j] < pivot) {
	++i;
	//swap arr[i] and arr[j]
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
}
int x = arr[i+1];
arr[i+1] = arr[end];
arr[end]=x;

return i+1;
}

public static void main(String args[]) {
int arr[] = {10, 7, 8, 9, 1, 5};
quickSort(arr , 0, arr.length-1);
for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i]+" ");
}
}