package com.edu.ex;

public class ex3 {
    public static void main(String[] args) {
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100 + 100);
            System.out.println(a[i] + " ");
        }

        int max = a[0];
        int min = a[0];

        for (int j = 1; j < a.length; j++) {
            if (a[j] > max) {
                max = a[j];
            } else if (a[j] < min) {
                min = a[j];
            }
        }

        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
    }
}
