package com.products.order.product.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Table(name = "create_order_request")
@Entity
public class CreateOrderRequest {

  @Id
  @Column(name = "id")
  private Long id;
  
  private Double total;
  
  private String paymentMethod;
  
  private String address;
  
  private Long userId;

  private List<CreateOrderItemRequest> items = new ArrayList<>();

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public List<CreateOrderItemRequest> getItems() {
    return items;
  }

  public void setItems(List<CreateOrderItemRequest> items) {
    this.items = items;
  }

  @Override
  public String toString() {
    return "Order [id=" + id + ", total=" + total + ", paymentMethod=" + paymentMethod
        + ", address=" + address + ", userId=" + userId + ", items="
        + items + "]";
  }

}
