package com.example;

public class Solution39 {
    public int[] solution39(int n, int m) {
        int[] answer = new int [2];
        int[] a= new int [n];
        int[] b= new int [m];
        int c=0;

        for (int i =1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                c = i;
            }
        }
//
//        for(int i=1;i<=n;i++) {
//            if (n % i == 0) {
//                a[i-1] = i;
//                System.out.println(a[i-1]);
//            }
//            else a[i]=0;
//        }
//
//
//        for(int i=1;i<=m;i++) {
//            if (m % i == 0) {
//                b[i - 1] = i;
//                System.out.println(b[i-1]);
//
//            }
//            else b[i-1]=0;
//        }
//
//        for(int i=0;i<n;i++) {
//            if (a[i] == 0)
//                continue;
//            else if(a[i]==b[i])
//                    c=a[i];
//        }

        answer[0]=c;

        answer[1]=(n*m)/c;

        System.out.println(answer[0]+"," + answer[1]);

        return answer;
    }
}
