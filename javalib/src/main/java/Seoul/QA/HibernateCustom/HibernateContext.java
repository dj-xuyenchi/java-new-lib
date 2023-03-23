package Seoul.QA.HibernateCustom;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.List;
import java.util.Properties;

public class HibernateContext {
    private static SessionFactory FACTORY;

    public static SessionFactory getSessionFactory() {
        return FACTORY;
    }

    public HibernateContext(OptionConfig option, String database, String databaseName, String user, String pass, List<Class<?>> listClass) {
        switch (option) {
            case MYSQL:
                configMySQL(database, databaseName, user, pass, listClass);
                break;
            case SQLSERVER:
                configSQLServer(database, databaseName, user, pass, listClass);
                break;
        }
    }

    private static void configSQLServer(String database, String databaseName, String user, String pass, List<Class<?>> listClass) {
        Configuration conf = new Configuration();
        Properties prop = new Properties();
        prop.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        prop.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        prop.put(Environment.URL, "jdbc:sqlserver://" + database + ";" + "database=" + ";encrypt=true;trustservercertificate=true;");
        prop.put(Environment.USER, user);
        prop.put(Environment.PASS, pass);
        conf.setProperties(prop);
        for (Class<?> item : listClass) {
            conf.addAnnotatedClass(item);
        }
        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(sr);
    }

    private static void configMySQL(String database, String databaseName, String user, String pass, List<Class<?>> listClass) {
        Configuration conf = new Configuration();
        Properties prop = new Properties();
        prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        prop.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        prop.put(Environment.URL, "jdbc:mysql://" + database + ":3306/" + databaseName + "?autoReconnect=true&useSSL=false");
        prop.put(Environment.USER, user);
        prop.put(Environment.PASS, pass);
        conf.setProperties(prop);
        for (Class<?> item : listClass) {
            conf.addAnnotatedClass(item);
        }
        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(sr);
    }
}
