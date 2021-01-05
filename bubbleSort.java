package challenge1;

public class bubbleSort {
	
	public static void main(String[] args) {
	       int[] intArray = {20,35,-15,7,55,1,-22};
	       
	       // lastunsortedindex will be 6, then decrement down the list
	       for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--)
	       {
	    	   for(int i =0; i < lastUnsortedIndex; i++)
	    	   {
	    		   if(intArray[i] > intArray[i+1])
	    		   {
	    			   swap(intArray, i, i+1);
	    		   }
	    	   }
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
