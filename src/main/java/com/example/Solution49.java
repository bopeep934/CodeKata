package com.example;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.reflect.Array.set;
import static java.util.Collections.list;
import static java.util.Collections.sort;

public class Solution49 {
    public int[] solution49(int[] numbers) {
        int[] answer = {};

        ArrayList<Integer> add= new ArrayList<>();

        Arrays.sort(numbers);

        int[] result= Arrays.stream(numbers).distinct().toArray();

        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                answer[i]=numbers[i]+numbers[j];
            }
        }

        return answer;
    }
}
