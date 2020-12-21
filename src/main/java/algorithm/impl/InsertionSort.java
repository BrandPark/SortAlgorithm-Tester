package algorithm.impl;

import algorithm.Sort;

public class InsertionSort implements Sort{

	public int[] sort(int[] arr) {
		int tmp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i;j>=0 && arr[j] > arr[j+1];j--) {
				tmp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = tmp;
			}
		}
		return arr;
	}
	
}
