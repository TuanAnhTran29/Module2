package controller;

import model.Product;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ProductLinkedListController implements IProductController<Product> {
    private List<Product> productList= new LinkedList<>();

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void edit(int id, Product product) {
        int index=-1;
        for (Product p: productList){
            if (p.getId() == id) {
                index= productList.indexOf(p);
            }
        }
        if (index == -1){
            System.out.println("This product is not in the list");
        }else {
            productList.set(index, product);
        }
    }

    @Override
    public void delete(int id) {
        int index=-1;
        for (Product p: productList){
            if (p.getId() == id){
                index= productList.indexOf(p);
            }
        }
        if (index == -1){
            System.out.println("This product is not in the list");
        }else {
            productList.remove(index);
        }
    }

    @Override
    public List<Product> showAllProduct() {
        for (Product p: productList) {
            System.out.println(p.toString());
        }
        return productList;
    }

    @Override
    public Product findByName(String name) {
        Product product= new Product();
        for (Product p: productList) {
            if (p.getName().equals(name)){
                product= p;
            }
        }
        return product;
    }

    @Override
    public List<Product> sortByIncreasedPrice() {
        Comparator<Product> productComparator= new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice()< o2.getPrice()){
                    return 1;
                }else if (o1.getPrice() == o2.getPrice()){
                    return 0;
                }else {
                    return -1;
                }
            }


        };
        Collections.sort(productList, productComparator);
        return productList;
    }

    @Override
    public List<Product> sortByDecreasedPrice() {
        Comparator<Product> productComparator= new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice()> o2.getPrice()){
                    return 1;
                }else if (o1.getPrice() == o2.getPrice()){
                    return 0;
                }else {
                    return -1;
                }
            }


        };
        Collections.sort(productList, productComparator);
        return productList;
    }
}
