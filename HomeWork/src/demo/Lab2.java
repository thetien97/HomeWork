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
public class Lab2 {

    public static void main(String[] args) {

        String[] motDenMuoiChin = {"không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín",
            "Mười một", "Mười hai", "Mười ba", "Mười bốn", "Mười năm", "Mười sáu", "Mười bảy", "Mười tám", "Mười chín"};
        String[] soChan = {"Mười", "Hai mươi", "Ba mươi", "Bốn mươi", "Năm mươi",
            "Sáu mươi", "Bảy mươi", "Tám mươi", "Chín mươi"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số: ");

        int n = scanner.nextInt();
        String str = "";

        if (n > 999 && n < 10000) {
            int i = n / 1000;
            str = str + motDenMuoiChin[i] + " " + "nghìn ";
            n = n % 1000;

            if (n > 9 && n < 100) {
                str = str + " " + "không trăm ";
            }
        }

        if (n > 99 && n < 1000) {
            int i = n / 100;
            str = str + motDenMuoiChin[i] + " " + "trăm ";
            n = n % 100;
        }

        if (n > 19 && n < 100) {
            int i = n / 10;
            str = str + soChan[i - 1];
            n = n % 10;

        }

        if (n >= 0 && n < 20) {
            str = str + motDenMuoiChin[n];
        }

        System.out.println(str);

    }
}
