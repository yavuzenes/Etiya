package org.example.dataaccess;

import org.example.entities.Product;

public class JdbcProductDao implements ProductDao {

    public void add(Product product) {

        //Sadece ve sadece db erişişm kodları buraya yazılır ... SQL

        System.out.println("JDBC ile veritabanına eklendi");


    }
}