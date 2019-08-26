package tw.commands;

import java.lang.Integer;
public class IsValid {
	
	public boolean isValid(int[] intArray) {
		int i=0;
		for(;i<str.length();i++) {	
			int res=Integer.parseInt(String.valueOf(str.charAt(i)));
			if(res>9||res<0) {
				return false;			
			}
			
		}
		if(i!=4) return false;
	}
}
