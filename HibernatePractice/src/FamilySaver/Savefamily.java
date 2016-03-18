package FamilySaver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jacobtracy on 3/16/16.
 */
public class Savefamily {

    public static Map<Integer, Family> familymember = new HashMap<>();

    public static void main(String[] args){
        Savefamily savefamily = new Savefamily();
        savefamily.savethemember(45, "Adam", "Tracy");
    }

    public void savethemember(int id, String firstname, String lastname){

        familymember.put(id, new Family(id, firstname,lastname));

        org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration();
            cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(familymember.get(id));

        transaction.commit();

        session.close();

        System.out.println("You succesfully saved the family member");
        }
    }





