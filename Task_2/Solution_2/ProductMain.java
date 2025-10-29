package Task_2.Solution_2;

import java.util.Scanner;

//1.2). Create class Product (pid, price, quantity) with parameterized constructor.
//Create a main function in different class (say ProductMain) and perform following task:
//a. Accept five product information from user and store in an array
//b. Find Pid of the product with the highest price.
//c. Create method (with array of product's object as argument) in ProductMain class to calculate and return the total amount spent on all products. (amount spent on
//single product-price of product* quantity of product
public class ProductMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product products[] =new Product[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the details of product "+ (i+1) +":");
            System.out.println("Enter Product ID :");
            int pId=sc.nextInt();
            System.out.println("Enter Product price :");
            double price=sc.nextDouble();
            System.out.println("Enter Product quantity :");
            int quantity=sc.nextInt();
            products[i]=new Product(pId,price,quantity);
        }
        Product highestPriceProduct= products[0];
        for (int i = 0; i < 5; i++) {
            if(products[i].price>highestPriceProduct.price){
                highestPriceProduct= products[i];
            }
        }
        System.out.println("The highest priced product's pID is :"+highestPriceProduct.pId);
        System.out.println("Total amount of all the products is "+ totalAmount(products));
    }
    static double totalAmount(Product p[]){
        double total=0;
        for (int i = 0; i < 5; i++) {
            total+=Product.costOfSIngleProducts(p[i].price,p[i].quantity);
        }
        return total;
    }
}
//output:
//Enter the details of product 1:
//Enter Product ID :
//1
//Enter Product price :
//10
//Enter Product quantity :
//1
//Enter the details of product 2:
//Enter Product ID :
//2
//Enter Product price :
//20
//Enter Product quantity :
//2
//Enter the details of product 3:
//Enter Product ID :
//3
//Enter Product price :
//30
//Enter Product quantity :
//3
//Enter the details of product 4:
//Enter Product ID :
//4
//Enter Product price :
//40
//Enter Product quantity :
//4
//Enter the details of product 5:
//Enter Product ID :
//5
//Enter Product price :
//50
//Enter Product quantity :
//5
//The highest priced product's pID is :5
//Total amount of all the products is 550.0