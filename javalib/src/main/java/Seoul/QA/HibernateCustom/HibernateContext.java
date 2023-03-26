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
    private String database;
    private String databaseName;
    private String user;
    private String pass;
    private OptionConfig option;
    private List<Class<?>> listClass;

    public void config() {
    }

    public static SessionFactory getSessionFactory() {
        return FACTORY;
    }

    public HibernateContext() {
        config();
        switch (option) {
            case MYSQL:
                configMySQL();
                break;
            case SQLSERVER:
                configSQLServer();
                break;
        }
    }

    private void configSQLServer() {
        Configuration conf = new Configuration();
        Properties prop = new Properties();
        prop.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        prop.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        prop.put(Environment.URL, "jdbc:sqlserver://" + database + ":1433;" + "database=" + databaseName + ";encrypt=true;trustservercertificate=true;");
        prop.put(Environment.USER, user);
        prop.put(Environment.PASS, pass);
        conf.setProperties(prop);
        for (Class<?> item : listClass) {
            conf.addAnnotatedClass(item);
        }
        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(sr);
    }

    private void configMySQL() {
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

    public static void setFACTORY(SessionFactory FACTORY) {
        HibernateContext.FACTORY = FACTORY;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setOption(OptionConfig option) {
        this.option = option;
    }

    public void setListClass(List<Class<?>> listClass) {
        this.listClass = listClass;
    }
}
