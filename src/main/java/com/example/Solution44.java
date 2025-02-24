package com.example;

public class Solution44 {
    public int solution44(int[][] sizes) {
        int answer = 0;
        int a = 0;
        int b = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > a)
                a = sizes[i][0];
            if (sizes[i][1] > b)
                b = sizes[i][1];
        }

        int max = 0;

        if (a > b)
            max = a;
        else max = b;

        int minArray[] = new int[sizes.length];

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1])
                minArray[i] = sizes[i][0];
            else minArray[i] = sizes[i][1];
        }

        int minMax = 0;

        for (int i : minArray) {
            if (minMax < i)
                minMax = i;
        }

        System.out.println("최대값:" + max + " 최소값:" + minMax);

        answer = max * minMax;

        return answer;
    }
}
