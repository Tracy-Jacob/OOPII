package FunShopInventory;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by jacobtracy on 3/17/16.
 */
public class Model {

    static void insertItem(Item itemTheInsert) {

    }

    static List<Item> returnAllItems() {
        Session session = DatabaseConnection.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Query itemQuery = session.createQuery("Select * from Item;");


        List<Item> itemList = itemQuery.list();

        transaction.commit();

        return itemList;
    }

    static Item queryItemByName(String aName) {
        Session session = DatabaseConnection.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Query oneItemQuery = session.createQuery("Select o from Item as o where o.name = :aName");
        oneItemQuery.setParameter("aName", aName);

        Item oneItem = (Item) oneItemQuery.uniqueResult();

        transaction.commit();

        return oneItem;

    }

    static void mergeItemInformation(Item anItemtheUpdate) {
        Session session = DatabaseConnection.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Query oneItemQuery = session.createQuery("Select o from Item as o where o.name = :aName");
        oneItemQuery.setParameter("aName", anItemtheUpdate.getId());

        session.merge(anItemtheUpdate);


    }
}
