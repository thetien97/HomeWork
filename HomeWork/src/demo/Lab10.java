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
public class Lab10 {

    public static void main(String[] args) {

        String str;
        int count = 0;
        boolean exist = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        str = scanner.nextLine();

        char[] arrChar = str.toCharArray();

        for (int i = 0; i < arrChar.length; i++) {
            if ('a' == arrChar[i]) {
                exist = true;
                count++;

            }
        }
        System.out.println(count);
        if (exist == false) {
            System.out.println("khong ton tai");
        }

    }
}
