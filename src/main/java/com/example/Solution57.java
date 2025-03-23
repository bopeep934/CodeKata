package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution57 {
    public int[] solution57(int[] answers) {
        int[] answer;
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        List<Integer> score = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        score.add(0);
        score.add(0);
        score.add(0);

        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == person1[i%5])
                score.set(0, score.get(0)+1);
            if(answers[i] == person2[i%8])
                score.set(1, score.get(1)+1);
            if(answers[i] == person3[i%10])
                score.set(2, score.get(2)+1);
        }
        int max = Collections.max(score);//최대값 구하기
        for(int i = 0; i < 3; i++) {
            if(max == score.get(i)) {//최대값이랑 각 원소값이랑 비교해서 같으면
                ans.add(i+1);//그 위치를 ans에 표시
            }
        }

        answer = new int[ans.size()];

        for(int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);//표시한 위치를 답 배열에 옮김
        }

        return answer;
//못 품
    }
}
