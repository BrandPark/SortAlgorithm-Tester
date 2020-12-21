package algorithm.impl;

import algorithm.Sort;

public class SelectSort implements Sort{	
	public int[] sort(int[] arr) {
		int index = 0;
		int tmp = 0;
		for(int i=0;i<arr.length;i++) {
			int min = Integer.MAX_VALUE;
			for(int j=i;j<arr.length;j++) {
				if(min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			tmp = arr[i];
			arr[i] = arr[index];
			arr[index] = tmp;
		}
		return arr;
	}
	
	
}
