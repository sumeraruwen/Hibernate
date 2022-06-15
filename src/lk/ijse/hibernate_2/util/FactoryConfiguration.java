package lk.ijse.hibernate_2.util;

import lk.ijse.hibernate_2.entity.Customer;
import lk.ijse.hibernate_2.entity.Item;
import lk.ijse.hibernate_2.entity.OrderDetail;
import lk.ijse.hibernate_2.entity.Orders;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Orders.class)
                .addAnnotatedClass(OrderDetail.class);

         sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance(){
        return factoryConfiguration == null ? factoryConfiguration= new FactoryConfiguration() : factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }



}
