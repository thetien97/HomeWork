/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author theti
 */
public class Lab5 {

    static void max(int arr[], int n) {

        int max = arr[0];

        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {

        int n;
        int[] arr;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập số nguyên dương n: ");
            n = scanner.nextInt();
        } while (n < 0);

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập các phần tử của mảng: ");
            arr[i] = scanner.nextInt();
        }

        max(arr, n);
    }
}
