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
public class SoNguyen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        int soNguyen = scanner.nextInt();

        if (soNguyen >= 0) {
            System.out.println("Đây là số nguyên dương.");
        } else {
            System.out.println("Đây là số nguyên âm.");
        }

    }

}
