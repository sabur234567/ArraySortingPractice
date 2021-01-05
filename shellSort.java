package challenge1;

public class shellSort {
	public static void main(String[] args) {
		int[] intArray = {20,35,-15,7,55,1,-22};
	
		//gap is >0 b/c remmeber we want it at 1
		for(int gap= intArray.length/2; gap >0; gap /=2 ) {
			
			for(int i=gap; i< intArray.length; i++)
			{
				int newElement = intArray[i];
				
				int j =i; //does the traversing
				
				while(j >= gap && intArray[j - gap] > newElement) {
					intArray[j] = intArray[j-gap];
					j -= gap;
				}
				
				intArray[j] = newElement;
			}		
		}
	
		for(int i=0; i<intArray.length; i++)
			System.out.println(intArray[i]);
	}

}
