package com.example;

import java.util.ArrayList;
import java.util.Stack;

public class Solution40 {
    public int solution40(int n) {
        int answer = 0;
        Stack<Integer> a = new Stack<>();
        int size = 0;
        while (true) {
            a.push(n % 3);
            n = n / 3;
            if (n == 0) {
                size++;
                break;
            }
        }
        for (int i = 0; i < size + 1; i++) {
            answer += Math.pow(3, i) * (a.pop());
        }


        return answer;
    }
}