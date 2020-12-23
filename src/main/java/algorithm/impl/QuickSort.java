package algorithm.impl;

import algorithm.Sort;

public class QuickSort implements Sort{
	public void quickSort(int [] arr, int start, int end) {
		int key = start;
		int i=start+1;
		int j=end;
		int tmp;
		if(start>=end) 
			return;
		while(i<j) {
			while(arr[key] >= arr[i] && i < end) i++;
			while(arr[key] <= arr[j] && j > key) j--;
			if(i >= j) {
				tmp = arr[key];
				arr[key] = arr[j];
				arr[j] = tmp;
			}
			else {
				tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
			}
			for(int k=0; k<arr.length; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
		}
		quickSort(arr, start, j-1);
		quickSort(arr,j+1, end);
		
//		 int left = start;
//	        int right = end;
//	        int pivot = arr[(start+end)/2];
//	        
//	        do{
//	            while(arr[left] < pivot) left++;
//	            while(arr[right] > pivot) right--;
//	            if(left <= right){    
//	                int temp = arr[left];
//	                arr[left] = arr[right];
//	                arr[right] = temp;
//	                left++;
//	                right--;
//	            }
//	        }while (left <= right);
//	        
//	        if(start < right) quickSort(arr, start, right);
//	        if(end > left) quickSort(arr, left, end);

	}
	public int[] sort(int[] arr) {
		quickSort(arr, 0,arr.length-1);
		return arr;
	}
}
