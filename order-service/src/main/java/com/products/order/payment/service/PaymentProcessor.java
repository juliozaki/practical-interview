package com.products.order.payment.service;

/**
 * This interface is used to process the payment method.
 *
 */
public interface PaymentProcessor {
  
  void processPayment(Long userId, Double total);
}
