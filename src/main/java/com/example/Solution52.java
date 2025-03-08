package com.example;

public class Solution52 {
    public int solution52(int a, int b, int n) {
        int answer = 0;
        int l=0;
        int c=0;
        c=a/b;

        while(true){
            answer+=n/c;
            l=n%c;

            n=n/c;
            n+=l;

            if(n<a){
                break;
            }
        }

        return answer;
    }
}
