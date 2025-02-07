package com.example;

public class Main {
    public static void main(String[] args) {

        Solution37 s = new Solution37();
        //System.out.println(s.solution34("Zbcdefg"));
        //System.out.println(s.solution35(3,20,4));
        //System.out.println(s.solution36("34333"));
        int[][] a= {{1,2},{3,4}};
        int[][] b={{3,4},{5,6}};
        int [][] c=s.solution37(a,b);
        for(int[] i: c)
            for(int j: i)
                System.out.println(j);
    }

}
