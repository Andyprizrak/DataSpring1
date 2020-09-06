import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Test")

public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTest")
    private int id;
    @Column(name = "Test_name")
    private String name;



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
////    public List<Product> getProducts() {
////        return products;
////    }
//    public void setProducts (List<Product> products) {
//        this.products = products;
//    }
    public Test() {
    }
    @Override
    public String toString() {
        return "Test [" + id + " " + name + " "; //+ author_id.toString() + "]";
//    @Override
//    public String toString() {
//        String allProducts = "";
//        for (Product o : products) {
//            allProducts += o.getTitle() + " ";
//        }
//        return "Reader [" + id + " " + name + " " + allProducts + "]";
    }
}



