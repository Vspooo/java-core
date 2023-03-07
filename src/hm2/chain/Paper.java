package hm2.chain;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Paper {
    private String components;

    @Override
    public String toString() {
        return "Paper{" +
                "components='" + components + '\'' +
                '}';
    }
}
