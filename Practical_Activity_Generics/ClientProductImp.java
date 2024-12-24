package com.oop.projects.Practical_Activity_Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ClientProductImp implements ICllient<Product> {
    private  List<Product> products_list = new ArrayList<>();
    static Scanner clavier = new Scanner(System.in);
    static boolean ProductHunt = false;
    public Product CreateProduct() {

        System.out.println("Enter Id");
        long ID = clavier.nextInt();

        System.out.println("Enter Name");
        String Name = clavier.next();

        System.out.println("Enter Brand");
        String Brand = clavier.next();

        System.out.println("Enter Price");
        double Price = clavier.nextDouble();

        System.out.println("Enter Description");
        String Description = clavier.next();

        System.out.println("Enter Quantity");
        int Quantity = clavier.nextInt();

        return new Product(ID, Name, Brand, Price, Description, Quantity);
    }

    @Override
    public void add(Product product) {
        products_list.add(product);
        System.out.println("\n ------------------------" +
                           "\n Product is added \n " +
                           "------------------------\n ");
    }

    @Override
    public List<Product> getAll() {
        return products_list ;
    }

    @Override
    public Product findById(long id) {
        for (Product product : products_list) {
            if(product.getId() == id ){
                return product;
            }
        }
        return null;
    }
    @Override
    public void removeById(long id) {
        boolean productFound = false;
        var iterator = products_list.iterator();
        //Iterator<Product> iterator = products_list.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId() == id) {
                iterator.remove();
                productFound = true;
                System.out.println("Product is removed");
                break;
            }
        }
        if (!productFound) {
            System.out.println("Product not found");
        }
    }

}
