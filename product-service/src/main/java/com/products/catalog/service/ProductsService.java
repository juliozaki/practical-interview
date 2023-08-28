package com.products.catalog.service;

import java.util.List;
import com.products.catalog.model.Product;
import com.products.catalog.model.ProductDTO;

/**
 * Use this interface to implement the product catalog.
 *
 */
public interface ProductsService {
  
  List<Product> retrieveProducts();
  
  Product retrieveProduct(Long id);
  
  Product CreateProduct(ProductDTO product);
  
  void updateProduct(Long id, ProductDTO product);
  
  Product FindProductByName(String name);
}
