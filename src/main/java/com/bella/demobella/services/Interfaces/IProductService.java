package com.bella.demobella.services.Interfaces;

import com.bella.demobella.model.Product;

import java.util.List;

public interface IProductService {

    Product add (Product product);
    void update (Product product);
    void delete(long id);



    List<Product> listProducts();
    Product findProductById(long id);

}
