package example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import tw.commands.StringToArray;

public class unitTest {
	
  @Test
  void should_return_intArray_when_put_a_String() {
	    //given	 
       String str="1 2 3 4";	     
	    //when    
	   int[] result=new StringToArray().stringtoArray(str);	     	   
	     //then	 
	   int[] expect={1,2,3,4};
	   Assertions.assertArrayEquals(expect, result);
  }
}
