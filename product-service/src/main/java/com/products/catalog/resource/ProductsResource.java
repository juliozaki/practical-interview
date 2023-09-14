package com.products.catalog.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.products.catalog.constants.ResourceConstants;
import com.products.catalog.model.Product;
import com.products.catalog.model.ProductDTO;
import com.products.catalog.service.ProductsService;
import com.products.catalog.serviceImpl.ProductsServiceImpl;

/**
 * Products API to manage the catalog.
 *
 */
@RestController
@RequestMapping(value = "product")
public class ProductsResource {

  @Autowired
  ProductsServiceImpl productsService;
  private ProductsService service = new ProductsServiceImpl();
  
  /**
   * Retrieve the product given the product id.
   * @param id.
   * @return product.
   */

  @GetMapping("retrieveProductById/{id}")
  public ResponseEntity<ProductDTO> retrieveProduct(@PathVariable("id") Long id) {
    ProductDTO productDTO= new ProductDTO();
    Product product= productsService.retrieveProduct(id);
    if (product != null) {
      productDTO.setId(product.getId());
      productDTO.setName(product.getName());
      productDTO.setDescription(product.getDescription());
      productDTO.setPrice(product.getPrice());
      return new ResponseEntity<>(productDTO, HttpStatus.OK);
    }else{
      return new ResponseEntity<>(null, HttpStatus.OK);
    }
  }
  
  /**
   * Retrieve all the products.
   * @return a list of products.
   */
  @GetMapping("retrieveProduct")
  public ResponseEntity<List<Product>> retrieveAllProducts() {
    return new ResponseEntity<>(productsService.retrieveProducts(), HttpStatus.OK);
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
  @PostMapping("createProduct")
  public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO request) {
    productsService.CreateProduct(request);
    return new ResponseEntity<>(request, HttpStatus.CREATED);
  }

  /**
   * Update an existing product.
   * @param id
   * @param product
   * @return the product.
   */
  @PostMapping("updateProduct")
  public ResponseEntity<ProductDTO> updateProduct(@RequestBody ProductDTO product) {
    productsService.updateProduct(product);
    return new ResponseEntity<>(product, HttpStatus.OK);
  }

}
