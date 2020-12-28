package algorithm.impl;

import algorithm.Sort;

public class MergeSort implements Sort{
	private int sorted[];
	
	public void merge(int [] arr, int start, int middle, int end) {
		int i = start;
		int j = middle + 1;
		int k = start;
		
		while(i <= middle && j <= end) {
			if(arr[i] <= arr[j]) {
				sorted[k++] = arr[i++];
				continue;
			}
			sorted[k++] = arr[j++];
		}
		
		if(i > middle) 
			for(int t = j;t <= end; t++) 
				sorted[k++] = arr[t];
		
		if(j > end) 
			for(int t = i; t <= middle; t++) 
				sorted[k++] = arr[t];
		
		for(int t = start; t <= end; t++) 
			arr[t] = sorted[t];
	}
	
	public void mergeSort(int [] arr, int start, int end) {
		if(start >= end) 
			return;

		int middle = (start + end)/2;
		mergeSort(arr, start, middle);
		mergeSort(arr, middle+1, end);
		merge(arr, start, middle, end);
	}
	
	public int[] sort(int[] arr) {
		sorted = new int[arr.length];
		mergeSort(arr, 0, arr.length-1);
		return arr;
	}

}
