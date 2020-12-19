package com.unitedcoder.streamapi;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,25,15,30,50);
//        for(int num:list){
//            if(num%2==0)
//                System.out.println(num);
//        }
        //list.stream().filter(s->s%2==0).forEach(s-> System.out.println(s));
        list.stream().filter(s->s%2==0).forEach(System.out::println);

        List<String> names=Arrays.asList("Istanbul","Tokyo","Urumqi","Kashgar","Gulja");
        names.stream().filter(s->s.length()>4&&s.length()<7).forEach(s->System.out.println(s));
        List<String> longNames=new ArrayList<>();
        longNames=names.stream().filter(s->s.length()>4&&s.length()<7).collect(Collectors.toList());
        System.out.println(longNames);

        List<String> words=Arrays.asList("book",null,"pen",null,"sky",null);
        List<String> withoutNullValue=new ArrayList<>();
        withoutNullValue=words.stream().filter(n->n!=null).collect(Collectors.toList());
        System.out.println(withoutNullValue);

    }
}
