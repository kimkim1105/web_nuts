package com.kimsomin.nuts.service;

import com.kimsomin.nuts.model.ProductCategories;
import com.kimsomin.nuts.model.Products;

import java.util.List;
import java.util.Optional;

public interface ProductsService {
    List<Products> findAllProducts();
    Products createProduct(Products product);
    Products updateProducts(Products product);
    Products findById (Long id);
}
