package hm2.usersArr;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String street;
    private  String suite;
    private String city;
    private String zipcode;
    private Geo geo;
}
