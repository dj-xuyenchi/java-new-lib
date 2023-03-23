package Seoul.QA.HibernateCustom;

import java.util.List;

public class Context extends HibernateContext{

    private Repository<DongVat> dongVat;



    public Context(OptionConfig option, String database, String databaseName, String user, String pass, List<Class<?>> listClass) {
        super(option, database, databaseName, user, pass, listClass);
        dongVat = new Repository<>(DongVat.class);
    }

    public Repository<DongVat> getDongVat() {
        return dongVat;
    }
}
