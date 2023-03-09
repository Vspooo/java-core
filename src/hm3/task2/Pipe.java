package hm3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Pipe implements Instrument{
    private  int diameter;
    @Override
    public void play() {

        System.out.println("Грає труба з діаметром -" + this.diameter);
    }
}
