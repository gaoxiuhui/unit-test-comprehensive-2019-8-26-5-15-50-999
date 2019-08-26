package tw;

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
        for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();
            System.out.println(input);
            // step1 字符串转换为数组
            int[] inputArray=new StringToArray().stringtoArray(input);
            boolean valid=new IsValid().isValid(inputArray);
            if(!valid) System.out.println("输入错误，再次输入");
            if(valid) {
            	int Anumber=new BeforeANumber().countBeforeANumber(inputArray,CORR_ARRAY);
            	int Bnumber=new BeforeBNumber().countBeforeBnumber(inputArray,CORR_ARRAY);
            }
        }
    }
}
