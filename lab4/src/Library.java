/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doffi
 */
public class Library {

    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;

    public void addBook(Book book, int slot) {
        switch (slot) {
            case 1:
                book1 = book;
                break;
            case 2:
                book2 = book;
                break;
            case 3:
                book3 = book;
                break;
        }
    }

    public void removeBook(int slot) {
        switch (slot) {
            case 1:
                book1 = null;
                break;
            case 2:
                book2 = null;
                break;
            case 3:
                book3 = null;
                break;
        }
    }

    public void printLibraryDetails() {
        System.out.println("Library: " + libraryName);
        System.out.println();
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    if (book1 != null) {
                        book1.printDetails();
                    } else {
                        System.out.println("No book in this slot.");
                    }
                    break;
                case 2:
                    if (book2 != null) {
                        book2.printDetails();
                    } else {
                        System.out.println("No book in this slot.");
                    }
                    break;
                case 3:
                    if (book3 != null) {
                        book3.printDetails();
                    } else {
                        System.out.println("No book in this slot.");
                    }
                    break;
            }
            System.out.println();
        }
    }

    public void checkBookAvailability(int slot) {
        switch (slot) {
            case 1:
                if (book1 != null) {
                    System.out.println(book1.title + "is available.");
                } else {
                    System.out.println("Book in slot " + book1.title + " is not available.");
                }
                break;
            case 2:
                if (book2 != null) {
                    System.out.println(book1.title + "is available.");
                } else {
                    System.out.println("Book in slot " + book2.title + " is not available.");
                }
                break;
            case 3:
                if (book3 != null) {
                    System.out.println(book3.title + "is available.");
                } else {
                    System.out.println("Book in slot " + book3.title + " is not available.");
                }
                break;
        }
    }

    public void updateBookPrice(int slot, double newPrice) {
        switch (slot) {
            case 1:
                if (book1 != null) {
                    book1.price = newPrice;
                    System.out.println("Update price of " + book1.title + " to " + newPrice + ".");
                } else {
                    System.out.println("No book in this slot.");
                }
                break;
            case 2:
                if (book2 != null) {
                    book2.price = newPrice;
                    System.out.println("Update price of " + book2.title + " to " + newPrice + ".");
                } else {
                    System.out.println("No book in this slot.");
                }
                break;
            case 3:
                if (book3 != null) {
                    book3.price = newPrice;
                    System.out.println("Update price of " + book3.title + " to " + newPrice + ".");
                } else {
                    System.out.println("No book in this slot.");
                }
                break;
        }
    }

    public void printBookDetails(Book book) {
        if (book != null) {
            book.printDetails();
        } else {
            System.out.println("No book in this slot.");
        }
    }
}
