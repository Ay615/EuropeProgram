package com.unitedcoder.loops;

public class ForEachLoop {
    public static void main(String[] args) {
        //for each loop -- 10 20 30 40 50
        int sumOfArgs = 0;
        for (String each : args) {
            System.out.println(each);
            sumOfArgs = sumOfArgs + Integer.parseInt(each);
        }
        System.out.println(sumOfArgs);

//        for(int i=0;i<args.length;i++){//5
//            System.out.print(args[i]+" ");//args[0]  args[1]  args[2]  args[3] args[4]
//        }
    }
}
