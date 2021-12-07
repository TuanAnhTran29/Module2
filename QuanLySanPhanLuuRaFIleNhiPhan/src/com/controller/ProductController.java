package com.controller;

import com.model.Product;
import com.service.ProductService.IProductService;
import com.service.ProductService.ProductService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    static IProductService productService= new ProductService();
    static String path= "products.txt";

    public static void writeToFile(){
        try {
            FileOutputStream fileInputStream= new FileOutputStream(path);
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileInputStream);
            objectOutputStream.writeObject(productService.findAll());
            fileInputStream.close();
            objectOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static List<Product> readFromFile(){
        try {
            FileInputStream fileInputStream= new FileInputStream(path);
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
            productService.addAll((List<Product>) objectInputStream.readObject());
            fileInputStream.close();
            objectInputStream.close();
        }catch (EOFException e){
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productService.findAll();
    }

    public static void addProduct(){

        System.out.println("Enter name of product: ");
        Scanner scanner= new Scanner(System.in);
        String name= scanner.nextLine();

        System.out.println("Enter ID of product: ");
        Scanner scanner1= new Scanner(System.in);
        int id= scanner1.nextInt();

        System.out.println("Enter brand of product: ");
        Scanner scanner2= new Scanner(System.in);
        String brand= scanner2.nextLine();

        System.out.println("Enter price of product: ");
        Scanner scanner3= new Scanner(System.in);
        int price= scanner3.nextInt();

        productService.add(new Product(id,name,brand,price));
        writeToFile();

    }

    public static Product findProduct(String name){
        Product product= null;

        for (Product p: productService.findAll()) {
            if (p.getName().equals(name)){
                product= p;
            }
        }
        return product;
    }

    public static void showProductList(){
        for (Product p: productService.findAll()) {
            System.out.println(p);
        }
    }
}
