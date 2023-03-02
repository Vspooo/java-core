package hm1;

import java.util.ArrayList;
import java.util.Arrays;

public class Book {
    String title;
    Number pages ;
    String genre;
    ArrayList<String> authors;


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

