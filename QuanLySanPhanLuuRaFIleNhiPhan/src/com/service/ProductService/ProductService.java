package com.service.ProductService;

import com.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    List<Product> products= new ArrayList<>();

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        Product product= null;
        for (Product p: products) {
            if (p.getId() ==  id){
                product= p;
            }
        }
        return product;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void update(Product product) {
        int index= 0;

        for (Product p: products) {
            if (p.getId() == product.getId()){
                products.set(index, product);
            }
            index++;
        }
    }

    @Override
    public void delete(int id) {
        int index= 0;

        for (Product p: products) {
            if (p.getId() == id){
                products.remove(index);
            }
            index++;
        }
    }

    @Override
    public void addAll(List<Product> productFromFile) {
        products.removeAll(products);
        products.addAll(productFromFile);
    }
}
