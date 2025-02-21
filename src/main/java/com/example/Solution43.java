package com.example;

import java.util.ArrayList;

public class Solution43 {
    public int solution43(String t, String p) {
        int answer = 0;

        int m = p.length();
        int n = t.length();
        long pLong =Long.parseLong(p);

//        while ((n / 10) >= 1) {
//            n = n / 10;
//            m++;
//        }

//        char[] charArr = t.toCharArray();

//        ArrayList<String> stringArr = new ArrayList<>();
//        String stringArr2 = "";

//        for ( int i = 0; i < n - m ; i++ ) {
//            for ( int j = i; j < i + m+1 ; j++ ) {
//                stringArr2 += Character.toString(charArr[j]);
//            }
//            stringArr.add(stringArr2);

 //           stringArr2 = "";
//        }

        for ( int i = 0; i <= n-m ; i++ ) {
            if (Long.parseLong(t.substring(i, i+m)) <= pLong)
                answer++;
        }

        return answer;
    }
}
