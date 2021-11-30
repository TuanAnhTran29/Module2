package controller;

import model.Product;

import java.util.List;

public interface IProductController<Product> {
    public void add(Product product);

    public void edit(int id, Product product);

    public void delete(int id);

    public List<Product> showAllProduct();

    public Product findByName(String name);

    public List<Product> sortByIncreasedPrice();

    public List<Product> sortByDecreasedPrice();

}
