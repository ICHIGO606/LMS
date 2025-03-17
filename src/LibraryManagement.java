public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Bleach","Eichiro Dubey",true);
        Book book2 = new Book("Game Of Phones","Shivam RR Martin",true);
        Book book3 = new Book("Robin","NAMI",true);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.borrowBook("Bleach");
        library.borrowBook("Naruto");
        library.returnBook("One Piece");
        library.viewBooks();

    }
}
