package tw.commands;



public class BeforeANumber {

	public int countBeforeANumber(int[] intArray1,int[] intArray2) {
		int result=0;
		for(int i=0;i<4;i++) {
			if(intArray1[i]==intArray2[i]) {				
				result++;
			}
		}
		return result;
	}
}
