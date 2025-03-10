package com.example;

import java.util.ArrayList;
import java.util.Collections;

public class Solution53 {
    public int[] solution53(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> a = new ArrayList<>();

        for ( int i = 0; i < score.length; i++ ) {
            for ( int j = 0; j <= i; j++ ) {
                a.add(score[j]);
            }
            Collections.sort(a, Collections.reverseOrder());

            if (a.size() <= k) {
                answer[i] = a.get(i);
            }
            if (a.size() > k) {
                answer[i] = a.get(k-1);
            }
            a.clear();
        }
        return answer;
    }
}

