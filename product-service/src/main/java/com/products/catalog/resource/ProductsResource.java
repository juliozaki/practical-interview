package com.products.catalog.resource;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.products.catalog.constants.ResourceConstants;
import com.products.catalog.model.Product;
import com.products.catalog.model.ProductDTO;
import com.products.catalog.service.ProductsService;
import com.products.catalog.serviceImpl.ProductsServiceImpl;

/**
 * Products API to manage the catalog.
 *
 */
@RequestMapping(path = ResourceConstants.PRODUCT_PATH_CONSTANT)
public class ProductsResource {

  private ProductsService service = new ProductsServiceImpl();
  
  /**
   * Retrieve the product given the product id.
   * @param id.
   * @return product.
   */
  public ResponseEntity<ProductDTO> retrieveProduct(@PathVariable("id") Long id) {
    return new ResponseEntity<>(new ProductDTO(), HttpStatus.CREATED);
  }
  
  /**
   * Retrieve all the products.
   * @return a list of products.
   */
  public ResponseEntity<List<Product>> retrieveAllProducts() {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  /**
   * Retrieve a list of products based on product name.
   * @param name
   * @return a list of products.
   */
  public ResponseEntity<List<ProductDTO>> retrieveProductByName(@PathVariable("name") String name) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  /**
   * Create a new product.
   * @param request
   * @return the product.
   */
  public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO request) {
    return new ResponseEntity<>(request, HttpStatus.CREATED);
  }

  /**
   * Update an existing product.
   * @param id
   * @param product
   * @return the product.
   */
  public ResponseEntity<ProductDTO> updateProduct(@PathVariable("id") Long id,
      @RequestBody ProductDTO product) {
    return null;
  }

}
