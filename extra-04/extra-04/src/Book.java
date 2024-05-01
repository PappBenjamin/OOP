import java.util.concurrent.atomic.AtomicInteger;

public class Book
{
    private String isbn;
    private int numPages;
    private int id;
    private boolean checkedOut;
    private String title;
    private static AtomicInteger count = new AtomicInteger(0);
    private String author;


    public Book(String string_1, String string_2, String string_3) {

        this.title = string_1;
        this.author = string_2;
        this.isbn = string_3;
        this.id = count.getAndIncrement();
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getId()
    {
        return id;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getNumPages() {
        return numPages;
    }
    public boolean isCheckedOut(){return checkedOut;}
    public void setCheckedOut(boolean value) {
        this.checkedOut = value;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public int compareTo(Book book){
        return 1;
    } // nincs meg, mert nem ertem mit kene csinalni

    @Override
    public String toString() {
        return count.get() + ". " + title + " by " + author + " ( ID: " + id + ")\n";
    }
}
