package hm2.hierarchy;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PC{
    private String operationSystem;
    private String model;

    @Override
    public String toString() {
        return "PC{" +
                "operationSystem='" + operationSystem + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
