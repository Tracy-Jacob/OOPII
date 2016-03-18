package FamilySaver;

/**
 * Created by jacobtracy on 3/16/16.
 */
public class runhibernate {
    public void runHibernateDemo() {
        // Hibernate
        System.out.println("Hibernate Example:");
        Savefamily storeData = new Savefamily();
        storeData.savethemember(100, "John", "Doe");
        System.out.println();
    }
}
