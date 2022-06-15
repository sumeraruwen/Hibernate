import javafx.application.Application;
import javafx.stage.Stage;
import lk.ijse.hibernate_2.entity.Item;
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


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

       // session.save(item1);
       // session.update(item1);
       // session.get(Item.class,"I001");
       // System.out.println(item1);

        transaction.commit();
        session.close();

    }
}
