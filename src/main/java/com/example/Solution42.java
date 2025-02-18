package com.example;

public class Solution42 {
    public int solution42(int[] number) {
        int answer = 0;
        int a,b,c=0;
        for(int i=0;i<number.length-2;i++){
            a=number[i];
            for(int j=i+1;j<number.length-1;j++){
                b=number[j];
                for(int k=j+1;k<number.length;k++){
                    c=number[k];
                    if(a+b+c==0){
                        answer++;
                    }
                }
            }
        }
        return answer;

    }
}
