package com.products.order.serviceImpl;

import org.springframework.stereotype.Service;
import com.products.order.entity.Order;
import com.products.order.entity.OrderItem;
import com.products.order.payment.service.PaymentProcessor;
import com.products.order.product.model.CreateOrderRequest;
import com.products.order.product.model.CreateOrderItemRequest;
import com.products.order.product.service.ProductServiceClient;
import com.products.order.repository.OrderRepository;
import com.products.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

  private ProductServiceClient productClient;

  private OrderRepository orderRepository;

  private PaymentProcessor paymentProcessor;

  public OrderServiceImpl() {
  }
  
  /**
   * Method to create the order.
   * 1. Calculate the total.
   * 2. Save the order and the product items.
   */
  @Override
  public CreateOrderRequest createOrder(CreateOrderRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * Method to convert OrderItemRequest to OrderItem entity.
   * @param order
   * @param itemRequest
   * @return OrderItem
   */
  public static OrderItem buildOrderItem(Order order, CreateOrderItemRequest itemRequest) {
    OrderItem item = new OrderItem();
    item.setProductId(itemRequest.getProductId());
    item.setOrder(order);
    return item;
  }
}
