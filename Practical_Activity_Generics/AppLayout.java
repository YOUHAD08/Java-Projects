package com.oop.projects.Practical_Activity_Generics;

public class AppLayout {
    void welcome_page(){
        System.out.println("----Welcome to the Stock Management System----");
    }
    void Tableau_headers(){
        System.out.print("id   |  Name   |  Brand  |  Price  |  Description |  Quantity \n" );
    }
    void header(){
        System.out.print("----- ----- -- Stock Management-- ----- -----\n" );
    }
    void Home() {
        System.out.print(
                "1. Add a product\n" +
                        "\n" +
                        "2. Delete a product\n" +
                        "\n" +
                        "3. Display the product list\n" +
                        "\n" +
                        "4. Search for a product\n" +
                        "\n" +
                        "Choose an option:\n");
    }
    void footer(){
        System.out.print("H: Home ----- ----- ----- ----- ----- E: Exit\n" );
    }
    void Exit() {
        System.out.println("Exiting the Stock Management System");
    }

}
