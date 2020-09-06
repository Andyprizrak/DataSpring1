import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "byer")

public class Byer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "byer_id")
    private int byer_id;
    @Column(name = "byer_name")
    private String byer_name;

    public int getId() {
        return byer_id;
    }
    public void setId(int byer_id) {
        this.byer_id = byer_id;
    }
    public String getName() {
        return byer_name;
    }
    public void setName(String byer_name) {
        this.byer_name = byer_name;
    }
    public Byer() {
    }

    @Override
    public String toString() {
        return "Byer " + byer_id + ":" + byer_name + " ";

    }
}
