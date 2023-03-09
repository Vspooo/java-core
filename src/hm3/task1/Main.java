package hm3.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book book =new Book("book about life",243);
        System.out.println(book);
        Magazine magazine = new Magazine("Garden and house",44);
        System.out.println(magazine);

        ArrayList<Printable> list = new ArrayList<Printable>();
        list.add(new Book("Garry Potter",347));
        list.add(new Magazine("Anonymous killer",78));
        System.out.println(list);


    }
}
