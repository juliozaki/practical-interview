package com.products.order.payment.serviceImpl;

import com.products.order.payment.service.PaymentProcessor;

/**
 * Implement the Paypal payment. 
 *
 */
public class PaypalPaymentProcessor implements PaymentProcessor {

  @Override
  public void processPayment(Long userId, Double total) {
    System.out.println("Process payment with paypal.");
  }

}
