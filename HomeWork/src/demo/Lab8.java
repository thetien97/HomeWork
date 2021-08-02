/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author theti
 */
public class Lab8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str;
        char c;
        boolean kiemTra = false;

        System.out.println("Nhap chuoi: ");
        str = scanner.nextLine();
        System.out.println("Nhap ki tu can kiem tra: ");
        c = scanner.next().charAt(0);

        char arrChar[] = str.toCharArray();

        for (int i = 0; i < arrChar.length; i++) {
            if (c == arrChar[i]) {
                System.out.println("Co'");
                kiemTra = true;
            }

        }
        if (kiemTra == false) {
            System.out.println("Khong");
        }
    }
}
