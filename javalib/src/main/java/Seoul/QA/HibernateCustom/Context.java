package Seoul.QA.HibernateCustom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Context extends HibernateContext{

    private Repository<DongVat> dongVat;


    @Override
    public void config() {
        setDatabase("localhost");
        setDatabaseName("test1");
        setOption(OptionConfig.MYSQL);
        setUser("root");
        setPass("1231234");
        setListClass(new ArrayList<Class<?>>(Arrays.asList(DongVat.class)));
    }

    public Context() {
        dongVat = new Repository<>(DongVat.class);
    }

    public Repository<DongVat> getDongVat() {
        return dongVat;
    }
}
