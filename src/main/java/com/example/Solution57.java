package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution57 {
    public ArrayList<Integer> solution57(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();

        ArrayList<Integer> math1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> math2 = new ArrayList<>(Arrays.asList(2,1,2,3,2,4,2,5));
        ArrayList<Integer> math3 = new ArrayList<>(Arrays.asList(3,3,1,1,2,2,4,4,5,5));
        int[] math5 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] math6 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int a = 0;
        int b = 0;
        int c = 0;

        for(int i=0;i<answers.length;i++){
            if(answers[i]==math1.get(i))
                a++;
            if(math1.get(i)==null)
                math1.set(i,math1.get(i-(i-1)));
        }
        for(int i=0;i<answers.length;i++){
            if(answers[i]==math2.get(i))
                b++;
            if(math2.get(i)==null)
                math2.set(i,math2.get(i-(i-1)));
        }
        for(int i=0;i<answers.length;i++){
            if(answers[i]==math2.get(i))
                c++;
            if(math3.get(i)==null)
                math3.set(i,math3.get(i-(i-1)));
        }

        if(a==b){
            if(b==c){
                answer.add(1);
                answer.add(2);
                answer.add(3);
            }
            if(b>c){
                answer.add(1);
                answer.add(2);
            }
            if(b<c){
                answer.add(1);
                answer.add(3);
            }
        }else if(b==c){
            if(a>b){
                answer.add(1);
            }if(a<b){
                answer.add(2);
                answer.add(3);
            }
        }else if(a==c){
            if(a<b){
                answer.add(2);
            }if(a>b){
                answer.add(1);
                answer.add(3);
            }
        }else if(a>b)



    }
}
