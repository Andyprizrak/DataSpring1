import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "check")

public class Check {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "check_id")
    private int check_id;
    @Column(name = "check_byer_id")
    private int check_byer_id;
    @Column(name = "check_product_id")
    private int check_product_id;
    @Column(name = "check_number")
    private int check_number;


    public int getId() {
        return check_id;
    }
    public void setId(int check_id) {
        this.check_id = check_id;
    }
    public int getCheckByerId() {
        return check_byer_id;
    }
    public void setCheckByerId(int check_byer_id) {
        this.check_byer_id = check_byer_id;
    }
    public int getCheckProductId() {
        return check_product_id;
    }
    public void setCheckProductId(int check_product_id) {
        this.check_product_id = check_product_id;
    }
    public int getCheckNumber() {
        return check_number;
    }
    public void setCheckNumber(int check_number) {
        this.check_number = check_number;
    }

    public Check() {
    }

    @Override
    public String toString() {
        return "Check " + check_id + ":" + check_byer_id + " ";
    }
//    @Override
//    public String toString() {
//        String allProducts = "";
//        for (Product o : products) {
//            allProducts += o.getTitle() + " ";
//        }
//        return "Reader [" + id + " " + name + " " + allProducts + "]";
//    }
}

