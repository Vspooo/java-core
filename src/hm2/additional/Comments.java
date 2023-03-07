package hm2.additional;

import lombok.*;

@Data @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Comments {
    private int commentID;
    private int cId;
    private String name;
    private String email;
    private String body;

}
