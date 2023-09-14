package com.products.order.product.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "create_order_item_request")
@Entity
public class CreateOrderItemRequest {

  @Id
  @Column(name = "id")
  private Long id;
  @Column(name = "product_id")
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
