import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
 public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int product_id;

    @Column(name = "product_name")
    private String product_name;

//    @ManyToOne
//    @JoinColumn(name = "checkin_id")
//    private Checkin checkin_id;

    public int getId() {
        return product_id;
    }

    public void setId(int id) {
        this.product_id = id;
    }

    public String getProduct() {
        return product_name;
    }

    public void setProduct(String product_name) {
        this.product_name = product_name;
    }
    public Product () {

    }


    @Override
    public String toString() {
        return "Product " + product_id + ":" + product_name + " ";
    }

}
