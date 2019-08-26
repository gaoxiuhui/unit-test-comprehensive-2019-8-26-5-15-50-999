package tw;

import tw.commands.GuessInputCommand;
import tw.commands.StringToArray;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

    private static final int RUN_TIMES = 6;
    private static final String CORR_NUMBER = "4 2 1 6";
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();
            System.out.println(input);
            // step1 字符串转换为数组
            int[] inputArray=new StringToArray().stringtoArray(input);
        }
    }
}
