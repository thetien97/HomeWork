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
public class Lab7 {

    static void reverse(int arr[], int n ){
    
        int temp;
        
        for (int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }   
    
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] arr;
        
        System.out.println("Nhập vào số phần tử của mảng: n =");
        n = scanner.nextInt();
        arr = new int[n];
        
        for (int i = 0; i < n; i++){
            
            System.out.println("Nhập phần tử thứ " + (i + 1) + "của mảng :");
            arr[i] = scanner.nextInt();
        }
        
        reverse(arr,n);
        
        for(int i = 0; i < n; i++){
            
            System.out.print(arr[i]);
        }
    }
}
