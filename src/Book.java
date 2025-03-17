public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    Book(String title,String author, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.isAvailable=isAvailable;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean getAvailibilty(){
        return isAvailable;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

}
