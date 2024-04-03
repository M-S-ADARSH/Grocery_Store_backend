

package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.*;

public interface ProductRepo extends JpaRepository<Product,Integer>{
    
}




