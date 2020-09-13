import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "checkin")

public class Checkin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "checkin_id")
    private int checkin_id;
    @Column(name = "checkin_byer_id")
    private int checkin_byer_id;
    @Column(name = "checkin_product_id")
    private int checkin_product_id;

    public int getId() {
        return checkin_id;
    }
    public void setId(int byer_id) {
        this.checkin_id = byer_id;
    }
    public int getCheckinByerId() {
        return checkin_byer_id;
    }
    public void setCheckinByerId(int byer_name) {
        this.checkin_byer_id = byer_name;
    }
    public int getCheckinProductId() {
        return checkin_product_id;
    }
    public void setCheckinProductId(int product_id) {
        this.checkin_product_id = product_id;
    }
    public Checkin() {
    }

    @Override
    public String toString() {
        return "checkin " + checkin_id + ":" + checkin_byer_id + " ";

    }
}
