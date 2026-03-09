public class LibraryBook {
    private String title;
    private String author;
    private int yearOfPublication;
    private boolean isBorrowed;

    public LibraryBook(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("\"" + title + "\" has been borrowed.");
        } else {
            System.out.println("\"" + title + "\" is already borrowed.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("\"" + title + "\" has been returned.");
        } else {
            System.out.println("\"" + title + "\" was not borrowed.");
        }
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title
                + ", Author: " + author
                + ", Year: " + yearOfPublication
                + ", Status: " + (isBorrowed ? "Borrowed" : "Available"));
    }
}
