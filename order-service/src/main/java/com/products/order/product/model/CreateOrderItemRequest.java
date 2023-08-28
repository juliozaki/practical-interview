package com.products.order.product.model;

public class CreateOrderItemRequest {
  
  private Long id;
  
  private String productId;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  @Override
  public String toString() {
    return "OrderItem [id=" + id + ", productId=" + productId + "]";
  }

}
