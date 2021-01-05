package challenge1;

public class countingSort { //unstable algorithm
	public static void main(String[] args) {
		int intArray[] = {2,5,9,8,2,8,7,10,4,3};
		
		countingSort(intArray,1,10);
		//print 
		for(int i=0; i<intArray.length; i++)
			System.out.println(intArray[i]);
	}
	public static void countingSort(int[] input, int min, int max) { //max and min are our ranges, aka our assumptions
		
		int[] countArray = new int[max-min +1]; // our array  that keeps the count of all values
		
		//counting phase
		for(int i=0; i<input.length; i++) {
			//for an ex were looking at 5.. so its 5-1=4... is the position were going to increment in countArray
			countArray[input[i] - min]++;
		}
		//j is the index were going to use to write to the input array and i is used to traverse countArray
		int j = 0;
		//
		for(int i=min; i<=max; i++) {
			while(countArray[i-min] >0) { //each element has a count and it can be greater than 1... 
				input[j++] = i;
				countArray[i-min]--;
			}
		}
	}
}
