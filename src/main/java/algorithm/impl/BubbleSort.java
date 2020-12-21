package algorithm.impl;

import algorithm.Sort;

public class BubbleSort implements Sort{
	public int[] sort(int[] arr) {
		int tmp;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
}
