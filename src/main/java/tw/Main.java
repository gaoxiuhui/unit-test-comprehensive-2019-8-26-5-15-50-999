package tw;

import java.util.ArrayList;

import tw.commands.BeforeANumber;
import tw.commands.BeforeBNumber;
import tw.commands.GuessInputCommand;
import tw.commands.IsValid;
import tw.commands.StringToArray;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

    private static final int RUN_TIMES = 6;
    private static final int[] CORR_ARRAY = {1,2,3,4};
    
    public static void main(String[] args) throws Exception {
    	System.out.println("�������ָ��");
        for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();
            System.out.print(input+":");
            // step1 �ַ���ת��Ϊ����
            int[] inputArray=new StringToArray().stringtoArray(input);
            boolean valid=new IsValid().isValid(inputArray);
            if(!valid) System.out.println("��������ٴ�����");
            if(valid) {
            	int Anumber=new BeforeANumber().countBeforeANumber(inputArray,CORR_ARRAY);
            	int Bnumber=new BeforeBNumber().countBeforeBnumber(inputArray,CORR_ARRAY);             	           	
            	System.out.print(""+Anumber+"A"+Bnumber+"B ");
            	if(Anumber!=0)
            	System.out.print(""+Anumber+"����������ȷ��λ�ú���ȷ������  ");  
            	if(Bnumber!=0)
                System.out.print(""+Bnumber+"�������Ǵ����λ�ú���ȷ������  "); 
            }
            System.out.println();
        }
    }
}
