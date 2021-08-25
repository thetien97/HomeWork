/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author theti
 */
public class ProductDAO {
    private List<Product> listPro = new ArrayList<>();
    private List<Color> listColor = new ArrayList<>();
    private ColorDAO colorDAO = null;

    public ProductDAO() {
        colorDAO = new ColorDAO();
    }
    
    
    
    public boolean add(Product product){
    
        if (product == null){
            return false;
        }else{
            listPro.add(product);
            return true;
        }
    }
    public Product inputPro(){
        
        Scanner scanner = new Scanner(System.in);
        Color colorTemp = null;
        System.out.println("Nhap id san pham");
        int id = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Nhap ten san pham");
        String name = scanner.nextLine();
        
        do {            
            System.out.println("Nhap ten mau");
            String colorName = scanner.nextLine();
            colorTemp = colorDAO.exist(colorName);
            if(colorTemp != null){
                break;
            }else{
                System.out.println("vui long nhap lai ten mau: ");
            }
            
        } while (true);
        
        System.out.println("Nhap gia tien: ");
        float price = Float.parseFloat(scanner.nextLine());
        
        Product product = new Product(id, name,colorTemp.getId() , price);
        return product;
    }
    
    public List<Product> findAll(){
        return listPro;
    }
    public List<Product> sortByPrice(List<Product> listPro){
    
        Collections.sort(listPro, new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2) {
                return (int)(o1.getPrice() - o2.getPrice());
            }
            
        });
        return listPro;
    }
    
    public List<Product> minMaxPrice(List<Product> listP){
    
        List<Product> listDraft = new ArrayList<>();
        List<Product> listTmp = new ArrayList<>();
        listTmp = sortByPrice(listP);

        listDraft.add(listTmp.get(0));
        listDraft.add(listTmp.get(listTmp.size()-1));
        return listDraft;
    }
    
    public List<Product> findByName(String name)throws ProductException{
        
        List<Product> listProduct = new ArrayList<>();
        for (Product p : listPro){
            if (p.getName().contains(name)){
                listProduct.add(p);
            }
        }
        return listProduct;
    }
    
    public List<Product> findByColorId(String inputColorName){
        List<Product> listProduct = new ArrayList<>();
        Color colorTmp = colorDAO.exist(inputColorName);
        for (Product p : listPro){
            if (colorTmp.getId() == p.getColorId()){
                listProduct.add(p);
            }
        }
        return listProduct;
    }
    
}
