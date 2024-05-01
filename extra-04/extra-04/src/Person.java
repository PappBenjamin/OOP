import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.String.valueOf;

public class Person
{
    private String firstName;
    private String lastName;
    private MyDate birthDate;
    private List<Book> books = new ArrayList<>();
    private static AtomicInteger count = new AtomicInteger(1);
    private String id;
    public Person(String firstName, String lastName, int year, int month, int day) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = new MyDate(year, month, day);

        StringBuilder sb = new StringBuilder();

        sb.append(firstName.charAt(0));
        sb.append(lastName.charAt(0));
        sb.append("_");
        sb.append(count.getAndIncrement());

        this.id = valueOf(sb);

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

   public MyDate getBirthDate()
    {
        return birthDate;
    }

    public String getId(){return id;}

    public void returnBook(int id) {
        for(int i = 0; i < books.size(); ++i)
        {
            if(books.get(i).getId() == id)
            {
                books.remove(i);
            }
        }
    }

    public void borrowBook(Book book) {
        books.add(book);
        book.setCheckedOut(true);
    }
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(firstName + " " + lastName + "born in " + birthDate + " (ID: " + id + ")\n");

        if(books.size() == 0)
        {
            sb.append("No books\n");
        }
        else
        {
            sb.append("Book(s) to read:\n");

            for(int i = 0; i < books.size(); ++i)
            {
                sb.append("\t- " + books.get(i));
            }
        }

        return sb.toString();


    }
}

