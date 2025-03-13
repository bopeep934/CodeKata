package com.example;

import java.util.Arrays;
import java.util.Collections;

public class Solution56 {
    public int solution56(int k, int m, int[] score) {
        int answer = 0;
        int a = 0;
        Integer[] score2 = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(score2, Collections.reverseOrder());

        Integer[][] arr2 = new Integer[score.length / m][m];
        while (a < score.length) {
            int b = 0;
            arr2[b] = Arrays.copyOfRange(score2, a, a + m);
            a = a + m + 1;
            b++;
        }

        for (int i = 0; i < arr2.length; i++) {
            answer += (Arrays.stream(arr2[i])   // Integer[] 스트림으로 변환
                    .mapToInt(Integer::intValue)  // Integer -> int로 변환
                    .min()  // 최솟값 찾기
                    .orElse(0) )* k;
            System.out.println(arr2[i].length);
        }

        return answer;
    }
}
