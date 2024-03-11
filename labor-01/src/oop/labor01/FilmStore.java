package oop.labor01;


enum Genre {Action,Crime,Drama,Fantasy,Horror,Science_fiction,Thriller,Comedy,Musical,}

public class FilmStore
{
    private String title;
    private String director;
    private int releaseYear;
    private double rating;
    private Genre genre;

    public FilmStore(String yourTitle, String yourDirector, String yourReleaseYear, String yourRating, String yourGenre) {

        title = yourTitle;
        director = yourDirector;
        releaseYear = Integer.parseInt(yourReleaseYear);
        rating = Double.parseDouble(yourRating);
        genre = Genre.valueOf(yourGenre);

    }

    public String getTitle() {
        return title;
    }
    public String getDirector() {
        return director;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public double getRating() {
        return rating;
    }

    public double setRating(double yourRating) {

        System.out.print("\n*Rating changed*\n");
        rating = yourRating;
        return rating;


    }
    public Genre getGenre() {
        return genre;
    }

    public String toString() {
        return "\nTitle: " + title +  " (" + releaseYear + ")" + " directed by " + director + "," + " rating: " + rating + "\n" + "Genre: " + genre;
    }








}
