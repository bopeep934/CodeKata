package com.example;

public class Main {
    public static void main(String[] args) {

        Solution55 s = new Solution55();

        //System.out.println(s.solution34("Zbcdefg"));
        //System.out.println(s.solution35(3,20,4));
        //System.out.println(s.solution36("34333"));

//        int[][] a= {{1,2},{3,4}};
//        int[][] b={{3,4},{5,6}};
//        int [][] c=s.solution37(a,b);
//        s.solution38();

//      s.solution39(5,15);

//        int[] a = {-3, -2, -1, 0, 1, 2, 3};
//        System.out.println(s.solution42(a));

//        int[][] a = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
//        System.out.println(s.solution44(a));

//        System.out.println(s.solution45("BC",4	));

//        String[] strings={"abcd","abce","cdx"};
//        String[] strings2=s.solution47(strings, 2);

        //       int[] arrays = {2, 1, 3, 4, 1};
//        int[][] commands={{2,5,3},{4,4,1},{1,7,3}};
//
        //        int[] arrays2= s.solution49( arrays ) ;
//
//        for(int i: arrays2)
//            System.out.print(i+ ", ");
//    }
//        int[] food= {1, 7, 1, 2};
//        int[] score = {10, 100, 20, 150, 1, 100, 200};
//        int[] answer = s.solution53(3, score);
//        for (int i : answer) {
//            System.out.println(i + ",");
//        }

        String[] cards1={"a", "b", "c"};
        String[] cards2={"d", "e", "f"};
        String[] goal={"a", "d", "f"};
        System.out.println(s.solution55(cards1,cards2,goal));
    }
}
