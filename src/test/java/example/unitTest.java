package example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import tw.commands.IsValid;
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
  
  @Test
  void should_return_false_when_put_a_intArray_length_less_4() {
	    //given	 
      int[] intArray= {1,2};	     
	    //when    
	   boolean result=new IsValid().isValid(intArray);	     	   
	     //then	 	
	   Assertions.assertEquals(false, result);
  }
  
  @Test
  void should_return_false_when_put_a_intArray_length_more_4() {
	    //given	 
      int[] intArray= {1,2,3,4,5};	     
	    //when    
	   boolean result=new IsValid().isValid(intArray);	     	   
	     //then	 	
	   Assertions.assertEquals(false, result);
  }
  
  @Test
  void should_return_false_when_put_a_intArray_number_less_0() {
	    //given	 
      int[] intArray= {1,2,3,-1};	     
	    //when    
	   boolean result=new IsValid().isValid(intArray);	     	   
	     //then	 	
	   Assertions.assertEquals(false, result);
  }
  
  @Test
  void should_return_false_when_put_a_intArray_number_more_9() {
	    //given	 
      int[] intArray= {1,2,3,10};	     
	    //when    
	   boolean result=new IsValid().isValid(intArray);	     	   
	     //then	 	
	   Assertions.assertEquals(false, result);
  } 
  
  @Test
  void should_return_false_when_put_a_intArray_number_is_equal() {
	    //given	 
      int[] intArray= {1,2,3,2};	     
	    //when    
	   boolean result=new IsValid().isValid(intArray);	     	   
	     //then	 	
	   Assertions.assertEquals(false, result);
  } 
  
  @Test
  void should_return_true_when_put_a_intArray_is_valid() {
	    //given	 
      int[] intArray= {1,2,3,4};	     
	    //when    
	   boolean result=new IsValid().isValid(intArray);	     	   
	     //then	 	
	   Assertions.assertEquals(true, result);
  }  
  
  
  
  
  
  
}
