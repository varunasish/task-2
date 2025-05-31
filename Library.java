public class Library {
    private Book[] books;
    private int count;

    public Library() {
        books = new Book[5]; // capacity 5 books
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full.");
        }
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[--count] = null;
                System.out.println("Book removed.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void replaceBook(int bookID, String newTitle, String newAuthor) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                books[i].setTitle(newTitle);
                books[i].setAuthor(newAuthor);
                System.out.println("Book updated.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books in the library.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(books[i]);
            }
        }
    }
}
