package com.view;

import com.controller.ProductController;
import com.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductController.readFromFile();
        ProductController.showProductList();

        ProductController.readFromFile();
        ProductController.showProductList();

    }
}
