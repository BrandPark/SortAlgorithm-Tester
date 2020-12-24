package algorithm.impl;

import algorithm.Sort;

public class QuickSort implements Sort{
	public void quickSort(int [] arr, int start, int end) {
		int key = start;
		int left = start+1;
		int right = end;
		int tmp;
		if(start >= end) 
			return;
		
		while(true) {
			while(!(arr[left] > arr[key] ) && left < end) left++;	//key값보다 큰 left값을 우측방향으로 검색
			while(!(arr[right] < arr[key]) && right > key) right--;	//key값보다 작은 값을 왼쪽방향으로 검색
			
			if(left >= right) {		//left와 right가 엇갈리면 key값과 그보다 작거나 같은 값인 right값을 스위칭 후 break
				tmp = arr[key];
				arr[key] = arr[right];
				arr[right] = tmp;
				break;
			}
			tmp = arr[right];
			arr[right] = arr[left];
			arr[left] = tmp;
		}
		quickSort(arr, start, right-1);
		quickSort(arr,right+1, end);
	}
	
	public int[] sort(int[] arr) {
		quickSort(arr, 0,arr.length-1);
		return arr;
	}
}
