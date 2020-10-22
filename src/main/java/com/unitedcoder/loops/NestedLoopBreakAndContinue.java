package com.unitedcoder.loops;

public class NestedLoopBreakAndContinue {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=10;j++){//123
                if(j%4==0){
                    //break;
                    continue;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
