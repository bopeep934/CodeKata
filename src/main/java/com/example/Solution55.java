package com.example;

import java.util.LinkedList;
import java.util.Queue;

public class Solution55 {
    public String solution55(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> card1 = new LinkedList<>();
        Queue<String> card2 = new LinkedList<>();

        for (String s : cards1)
            card1.add(s);

        for (String s : cards2)
            card2.add(s);

        int length = cards1.length + cards2.length;
        String com = "";
        for (int i = 0; i < goal.length; i++) {
            com = goal[i];

            if (com.equals(card1.peek())) {
                card1.remove();
            }
            else if (com.equals(card2.peek())) {
                card2.remove();
            } else {
                answer = "No";
                break;
            }
        }

        return answer;
    }
}
