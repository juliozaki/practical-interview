package com.products.catalog.serviceImpl;

import java.util.List;
import com.products.catalog.model.Product;
import com.products.catalog.model.ProductDTO;
import com.products.catalog.repository.ProductRepository;
import com.products.catalog.service.ProductCondition;
import com.products.catalog.service.ProductsService;
import jakarta.persistence.EntityNotFoundException;

/**
 * Service to manage the product catalog.
 *
 */
public class ProductsServiceImpl implements ProductsService {

  private final ProductRepository productoRepository;

  @Override
  public List<Product> retrieveProducts() {
    // TODO Auto-generated method stub
  }

  @Override
  public Product retrieveProduct(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Product CreateProduct(ProductDTO request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void updateProduct(Long id, ProductDTO product) {
    // TODO Auto-generated method stub
  }

  @Override
  public Product FindProductByName(String name) {
    // TODO Auto-generated method stub
    return null;
  }

  private Product findProductByName() {
    // TODO Auto-generated method stub
  }

}
