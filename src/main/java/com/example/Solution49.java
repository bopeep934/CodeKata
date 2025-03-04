package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import static java.lang.reflect.Array.set;
import static java.util.Collections.list;
import static java.util.Collections.sort;

public class Solution49 {
    public int[] solution49(int[] numbers) {
        int[] answer = {};

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                a.add(numbers[i] + numbers[j]);
            }
        }

        a = a.stream().distinct().sorted().collect(Collectors.toCollection(ArrayList::new));

        answer = a.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}
