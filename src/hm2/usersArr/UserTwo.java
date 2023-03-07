package hm2.usersArr;

import hm2.usersArr.Address;
import hm2.usersArr.Company;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserTwo {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private int phone;
    private String website;
    private Company company;

}
