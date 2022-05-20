package com.task;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int[] a = new int[7];
        int k = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int n = 0; n < k; n++) {
            int j, last;
            last = a[a.length - 1];

            for (j = a.length-1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = last;
        }
        System.out.println();
        for (int n = 0; n < a.length; n++) {
            System.out.print(a[n] + " ");
        }
    }

}

