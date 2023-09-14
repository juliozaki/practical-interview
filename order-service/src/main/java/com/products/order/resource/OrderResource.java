package com.products.order.resource;

import com.products.order.serviceImpl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.products.order.product.model.CreateOrderRequest;
import com.products.order.service.OrderService;

/**
 * Order API to create the order.
 * 
 */
@RestController
public class OrderResource {

  @Autowired
  private OrderServiceImpl orderService;

  /*public OrderResource(OrderService orderService) {
    this.orderService = orderService;
  }*/

  /**
   * Create a new resource.
   * @param orderRequest.
   * @return CreateOrderRequest.
   */
  @PostMapping
  public ResponseEntity<CreateOrderRequest> createOrder(
      @RequestBody CreateOrderRequest orderRequest) {
    return new ResponseEntity<CreateOrderRequest>(orderService.createOrder(orderRequest),
        HttpStatus.BAD_REQUEST);
  }

}
