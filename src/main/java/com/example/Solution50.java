package com.example;

public class Solution50 {
    public int[] solution50(String s) {
        int[] answer = new int[s.length()];
        int alphabet = 0;
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (charArray[j] == charArray[i]) {
                    answer[i] = i - j;
                }
            }
            if (answer[i] == 0) {
                answer[i] = -1;
            }
        }

        return answer;
    }
}
