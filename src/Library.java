import java.io.*;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private static final String File_Name = "LibraryFile.txt";
    public Library(){
        this.books = new ArrayList<>();
        loadBooksFromFile();
    }

    public void addBook(Book book){
        books.add(book);
        saveBooksToFile();
    }
    public void viewBooks(){
        for (Book book : books) {
            System.out.println("Title: "+book.getTitle() + "\n"+"Author: "+ book.getAuthor()+"\n"+"Is Available: "+ book.getAvailibilty());
        }
    }
    public void borrowBook(String title){
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.getAvailibilty()) {
                book.setAvailable(false) ;
                saveBooksToFile();
            }
        }
    }
    public void returnBook(String title){
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.setAvailable(true);
                saveBooksToFile();
            }
        }
    }
    private void saveBooksToFile(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(File_Name))){
            for(Book book:books){
                writer.write(book.getTitle()+","+book.getAuthor()+","+book.getAvailibilty());
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println("Error saving books to the file "+e);
        }

    }
    private void loadBooksFromFile(){
        File file = new File(File_Name);
        if(!file.exists()){return;}
        try
            (BufferedReader reader = new BufferedReader(new FileReader(File_Name))){
                String line;
                while((line = reader.readLine())!=null){
                    String parts[] = line.split(",");
                    if(parts.length == 3){
                        String title = parts[0];
                        String author = parts[1];
                        boolean isAvailable = Boolean.parseBoolean(parts[2]);
                        books.add(new Book(title,author,isAvailable));
                    }
                }
            } catch (IOException e){
            System.out.println("Error Reading the data from file "+e);
        }
    }

}
