package tw.commands;


public class IsValid {
	
	public boolean isValid(int[] intArray) {
		int len=intArray.length;
		if(len!=4) 	 return false;
		for(int i=0;i<len;i++) {	
			int number1=intArray[i];
			if(number1>9||number1<0)  return false;			
			for(int j=i+1;j<len;j++) {
				int number2=intArray[j];
				if(number1==number2) return false;
			}			
		}
     return true;
	}
}
