/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author theti
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductDAO productDAO = null;
        ColorDAO colorDAO = null;
        if (colorDAO == null) {
            colorDAO = new ColorDAO();
        }
        if (productDAO == null) {
            productDAO = new ProductDAO();
        }
        int choice;
        boolean checkChoice = true;
        Scanner scanner = new Scanner(System.in);
        List<Product> listPro = null;
        do {
            showMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    do {
                        Product product = productDAO.inputPro();
                        boolean result = productDAO.add(product);
                        if (result == true) {
                            System.out.println("Ban co muon nhap nua khong? (Yes/No) ");
                            String out = scanner.nextLine();
                            if (out.equalsIgnoreCase("No")) {
                                break;
                            }
                        } else {
                            System.out.println("Loi them san pham.");
                            break;
                        }
                    } while (true);
                    break;
                case 2:
                    listPro = productDAO.findAll();
                    for (Product p : listPro) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    
                    listPro = productDAO.sortByPrice(listPro);
                    for (Product product : listPro) {
                        System.out.println(product);  
                    }
                    

                    break;
                case 4:
                    System.out.println("Nhap ten san pham can tim: ");
                    String inputName = scanner.nextLine();
                     {
                        try {
                            List<Product> listProByName = productDAO.findByName(inputName);
//                        if (listProByName.size() == 0){
//                            System.out.println("Khong tim thay");
//                        }else{
                            for (Product p : listProByName) {
                                System.out.println(p);
                            }
//                        }
                        } catch (ProductException ex) {
                            System.err.print(ex);
                        }
                    }

                    break;

                case 5:
                    System.out.println("Nhap ten mau cua san pham: ");
                    String inputColorName = scanner.nextLine();
                    List<Product> listProduct = productDAO.findByColorId(inputColorName);
                    if (listProduct.size() == 0) {
                        System.out.println("Khong tim thay");
                    } else {
                        for (Product p : listProduct) {
                            System.out.println(p);
                        }
                    }

                    break;
                case 6:
                    checkChoice = false;
                    break;

            }

        } while (checkChoice);

    }

    public static void showMenu() {

        System.out.println("-----Menu----");
        System.out.println("1.Nhap Product");
        System.out.println("2.Hien thi danh sach");
        System.out.println("3.Sap xep theo gia");
        System.out.println("4.Tim theo ten");
        System.out.println("5.Tim kiem theo ColorId");
        System.out.println("6.Thoat.");
        System.out.println("Nhap lua chon cua ban: (1-6)");
    }

}
