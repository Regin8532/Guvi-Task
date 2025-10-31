package Task_3.Solution_2;

class Product implements Taxable {
    int pID;
    double price;
    int quantity;

    Product(int pID,double price,int quantity) {
        this.pID =pID;
        this.price =price;
        this.quantity =quantity;
    }

    public void calcTax() {
        double tax = price*salesTax;
        System.out.println("Sales Tax on one unit: "+tax);
    }
}
