package com.products.order.service;

import com.products.order.product.model.CreateOrderRequest;

/**
 * Define the method to capture the purchase order.
 *
 */
public interface OrderService {
  
  CreateOrderRequest createOrder(CreateOrderRequest orderRequest);
}
