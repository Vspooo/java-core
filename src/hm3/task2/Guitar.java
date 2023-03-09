package hm3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.namespace.QName;

@Data @AllArgsConstructor @NoArgsConstructor

public class Guitar implements Instrument {
    private  int numberOfString;
    @Override
    public void play() {
        System.out.println("Грає гітара з кількістю струн - " + this.numberOfString);
    }


}
