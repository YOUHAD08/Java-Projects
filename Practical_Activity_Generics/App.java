package com.oop.projects.Practical_Activity_Generics;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean user_is_in = true;
        AppLayout App_layout = new AppLayout();
        ClientProductImp user = new ClientProductImp();


        App_layout.welcome_page();
        App_layout.footer();

        while (user_is_in) {

            String choice = sc.next();
            App_layout.header();

            switch (choice) {

                case "1":
                    Product product = user.CreateProduct();
                    user.add(product);
                    break;
                case "2":
                    System.out.println("Enter Id of the product to be deleted: ");
                    long ID = sc.nextInt();
                    user.removeById(ID);
                    break;
                case "3":
                    System.out.println(user.getAll());
                    break;
                case "4":
                    System.out.println("Enter Id of the product you're looking for: ");
                    long Id = sc.nextInt();
                    Product productHunt = user.findById(Id);
                    if (productHunt==null){
                        System.out.println("Product not found ");
                    }
                    else {
                        App_layout.Tableau_headers();
                        System.out.println(productHunt);
                    }
                    break;
                case "H" :
                    App_layout.Home();
                    break;
                case "E":
                    App_layout.Exit();
                    user_is_in=false;
                    break;}
            if(user_is_in){App_layout.footer();}
        }

    }

}
