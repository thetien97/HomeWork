/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author theti
 */
public class ProductException extends Exception {
    public ProductException(String message){
        super(message);
    }
    
    public ProductException(String message, Throwable cause){
        super(message, cause);
    }
}
