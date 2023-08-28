package com.products.order.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;

/**
 * Table that represents a purchase order.
 * 
 */
@Entity
public class Order {
  
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private Double total;
  
  private String paymentMethod;
  
  private String address;
  
  private Long userId;
  
  private LocalDateTime oderDate;
  
  @PrePersist
  protected void onCreate() {
    this.oderDate = LocalDateTime.now();
  }
  
  @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
  private List<OrderItem> items = new ArrayList<>();

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

  public List<OrderItem> getItems() {
    return items;
  }

  public void setItems(List<OrderItem> items) {
    this.items = items;
  }

  @Override
  public String toString() {
    return "Order [id=" + id + ", total=" + total + ", paymentMethod=" + paymentMethod
        + ", address=" + address + ", userId=" + userId + ", items="
        + items + "]";
  }

}
