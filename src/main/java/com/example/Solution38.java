package com.example;

import java.util.Scanner;

public class Solution38 {
    public void solution38() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        char[][] star = new char[b][a];

        for (char[] i : star) {
            for (char j : i) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

