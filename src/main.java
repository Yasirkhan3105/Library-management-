import dao.BookDAO;
import models.Book;

import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookDAO bookDAO = new BookDAO();

        while (true) {
            System.out.println("Library Management System:");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            try {
                switch (choice) {
                    case 1:
                        // Add a new book
                        System.out.print("Enter book title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter book author: ");
                        String author = sc.nextLine();
                        System.out.print("Enter book quantity: ");
                        int quantity = sc.nextInt();
                        Book newBook = new Book(0, title, author, quantity);
                        bookDAO.addBook(newBook);
                        break;

                    case 2:
                        // View all books
                        List<Book> books = bookDAO.getAllBooks();
                        System.out.println("📚 All Books:");
                        for (Book book : books) {
                            System.out.println(book);
                        }
                        break;

                    case 3:
                        // Update an existing book
                        System.out.print("Enter book ID to update: ");
                        int bookIdToUpdate = sc.nextInt();
                        sc.nextLine(); // Clear buffer
                        System.out.print("Enter new title: ");
                        String newTitle = sc.nextLine();
                        System.out.print("Enter new author: ");
                        String newAuthor = sc.nextLine();
                        System.out.print("Enter new quantity: ");
                        int newQuantity = sc.nextInt();
                        Book updatedBook = new Book(bookIdToUpdate, newTitle, newAuthor, newQuantity);
                        bookDAO.updateBook(updatedBook);
                        break;

                    case 4:
                        // Delete a book
                        System.out.print("Enter book ID to delete: ");
                        int bookIdToDelete = sc.nextInt();
                        bookDAO.deleteBook(bookIdToDelete);
                        break;

                    case 5:
                        // Exit the program
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
