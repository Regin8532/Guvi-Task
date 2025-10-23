package Task_1;

import java.util.Scanner;

public class BillAmount {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int purchaseAmount = obj.nextInt();
        int finalAmount;
        if(purchaseAmount<=500){
            finalAmount=purchaseAmount;
            System.out.println("Final Amount Payable:" + finalAmount);
        }else if(purchaseAmount>500 && purchaseAmount<=1000){
            finalAmount=purchaseAmount - (purchaseAmount*10)/100;
            System.out.println("Final Amount Payable:" + finalAmount);
        }else{
            finalAmount=purchaseAmount - (purchaseAmount*20)/100;
            System.out.println("Final Amount Payable:" + finalAmount);
        }
    }
}
