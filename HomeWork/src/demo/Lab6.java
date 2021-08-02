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
public class Lab6 {
    
    static void min(int arr[], int n){
    
        int min = arr[0];
        
        for(int i = 0; i < n; i++){
            
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        
        int n;
        int [] arr;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập số phần tử của mảng n = ");
        n = scanner.nextInt();
        arr = new int[n];
        
        for(int i = 0; i < n; i++){
        
            System.out.println("Nhập các phần từ thứ " + (i + 1) +" của mảng: ");
            arr[i] = scanner.nextInt();
        }
        
        min(arr, n);
        
    }
}
