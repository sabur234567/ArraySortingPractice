package challenge1;

public class radixSort {
	public static void main(String[] args) {
		int intArray[] = { 4725, 4586, 1330, 8792, 1594, 5729};
		
		radixSort(intArray,10,4);
		//print 
		for(int i=0; i<intArray.length; i++)
			System.out.println(intArray[i]);
	}
	
	public static void radixSort(int[] input, int radix, int width) {
		for(int i=0; i<width; i++) {
			radixSingleSort(input, i, radix);
		}
	}
	
	public static void radixSingleSort(int[] input, int position, int radix) {
		int numItems= input.length;
		
		int[] countArray= new int[radix];
		
		for(int value: input) {
			countArray[getDigit(position,value,radix)]++;
		}
		//adjust the countArray
		for(int j=1; j<radix; j++) {
			countArray[j] += countArray[j-1];
		}
		int[] temp = new int[numItems];
		for(int tempIndex = numItems-1; tempIndex >= 0; tempIndex--) {
			temp[--countArray[getDigit(position,input[tempIndex], radix)]] = input[tempIndex];
		}
		
		for(int tempIndex=0; tempIndex <numItems; tempIndex++) {
			input[tempIndex]=temp[tempIndex];
		}
	}

	private static int getDigit(int position, int value, int radix) {
		return value/(int) Math.pow(radix,position) % radix; //if we wanted the 10s position then it would return 1
	}
}
