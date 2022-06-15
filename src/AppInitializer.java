import javafx.application.Application;
import javafx.stage.Stage;
import lk.ijse.hibernate_2.entity.Customer;
import lk.ijse.hibernate_2.entity.Item;
import lk.ijse.hibernate_2.entity.OrderDetail;
import lk.ijse.hibernate_2.entity.Orders;
import lk.ijse.hibernate_2.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.xml.stream.FactoryConfigurationError;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Item item1 = new Item();
        item1.setCode("I001");
        item1.setDescription("Cake");
        item1.setPrice(200);
        item1.setQty(50);

        Customer c1 = new Customer();
        c1.setId("c001");
        c1.setName("sumera");
        c1.setAddress("colombo");

        Orders o1 = new Orders();
        o1.setOrderId("o001");
        o1.setId(c1);
        o1.setPrice(100);

        OrderDetail od1 = new OrderDetail();
        od1.setOrderDetailsId("od001");
        od1.setOrderQty(10);
        od1.setItem(item1);
        od1.setOrder(o1);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

       // session.save(item1);
      //  session.save(c1);
       // session.save(o1);
        session.save(od1);
       // session.update(item1);
       // session.get(Item.class,"I001");
       // System.out.println(item1);

        transaction.commit();
        session.close();

    }
}
