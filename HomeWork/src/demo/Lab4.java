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
public class Lab4 {

    public static void main(String[] args) {

        int n;
        int[] daySo;
        int sum = 0;
        float tbc = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập số nguyên dương n: ");
            n = scanner.nextInt();
        } while (n < 0);

        daySo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao cac phan tu mang thu " + i);
            daySo[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum = sum + daySo[i];
            tbc = (float) sum / n;
        }
        System.out.println(tbc);
    }
}
