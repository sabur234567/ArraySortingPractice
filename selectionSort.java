package challenge1;

public class selectionSort {
	
	public static void main(String[] args) {
		
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		//find the largest element and basically swap it with the last unsorted elem
		for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--)
		{
			int largest = 0;
			
			for(int i=1; i<= lastUnsortedIndex; i++)
			{
				if (intArray[i] > intArray[largest]) {
					largest = i;
				}
			}
			//swapping largest element with the lastUnsorted element in the array
			swap(intArray, largest, lastUnsortedIndex);
		}
		//print 
	       for(int i=0; i<intArray.length; i++)
	    	   System.out.println(intArray[i]);
	}
	
	public static void swap(int[] array, int i, int j) { //i  and j represent the elements you want to swap
    	if(i==j) {
    		return;
    	}
    	int temp = array[i];
    	array[i] = array[j];
    	array[j] = temp;
    	
    }
}
