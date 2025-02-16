package com.example;

public class Solution41 {
        public String solution41(String s) {
            String answer = "";
            char[] a= s.toCharArray();
            int c=0;

            for(int i=0;i<a.length;i++){
                if (a[i] == ' ') {
                    c=0;
                    continue;
                }
                if(c%2==0){
                    a[i]=Character.toUpperCase(a[i]);
                }
                if(c%2!=0){
                    a[i]=Character.toLowerCase(a[i]);
                }
                c++;
            }

            answer=String.valueOf(a);

            return answer;
        }
    }

