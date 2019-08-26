package tw.commands;

public class BeforeBNumber {
    public int countBeforeBnumber(int[] arr1,int[] arr2) {
    	int result=0;
    	for(int i=0;i<arr1.length;i++) {
    		int number1=arr1[i];
    		for(int j=0;j<arr2.length;j++) {
    			int number2=arr2[j];
    			if(number1==number2) result++;
    		
    		}
    	}
    	return result;
    }
}
