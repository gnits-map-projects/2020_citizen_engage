package models;
import  javax.persistence.*;


@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;

    public String Adminname;

    public String Password;

    public String Department;

}
