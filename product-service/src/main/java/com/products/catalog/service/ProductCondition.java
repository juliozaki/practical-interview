package com.products.catalog.service;

import java.util.function.Predicate;
import com.products.catalog.model.Product;

@FunctionalInterface
public interface ProductCondition extends Predicate<Product> {
  
}
