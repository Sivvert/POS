/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;


import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ahmet.kazan
 */
 public class User{

    public static boolean findCredentials(DbManager dbManager, String username, String password) {

       

        ResultSet results = dbManager.doQuery("SELECT 1 from user where `name` = '" + username + "' and `password` = '" + password + "';");

        try {

            return results.next();

        } catch (SQLException e) {

            return false;

        }

    }

   

}