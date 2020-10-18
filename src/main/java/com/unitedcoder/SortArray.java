package com.unitedcoder;

public class SortArray {
    public static void main(String[] args) {
        int a[] = {2, 5, 8, 4, 3};
        int temp;
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }

    }
}
