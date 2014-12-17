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
 * @author Jordy, Ahmet, Duraid, Tako en Eric
 */
public class Product {
  private int id;
  private String name;
  private String description;
  private int price;
  private Image image;
  private int stock;
  private Category category; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
  
    public static List<Product> findByCategory(Category cat) {
    List<Product> products = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
        Product prod = new Product();
        prod.setId(i);
        prod.setName("Product " + i);
        prod.setDescription("Product description");
        prod.setStock(i);
        prod.setPrice(i*100);
        prod.setCategory(cat);
        try {
            prod.setImage(ImageIO.read(new URL("http://www.oracle.com/ocom/groups/public/@otn/documents/digitalasset/1917282.jpg")));
        } catch (IOException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
        products.add(prod);
    }
    return products;
}
    
}
