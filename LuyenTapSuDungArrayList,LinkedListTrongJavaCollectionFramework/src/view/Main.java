package view;

import controller.IProductController;
import controller.ProductController;
import controller.ProductLinkedListController;
import model.Product;

public class Main {
    public static void main(String[] args) {
        IProductController arrayList= new ProductController();
        IProductController linkedList= new ProductLinkedListController();

        Product product1= new Product(16,"A",100);
        Product product2= new Product(25,"B",20000);
        Product product3= new Product(39,"C",37000);
        Product product4= new Product(41,"A",4000);
        Product product5= new Product(52,"A",56000);

        arrayList.add(product1);
        arrayList.add(product2);
        arrayList.add(product3);
        arrayList.add(product4);
        arrayList.add(product5);

//        arrayList.showAllProduct();

//        arrayList.delete(41);
//        arrayList.showAllProduct();

//        arrayList.edit(39, new Product(50,"dmm",10000));
//        arrayList.showAllProduct();
//
//        arrayList.sortByDecreasedPrice();
//        arrayList.showAllProduct();

        linkedList.add(new Product(10,"TA", 20000000));
        linkedList.showAllProduct();
    }
}
