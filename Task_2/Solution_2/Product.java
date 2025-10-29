package Task_2.Solution_2;

public class Product {
    int pId;
    double price;
    int quantity;
    Product(int pId,double price,int quantity){
        this.pId=pId;
        this.price=price;
        this.quantity=quantity;
    }
    static double costOfSIngleProducts(double price,int quantity){
        return price*quantity;
    }
}
