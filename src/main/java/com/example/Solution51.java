package com.example;

public class Solution51 {
    public String solution51(int[] food) {
        String answer = "";
        int[] a = new int[food.length];
        a[0] = 1;
        for (int i = 1; i < food.length; i++) {
            a[i] = food[i] / 2;
        }

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a[i]; j++) {
                answer += String.valueOf(i) + " ";
            }
        }

        String answer2= new StringBuilder(answer).reverse().toString();

        answer+="0"+answer2;

        System.out.println(answer2);
        return answer;
    }
}
