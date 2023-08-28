package com.products.order.product.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.products.order.product.model.ProductResponse;

/**
 * Use this interface to implement feing client.
 *
 */
@FeingAnnotation(name = "product-service")
public interface ProductServiceClient {
}
