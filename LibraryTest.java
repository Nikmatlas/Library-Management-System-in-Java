public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook(new LibraryBook("Java Basics", "John Smith", 2020));
        library.addBook(new LibraryBook("Object-Oriented Programming", "Jane Doe", 2019));
        library.addBook(new LibraryBook("Data Structures", "Michael Lee", 2021));

        // Display all books
        library.displayAllBooks();

        // Interactive borrowing using user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        java.util.ArrayList<LibraryBook> available = library.getAvailableBooks();
        System.out.println("\nAvailable books to borrow:");
        if (available.isEmpty()) {
            System.out.println("No available books.");
        } else {
            for (int i = 0; i < available.size(); i++) {
                LibraryBook b = available.get(i);
                System.out.println((i + 1) + ") " + b.getTitle() + ", " + b.getAuthor() + " (" + b.getYearOfPublication() + ")");
            }
            System.out.print("Enter number of the book to borrow (0 to skip): ");
            int selection = -1;
            try {
                selection = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input.");
                scanner.nextLine();
            }
            if (selection > 0) {
                library.borrowBookByIndex(selection - 1);
            } else {
                System.out.println("No book borrowed.");
            }
        }

        // Display all books after borrowing
        library.displayAllBooks();
        scanner.close();
    }
}
