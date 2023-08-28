package com.products.order.payment.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.products.order.payment.service.PaymentProcessor;
import com.products.order.payment.serviceImpl.CreditCardPaymentProcessor;
import com.products.order.payment.serviceImpl.PaypalPaymentProcessor;

@Configuration
public class PaymentProcessorConfiguration {
  
}
