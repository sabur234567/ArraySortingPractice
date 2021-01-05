package challenge1;

public class insertionSort {

	public static void main(String[] args) {
		 int[] intArray = {20,35,-15,7,55,1,-22};
		 
		 for(int firstUnsortedIndex =1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++)
		 {
			 int newElement = intArray[firstUnsortedIndex];
			 
			 int i;
			 //we want to look for the insertion position as long as we havent hit the front or element is greater than the one were trying to insert
			 for( i= firstUnsortedIndex; i>0 && intArray[i-1] > newElement; i--)
			 {
				 //shifting from left to right
				 intArray[i] = intArray[i-1];
			 }
			 intArray[i] = newElement;
		 }
		 
		 
		//print 
	       for(int i=0; i<intArray.length; i++)
	    	   System.out.println(intArray[i]);
	}
	
	
}
