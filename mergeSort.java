package challenge1;

// Sort from decending order

public class mergeSort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSorting(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void mergeSorting(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSorting(input, start, mid);
        mergeSorting(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
    	// this partition here stops us from merging a left and right array when there is no need since its already sorted.
        if (input[mid - 1] >= input[mid]) { //change to greater than or equal to b/c it now checks if all the elements in the left array  >= elements in right array... AKA DECENDING ORDER
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
        	//comparing current elem in left partition (i) to right partition (j)... then writes the smaller of the two into a temp array
        	// <= if u want ascending order below
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];   // change to greater than or  equal to in order to keep it a stable algo.
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }

}