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
		int [] tmpArr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int [] tmpExpectedArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		arr = tmpArr;
		expectedArr = tmpExpectedArr;
		
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
