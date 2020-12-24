package algoritm;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import algorithm.Sort;
import algorithm.impl.BubbleSort;
import algorithm.impl.InsertionSort;
import algorithm.impl.QuickSort;
import algorithm.impl.SelectSort;

public class SortTest {
	final int size = 10;
	int [] arr;
	int [] expectedArr;
	
	@Before
	public void setUp() {
		int [] case1 = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9}; 
		int [] case2 = {1,10,5,8,7,10,6,4,3,1,2,9};
		int [] case3 = {10, 7, 10, 8, 9};
		int [] case4 = {1, 7, 1, 8, 9};
		int [] expected1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		int [] expected2 = {1,1,2,3,4,5,6,7,8,9,10,10};
		int [] expected3 = {7, 8, 9, 10, 10};
		int [] expected4 = {1, 1, 7, 8, 9};
		
		arr = case2;
		expectedArr = expected2;
		
	}
	
	@Test
	public void selectSortTest() {
		SelectSort selectSort = new SelectSort();
		selectSort.sort(arr);
		assertArrayEquals(expectedArr, arr);
	}
	@Test
	public void bubbleSortTest() {
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(arr);
		assertArrayEquals(expectedArr, arr);
	}
	@Test
	public void insertionSortTest() {
		InsertionSort is = new InsertionSort();
		is.sort(arr);
		assertArrayEquals(expectedArr, arr);
	}
	
	@Test
	public void quickSortTest() {
		Sort s = new QuickSort();
		s.sort(arr);
		assertArrayEquals(expectedArr, arr);
	}
}
