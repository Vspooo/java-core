package hm3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor

public class Book implements Printable {
    private String title;
    private int pages;
    public void print() {

    }
}
