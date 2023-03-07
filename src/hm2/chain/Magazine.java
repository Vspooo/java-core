package hm2.chain;

public class Magazine extends Book{

    private int price;

    public Magazine(String components, String name, int countOfPages, String genre, int price) {
        super(components, name, countOfPages, genre);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "price=" + price +
                "} " + super.toString();
    }
}

