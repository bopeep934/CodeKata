package com.example;

import java.util.ArrayList;

public class Solution58 {
    public int solution58(int[] nums) {
        ArrayList<Integer> primeNumbList = new ArrayList<Integer>();
        ArrayList<Integer> sumList = new ArrayList<Integer>();
        boolean primeYn = false;
        int answer = 0;

        for (int a=2; a<=50000; a++) {
            primeYn = true;
            for(int i = 2; i <= Math.sqrt(a); i++) {
                if(a % i == 0) {
                    primeYn = false;
                    break;
                }
            }
            if (primeYn) {
                primeNumbList.add(a);
            }
        }

        for (int i=0; i<nums.length; i++) {
            for (int k=i+1; k<nums.length; k++) {
                for (int l=k+1; l<nums.length; l++) {
                    sumList.add(nums[i] + nums[k] + nums[l]);
                }
            }
        }

        for (int i : sumList) {
            if (primeNumbList.contains(i)) {
                answer++;
            }
        }
//        System.out.println(primeNumbList);
//        System.out.println(sumList);
        return answer;
    }
}
