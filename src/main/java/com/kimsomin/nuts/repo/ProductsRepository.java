package com.kimsomin.nuts.repo;

import com.kimsomin.nuts.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products, Long> {

}
