package ua.com.owu.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserProductDTO {

    private int idUser;
    private String name;
    private int age;
    private int idProduct;
    private String pName;
    private String pType;

}
