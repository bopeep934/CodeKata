package com.example;

public class Solution57 {
    public int[] solution57(int[] answers) {
        int[] answer = {};

        int[] math1 = {1, 2, 3, 4, 5};
        int[] math2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] math3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int a = 0;
        int b = 0;
        int c = 0;

        for(int i=0;i<answers.length;i++){
            for(int j=0; j<math1.length;j++){
                if (math1[i] == answers[i])
                    a++;
            }
        }

        for (int i = 0; i < answers.length; i++) {
            if(math1.length<i)
                a++;
            if (math1[i] == answers[i])
                a++;
            if (math2[i] == answers[i])
                b++;
            if (math3[i] == answers[i])
                c++;
        }

        return answer;
    }
}
