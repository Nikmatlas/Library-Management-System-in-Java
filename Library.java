import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryBook> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(LibraryBook book) {
        books.add(book);
        System.out.println("\"" + book.getTitle() + "\" added to library.");
    }

    public void displayAllBooks() {
        System.out.println("\nLibrary Book Collection:");
        for (LibraryBook book : books) {
            book.displayBookInfo();
        }
    }

    public ArrayList<LibraryBook> getAvailableBooks() {
        ArrayList<LibraryBook> available = new ArrayList<>();
        for (LibraryBook book : books) {
            if (!book.isBorrowed()) {
                available.add(book);
            }
        }
        return available;
    }

    public void borrowBookByIndex(int index) {
        ArrayList<LibraryBook> available = getAvailableBooks();
        if (available.isEmpty()) {
            System.out.println("No available books to borrow.");
            return;
        }
        if (index < 0 || index >= available.size()) {
            System.out.println("Invalid selection.");
            return;
        }
        LibraryBook bookToBorrow = available.get(index);
        bookToBorrow.borrowBook();
    }

    public void borrowBook(String title) {
        for (LibraryBook book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Book with title \"" + title + "\" not found.");
    }

    public void returnBook(String title) {
        for (LibraryBook book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book with title \"" + title + "\" not found.");
    }
}
