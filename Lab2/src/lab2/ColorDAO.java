/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author theti
 */
public class ColorDAO {
    
    public List<Color> listColor = new ArrayList<>();
    
    public ColorDAO (){
        Color c1 = new Color(1,"black");
        Color c2 = new Color(2,"white");
        Color c3 = new Color(3,"red");
        
        listColor.add(c1);
        listColor.add(c2);
        listColor.add(c3);
        
        
    }
    public Color exist(String name){
        for (Color c : listColor){
            if (c.getName().equals(name) ){
                return c;
            }
        }
        return null;
    }
}
