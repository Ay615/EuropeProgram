package com.unitedcoder.datatypes;

import org.apache.commons.lang3.StringUtils;

public class StringReverse {
    public static void main(String[] args) {
        // fun - nuf
        String language="Java";//a v a j
        String words="Learn java is fun";
        String s1="test automation";
//        for(int i=language.length()-1;i>=0;i--){
//            System.out.println(language.charAt(i));
//        }
        System.out.println(StringUtils.reverse(language));
        System.out.println(StringUtils.reverseDelimited(words,' ' ));
        System.out.println(StringUtils.capitalize(s1));






    }
}
