package Task_3.Solution_1;

import java.util.Scanner;

//1.Design a Java program that uses OOP principles to model the Book Create two classes: Book and Library. The Book class should have attributes such as bookID, title, author, and is Available.
//The Library class should include an array to store book objects.
//2.Provide methods to add books, remove book search books (using id)and display books.Write a Java program that demonstrates the use of these classes and methods by allowing the user to interact with the library system.
public class BookManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library(5);
        int choice;

        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Title: ");
                    String title = sc.next();
                    System.out.print("Enter Author: ");
                    String author = sc.next();
                    System.out.print("Availablity (true/false): ");
                    boolean available = sc.nextBoolean();
                    lib.addBook(new Book(id, title, author, available));
                    break;
                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = sc.nextInt();
                    lib.removeBook(removeId);
                    break;
                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = sc.nextInt();
                    lib.searchBook(searchId);
                    break;
                case 4:
                    lib.displayAllBooks();
                    break;
                case 5:
                    System.out.println("Exiting ...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
//Output:
//1. Add Book
//2. Remove Book
//3. Search Book
//4. Display All Books
//5. Exit
//Enter your choice: 1
//Enter Book ID: 1
//Enter Title: ABC
//Enter Author: abc
//Availablity (true/false): true
//Book added
//1. Add Book
//2. Remove Book
//3. Search Book
//4. Display All Books
//5. Exit
//Enter your choice: 1
//Enter Book ID: 2
//Enter Title: DEF
//Enter Author: def
//Availablity (true/false): false
//Book added
//1. Add Book
//2. Remove Book
//3. Search Book
//4. Display All Books
//5. Exit
//Enter your choice: 1
//Enter Book ID: 3
//Enter Title: GHI
//Enter Author: ghi
//Availablity (true/false): true
//Book added
//1. Add Book
//2. Remove Book
//3. Search Book
//4. Display All Books
//5. Exit
//Enter your choice: 2
//Enter Book ID to remove: 3
//Book removed
//1. Add Book
//2. Remove Book
//3. Search Book
//4. Display All Books
//5. Exit
//Enter your choice: 3
//Enter Book ID to search: 2
//Book found:
//Book ID:2
//Title:DEF
//Author:def
//Availability:false
//1. Add Book
//2. Remove Book
//3. Search Book
//4. Display All Books
//5. Exit
//Enter your choice: 4
//Book ID:1
//Title:ABC
//Author:abc
//Availability:true
//Book ID:2
//Title:DEF
//Author:def
//Availability:false
//1. Add Book
//2. Remove Book
//3. Search Book
//4. Display All Books
//5. Exit
//Enter your choice: 5
//Exiting ...