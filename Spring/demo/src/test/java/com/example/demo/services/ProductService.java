package com.example.demo.services;

import com.example.demo.models.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// Missing Annotations - fill out the missing annotations
public class ProductService {
    private final MyBean myBean;

    // Missing Annotation - fill out the missing Annotation
    public ProductService(MyBean myBean) {
        this.myBean = myBean;
    }
}
