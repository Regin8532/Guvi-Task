package Task_3.Solution_1;

class Library {
    Book[] books;
    int count;

    Library(int size) {
        books = new Book[size];
        count = 0;
    }

    void addBook(Book b) {
        if (count < books.length) {
            books[count++] = b;
            System.out.println("Book added");
        }
    }
    void removeBook(int bookID) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                books[i] = books[count - 1];
                books[count - 1] = null;
                count--;
                found = true;
                System.out.println("Book removed");
                break;
            }
        }
    }
    void searchBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                System.out.println("Book found:");
                books[i].display();
            }
        }
    }

    void displayAllBooks() {
        for (int i = 0; i < count; i++) {
            books[i].display();
        }
    }

}
