package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution48 {
    public int[] solution48(int[] array, int[][] commands) {

        int[] answer = {};

        int[] a= new int[3];

        ArrayList<Integer> last = new ArrayList<>();

        for(int i=0;i<commands.length;i++) {
            for (int j = 0; j < commands[i].length; j++) {
                a[j] = (commands[i][j])-1;
            }
            answer = Arrays.copyOfRange(array, a[0], a[1]+1);
            Arrays.sort(answer);
            last.add(answer[a[2]]);
        }

        int[] arr = last.stream().mapToInt(Integer::intValue).toArray();

        return arr;
    }
}
