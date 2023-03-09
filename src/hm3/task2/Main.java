package hm3.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Instrument> instruments = new ArrayList<Instrument>();
        instruments.add(new Guitar(10));
        instruments.add(new Drum(15));
        instruments.add(new Pipe(5));
        for (Instrument instrument : instruments) {
            instrument.play();
        }


    }
}
