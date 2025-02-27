package com.example;

import java.util.ArrayList;
import java.util.List;

public class Solution46 {
    public int solution46(String s){
        int answer =0;
        List<String> a= new ArrayList<>();

        a.add(0,"zero");
        a.add(1,"one");
        a.add(2,"two");
        a.add(3,"three");
        a.add(4,"four");
        a.add(5,"five");
        a.add(6,"six");
        a.add(7,"seven");
        a.add(8,"eight");
        a.add(9,"nine");

        for( int i=0; i<a.size() ;i++ ){
            if(s.contains(a.get(i))){
            s=s.replaceAll(a.get(i), String.valueOf(i));}
        }
        return Integer.parseInt(s);

    }
}
