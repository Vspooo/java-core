package hm3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Drum implements Instrument{
   private int size;
    @Override
    public void play() {
        System.out.println("Грає Барабан розміру - " + this.size);
    }
}
