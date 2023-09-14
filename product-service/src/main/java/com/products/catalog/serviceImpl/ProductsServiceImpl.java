package com.products.catalog.serviceImpl;

import java.util.List;
import com.products.catalog.model.Product;
import com.products.catalog.model.ProductDTO;
import com.products.catalog.repository.ProductRepository;
import com.products.catalog.service.ProductCondition;
import com.products.catalog.service.ProductsService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service to manage the product catalog.
 *
 */
@Service
public class ProductsServiceImpl implements ProductsService{

  @Autowired
  private ProductRepository productoRepository;

  @Override
  public List<Product> retrieveProducts() {
    // TODO Auto-generated method stub
    return productoRepository.findAll();
  }

  @Override
  public Product retrieveProduct(Long id) {
    return productoRepository.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public Product CreateProduct(ProductDTO request) {
    Product product=new Product();
    product.setDescription(request.getDescription());
    product.setId(request.getId());
    product.setName(request.getName());
    product.setPrice(request.getPrice());
    productoRepository.save(product);
    return product;
  }


  @Transactional
  public void updateProduct(ProductDTO productDto) {
    Product product=new Product();
    product.setDescription(productDto.getDescription());
    product.setId(productDto.getId());
    product.setName(productDto.getName());
    product.setPrice(productDto.getPrice());
    productoRepository.save(product);
  }

  @Override
  public Product FindProductByName(String name) {
    // TODO Auto-generated method stub
    return null;
  }

  private Product findProductByName() {
    // TODO Auto-generated method stub
    return new Product();
  }

  @Override
  public void updateProduct(Long id, ProductDTO product){

  }

}
