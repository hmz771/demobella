package com.bella.demobella.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data // getter et setter
@NoArgsConstructor // constructeur vide
@AllArgsConstructor // creation de constructeur
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name;
    private String Description;
    private int Quantity;




//    public Product()
//    {}

//    public void  nameGetter(String name)
//    {
//        this.name = name;
//
//    }
//
//    public String  nameSetter()
//    {
//       return this.name;
//
//    }


}


