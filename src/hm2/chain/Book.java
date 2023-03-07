package hm2.chain;

public class Book extends Paper {
    private String name;
    private int countOfPages;
    private String genre;

    public Book(){

    }

    public Book(String components, String name, int countOfPages, String genre) {
        super(components);
        this.name = name;
        this.countOfPages = countOfPages;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", countOfPages=" + countOfPages +
                ", genre='" + genre + '\'' +
                "} " + super.toString();
    }
}
