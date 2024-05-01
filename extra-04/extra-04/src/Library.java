import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Library
{
    private String address;
    private String name;
    private List<Book> books = new ArrayList<>();


    public Library(String address, String name) {
        this.address = address;
        this.name = name;
    }

   public void returnBook(Book book) {
       book.setCheckedOut(false);
   }
   public void addBook(Book book) {books.add(book);}

    public void sortBooks() {} // nincs meg, mert nincs mi alapjan
    public void sortByAuthorAndPages() {
        books.sort(Comparator.comparing(Book::getAuthor).thenComparing(Book::getNumPages));
    }

    public boolean checkoutBook(String title) {
        for(int i = 0; i < books.size();++i)
        {
            if(books.get(i).getTitle().equals(title))
            {
                books.get(i).setCheckedOut(true);
            }
        }
        return true;
    }
    public int countBooks(String string) {
        return books.size();
    }
    public Book findBook(String title) {
        for(int i = 0; i < books.size();++i)
        {
            if(books.get(i).getTitle().equals(title))
            {
                return books.get(i);
            }
        }
        return null;
    }
    public List<Book> getBooks() {
        return books;
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("The " + name + " library:\n\t" + "Address: " + address + "\n\t" + "Name: " + name + "\n\t" + "Books: \n");

        for(int i = 0; i < books.size();++i)
        {
            sb.append("\t\t" + books.get(i));
        }

        sb.append("\n");

        return sb.toString();
    }



}
