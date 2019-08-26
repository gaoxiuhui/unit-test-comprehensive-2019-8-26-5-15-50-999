package tw.commands;
import java.lang.Integer;
public class StringToArray {
	
   public int[] stringtoArray(String str) {	 
	   String[] stringArray=str.split(" ");
	   int len=stringArray.length;
	   int[] intArray=new int[len];
	   for(int i=0;i<len;i++) {
		   intArray[i]=Integer.parseInt(stringArray[i]);
		   System.out.println(intArray[i]);
	   }
	   return  intArray;	   
   }
}
