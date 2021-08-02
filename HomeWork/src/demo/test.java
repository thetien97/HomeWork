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
public class test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str;

        System.out.println("Nhap ma sinh vien: ");
        str = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[A-Z&&[B]]\\d{9,}$");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            System.out.println("ok");
        } else {
            System.out.println("wrog");
        }

    }
}
