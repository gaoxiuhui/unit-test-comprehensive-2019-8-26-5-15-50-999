package example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import tw.commands.BeforeANumber;
import tw.commands.BeforeBNumber;
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
  
  @Test
  void should_return_2_when_count_before_A_Number_equal_location_and_equal_number() {
	    //given	 
      int[] intArray1= {1,2,3,4};	
      int[] intArray2= {5,2,3,7};
	    //when    
	  int result=new BeforeANumber().countBeforeANumber(intArray1, intArray2);    	   
	     //then	 	
	   Assertions.assertEquals(2, result);
  }  
  
  @Test
  void should_return_2_when_count_before_B_Number_only_equal_number() {
	    //given	 
      int[] intArray1= {1,2,3,4};	
      int[] intArray2= {5,1,2,7};
	    //when    
	  int result=new BeforeBNumber().countBeforeBnumber(intArray1, intArray2);    	   
	     //then	 	
	   Assertions.assertEquals(2, result);
  }  
  
  
  
  
  
  
}
