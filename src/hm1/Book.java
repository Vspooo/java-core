package hm1;

import java.util.ArrayList;
import java.util.Arrays;

public class Book {
   private String title;
    private Number pages ;
    private String genre;
    private ArrayList<String> authors;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(Number pages) {
        this.pages = pages;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public Number getPages() {
        return pages;
    }

    public String getGenre() {
        return genre;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public Book(){

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", genre='" + genre + '\'' +
                ", authors=" + authors +
                '}';
    }

    public Book(String title, Number pages, String genre, ArrayList<String> authors) {
        this.title = title;
        this.pages = pages;
        this.genre = genre;
        this.authors = authors;
    }
}

