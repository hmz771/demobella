package com.bella.demobella.web;

import com.bella.demobella.model.Product;
import com.bella.demobella.services.Interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

//@Scope("prototype")
@RestController

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProductController {
    @Autowired
   private IProductService productService;

    @PostMapping("/Product/")
    public void update(Product prod)
    {

    }

    @PutMapping("/Product/")
    public void add(Product prod)
    {
        productService.add(prod);

    }
    @DeleteMapping ("/Product/id/")
    public void delete(Long id)
    {
        productService.delete(id);
    }

    @GetMapping("/Products/")
    public List<Product> listProducts()
    {
        try {
            System.out.println(String.valueOf(this));
            System.out.println("serv "+String.valueOf(productService));
            return productService.listProducts();

        }
        catch (Exception x)
        {

            System.out.println("****");
        }
        return null;
    }
    @GetMapping("/Product/id/")
    public Product productById(long id)
    {
        return productService.findProductById(id);
    }


}
