package FunShopInventory;

/**
 * Created by jacobtracy on 3/17/16.
 */

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class DatabaseConnection

{

    private static final SessionFactory sessionFactory;

    static{
        Configuration config = new Configuration();

        config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

        config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");

        config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/FunShop");

        config.setProperty("hibernate.connection.username", "root");

        config.setProperty("hibernate.connection.password", "root");

        config.setProperty("hibernate.connection.pool_size", "1");

        config.setProperty("hibernate.connection.autocommit", "true");

        config.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");

        config.setProperty("hibernate.show_sql", "false");

        config.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");

        config.setProperty("hibernate.current_session_context_class", "thread");

        config.addAnnotatedClass(Item.class);

        StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(config.getProperties());

        ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
        sessionFactory = config.buildSessionFactory(serviceRegistry);

    }

    public static SessionFactory getSessionFactory(){

        return sessionFactory;

    }

    private DatabaseConnection(){

    }

}
