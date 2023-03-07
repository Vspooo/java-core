package hm2.enumTask;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Skills {
    private String title;
    private  int exp;


    @Override
    public String toString() {
        return "Skills{" +
                "title='" + title + '\'' +
                ", exp=" + exp +
                '}';
    }

}
