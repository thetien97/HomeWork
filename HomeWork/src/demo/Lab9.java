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
public class Lab9 {
    
    public static void main(String[] args) {
        
        String str;
        char c;
        Boolean kiemTra = false;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        str = scanner.nextLine();
        System.out.println("Nhap ki tu kiem tra: ");
        c = scanner.next().charAt(0);
        
        char [] arrChar = str.toCharArray();
        
        for(int i = 0; i < arrChar.length; i++){
            if(c == arrChar[i]){
                System.out.println(i);
                kiemTra = true;
            }
        }
        
        if(kiemTra == false){
            System.out.println("Khong ton tai chuoi");
        }
        
    }
}
