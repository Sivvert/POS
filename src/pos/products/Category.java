/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.products;

import java.awt.Image;
import java.io.IOException;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    private String name;
    private String category;
    private java.awt.Image image;
    public static List<Category> findByCategory(pos.DbManager dbManager){
    //oud public static List<Category> findAll(pos.DbManager dbManager) {
        List<Category> categories = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Category ORDER BY Name ASC";
            ResultSet result = dbManager.doQuery(sql);
            while (result.next()) {
                Category category = new Category();
                category.setId(result.getInt("Id"));
                category.setName(result.getString("Name"));
                category.setImage(ImageIO.read(result.getBinaryStream("Image")));
                categories.add(category);
            }
        } catch (SQLException | IOException e) {
            System.out.println(e.getMessage());
        }
        return categories;
    }

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
