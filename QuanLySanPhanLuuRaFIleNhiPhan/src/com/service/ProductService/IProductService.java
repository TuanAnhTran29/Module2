package com.service.ProductService;

import com.model.Product;
import com.service.IGeneralService;

import java.util.List;

public interface IProductService extends IGeneralService<Product> {
    public void addAll(List<Product> products);
}
