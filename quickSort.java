package challenge1;

public class quickSort {
	
	public static void main(String[] args) {
		
		 int[] intArray = {20,35,-15,7,55,1,-22};
		 quickSorting(intArray, 0, intArray.length);
		 for(int i=0; i<intArray.length; i++)
	    	   System.out.println(intArray[i]);
	}
	
	public static void quickSorting(int[] input, int start, int end)
	{
		//bc then were dealing with a 1 elem array (sorted).. we need to deal with more than one elem to sort 
		if(end-start<2) {
			return;
		}
		//returning the position of the pivot in its sorted position
		int pivotIndex = partition(input,start,end);
		quickSorting(input,start,pivotIndex);
		quickSorting(input, pivotIndex+1, end);
		
	}
	
	public static int partition(int[] input, int start,int end)
	//this is using the first element as pivot
	{
		int pivot = input[start];
		int i= start;
		int j = end;
		
		while (i<j) {	
			
			//NOTE: empty loop body
			while(i<j && input[--j] >= pivot); 
			//dropping this if statement bc we found an element less than pivot so we move it to position i
			if(i<j) {
				//moving all elements less than pivot to the left 
				input[i] = input[j];
			}
			
			while(i<j && input[++i] <= pivot);
			//dropping this if statement bc we found an element greater than pivot so we move it to position j
			if(i<j) {
				input[j] = input[i];
			}	
		}
		
		input[j] = pivot;
		return j;
		
	}
}
