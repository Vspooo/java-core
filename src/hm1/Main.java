package hm1;

import com.sun.source.tree.LambdaExpressionTree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> bookAuthors = new <String> ArrayList();
        bookAuthors.add("O.S. Easter");
        Book bookOne = new Book("algebra", 96 , "education", bookAuthors);
        System.out.println(bookOne);

        ArrayList <String> bookAuthorsTwo = new <String> ArrayList();
        bookAuthorsTwo.add("F. G. Turchenko");
        bookAuthorsTwo.add("V. M. Moroko");
        Book bookTwo = new Book("history of Ukraine",144,"education", bookAuthorsTwo);
        System.out.println(bookTwo);

        ArrayList <String> bookAuthorsThree = new <String> ArrayList();
        bookAuthorsThree.add("O. Karpyuk");
        Book bookThree = new Book("english",186,"education",bookAuthorsThree);
        System.out.println(bookThree);

        ArrayList <String> bookAuthorsFour = new <String> ArrayList();
        bookAuthorsFour.add("V. G. Baryakhtar");
        bookAuthorsFour.add("S.O. Dovhogo");
        Book bookFour = new Book("physic",142,"education",bookAuthorsFour);
        System.out.println(bookFour);

        ArrayList <String> bookAuthorsFive = new <String> ArrayList();
        bookAuthorsFive.add("V.V Zabolotnyi");
        bookAuthorsFive.add("O.V Zabolotnyi");
        Book bookFive = new Book("ukraine language",198,"education",bookAuthorsFive);
        System.out.println(bookFive);


        System.out.println("----------------------");


        Car carOne = new Car("BMW m5 e60", 504,5.0,true);
        System.out.println(carOne);

        Car carTwo = new Car("Audi RS6 C7",560,4.0,true);
        System.out.println(carTwo);

        Car carThree = new Car("Tesla Model S",330,0.5,false);
        System.out.println(carThree);

        Car carFour = new Car("Volkswagen Passat b5 TDI",130,1.9,true);
        System.out.println(carFour);

        Car carFive = new Car("Nissan Skyline r34",150,2.6,true);
        System.out.println(carFive);


        System.out.println("--------------------------");


        Dog dogOne = new Dog("Barsik",2,"german shepherd");
        System.out.println(dogOne);

        Dog dogTwo = new Dog("Rey",4,"Pug");
        System.out.println(dogTwo);

        Dog dogThree = new Dog("Rex",5,"badger dog");
        System.out.println(dogThree);









    }


}
