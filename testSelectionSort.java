import static org.junit.Assert.*;
import org.junit.Test;


public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort sort = new SelectionSort();
        
        arr = sort.basicSelectionSort(arr);
        
        /** add tests to check for this unit test **/
        assertEquals("First Index Equivalent - Positive", arr[0], Sortedarr[0]);
        assertEquals("Second Index Equivalent - Positive", arr[1], Sortedarr[1]);
        assertEquals("Third Index Equivalent - Positive", arr[2], Sortedarr[2]);
        assertEquals("Fourth Index Equivalent - Positive", arr[3], Sortedarr[3]);
        assertEquals("Fifth Index Equivalent - Positive", arr[4], Sortedarr[4]);
    }
    
    public void testNegative(){
        
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        
        SelectionSort sort = new SelectionSort();
        
        arr = sort.basicSelectionSort(arr);
        
        /** add tests to check for this unit test **/
        assertEquals("First Index Equivalent - Negative", arr[0], Sortedarr[0]);
        assertEquals("Second Index Equivalent - Negative", arr[1], Sortedarr[1]);
        assertEquals("Third Index Equivalent - Negative", arr[2], Sortedarr[2]);
        assertEquals("Fourth Index Equivalent - Negative", arr[3], Sortedarr[3]);
        assertEquals("Fifth Index Equivalent - Negative", arr[4], Sortedarr[4]);
    }
    
    public void testMixed(){
        
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -2;
        Sortedarr[3] = 7;
        Sortedarr[4] = 8;
        
        SelectionSort sort = new SelectionSort();
        
        arr = sort.basicSelectionSort(arr);
        
        /** add tests to check for this unit test **/
        assertEquals("First Index Equivalent - Mixed", arr[0], Sortedarr[0]);
        assertEquals("Second Index Equivalent - Mixed", arr[1], Sortedarr[1]);
        assertEquals("Third Index Equivalent - Mixed", arr[2], Sortedarr[2]);
        assertEquals("Fourth Index Equivalent - Mixed", arr[3], Sortedarr[3]);
        assertEquals("Fifth Index Equivalent - Mixed", arr[4], Sortedarr[4]);
    }
    
    public void testDuplicates(){
        
        int[] arr = new int[7];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = -2;
        arr[5] = -2;
        arr[6] = 7;
        
        int[] Sortedarr = new int[7];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -2;
        Sortedarr[3] = -2;
        Sortedarr[4] = 7;
        Sortedarr[5] = 7;
        Sortedarr[6] = 8;
        
        SelectionSort sort = new SelectionSort();
        
        arr = sort.basicSelectionSort(arr);
        
        /** add tests to check for this unit test **/
        assertEquals("First Index Equivalent - Duplicates", arr[0], Sortedarr[0]);
        assertEquals("Second Index Equivalent - Duplicates", arr[1], Sortedarr[1]);
        assertEquals("Third Index Equivalent - Duplicates", arr[2], Sortedarr[2]);
        assertEquals("Fourth Index Equivalent - Duplicates", arr[3], Sortedarr[3]);
        assertEquals("Fifth Index Equivalent - Duplicates", arr[4], Sortedarr[4]);
        assertEquals("Sixth Index Equivalent - Duplicates", arr[5], Sortedarr[5]);
        assertEquals("Seventh Index Equivalent - Duplicates", arr[6], Sortedarr[6]);
        
    }


}

