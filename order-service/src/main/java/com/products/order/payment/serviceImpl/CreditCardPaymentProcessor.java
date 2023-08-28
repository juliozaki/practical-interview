package com.products.order.payment.serviceImpl;

import com.products.order.payment.service.PaymentProcessor;

/**
 * Implement the credit card payment. 
 *
 */
public class CreditCardPaymentProcessor implements PaymentProcessor {
  
  @Override
  public void processPayment(Long userId, Double total) {
    System.out.println("Process payment with card.");
  }

}
