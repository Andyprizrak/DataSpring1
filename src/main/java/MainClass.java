import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MainClass {

    private static void findeByer(String byer_id) {
        String s = "from Checkin a WHERE a.checkin_byer_id ="+byer_id;
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Checkin.class)
                .addAnnotatedClass(Byer.class)
                .buildSessionFactory();
        Session session;
        session = factory.getCurrentSession();
        session.beginTransaction();
        List<Checkin> checks = session.createQuery(s).getResultList();
        System.out.println(checks);
        session.getTransaction().commit();
        System.out.println("Byer");

    }
    private static void findeProduct(String product_name){
        String s = "from Checkin a WHERE a.checkin_product_id ="+product_name;
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Checkin.class)
                .addAnnotatedClass(Byer.class)
                .buildSessionFactory();
        Session session;
        session = factory.getCurrentSession();
        session.beginTransaction();
        List<Checkin> checks = session.createQuery(s).getResultList();
        System.out.println(checks);
        session.getTransaction().commit();

        System.out.println("Product");
    }

    public static void main(String[] args) {

// Поиск списка товаров покупателем
        findeByer("1");

// Посик списка покупателей товара
        findeProduct("3");


    }
}
