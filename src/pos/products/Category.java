/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pos.products;

import java.awt.Image;
import java.io.IOException;


import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Lionel
 */
public class Category {
private int id;
private String category;
private java.awt.Image image; 

public static List<Category> findAll(){
    
    List<Category> categories = new ArrayList<>();
    Category cat = new Category();
    cat.setId(1);
    cat.setCategory("Category 1");
    try {
        cat.setImage(ImageIO.read(new URL("http://www.oracle.com/ocom/groups/public/@otn/documents/digitalasset/1917282.jpg")));
    } catch (IOException ex) {
        Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
    }
    categories.add(cat);
    return categories;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

}
