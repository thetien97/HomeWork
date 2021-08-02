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
public class Lab3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so n: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i += 2) {
            sum = sum + i;
        }

        System.out.println(sum);

    }
}
