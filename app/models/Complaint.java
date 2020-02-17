package models;
import  javax.persistence.*;
//import javax.imageio.ImageIO;
//import java.awt.image.BufferedImage;
@Entity
public class Complaint {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long Idnumber;

    public String Email;

    public String Name;

    public String Categeory;

    //public BufferedImage Image;

    public Long Latitude;

    public Long Longitude;

    public String Description;

}
