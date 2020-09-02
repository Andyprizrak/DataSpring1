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
//        SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Product.class)
//                .addAnnotatedClass(Checkin.class)
//                .addAnnotatedClass(Byer.class)
// //               .addAnnotatedClass(Test.class)
//                .buildSessionFactory();
//        Session session;
//        session = factory.getCurrentSession();
//        session.beginTransaction();
////        Product product = session.get(Product.class, 2);
////        System.out.println(product);
////        List<Product> products = session.createQuery("from Product a WHERE a.id=1").getResultList();
//        List<Product> products = session.createQuery("from Product").getResultList();
//        System.out.println(products);
////        System.out.println(products.get(2));
//        List<Byer> byers = session.createQuery("from Byer").getResultList();
//        System.out.println(byers);
////        Checkin checks = session.get(Checkin.class, 1);
//        List<Checkin> checks = session.createQuery("from Checkin a WHERE a.checkin_byer_id =1").getResultList();
//        System.out.println(checks);
//        session.getTransaction().commit();

// Поиск списка товаров покупателем
        findeByer("1");

// Посик списка покупателей товара
        findeProduct("3");


    }
}
