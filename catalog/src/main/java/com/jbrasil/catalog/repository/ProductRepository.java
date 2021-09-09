package com.jbrasil.catalog.repository;

import org.springframework.data.repository.CrudRepository;

import com.jbrasil.catalog.Model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>  {

		

}
