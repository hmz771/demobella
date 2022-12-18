package com.bella.demobella.services.Implementations;

import com.bella.demobella.model.Product;
import com.bella.demobella.repositories.productRepo;
import com.bella.demobella.services.Interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Scope("prototype")
public class ProductServiceImpl implements IProductService {

    @Autowired
    private productRepo productRepository;
    @Override
    public Product add(Product product) {
        productRepository.save(product);
        return product;
    }

    @Override
    public void update(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(long id) {


        productRepository.deleteById(id);
    }

    @Override
    public List<Product> listProducts() {
        return  productRepository.findAll();
    }

    @Override
    public Product findProductById(long id) {
        if(productRepository.findById(id).isPresent())
        return  productRepository.findById(id).get();
        else return null;
    }
}
