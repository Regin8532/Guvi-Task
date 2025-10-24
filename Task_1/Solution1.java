package Task_1;

public class Solution1 {
    //1) Write a program to print the numbers from 10 to 50 using for loop/while loop.
    public static void main(String[] args) {
        numPrinting();
    }

    //Prints the vaues from 10 to 50
    //Output - 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50
     public static void numPrinting() {
        for(int i=10;i<=50;i++){
            System.out.print(i + " ");
        }
    }
}
