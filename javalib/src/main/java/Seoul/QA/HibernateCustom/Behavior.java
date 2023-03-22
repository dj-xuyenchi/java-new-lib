package Seoul.QA.HibernateCustom;

import java.util.List;

public interface Behavior<T> {
    public T save(T e);

    public T deleteById(int id);

    public T update(T e);

    public List<T> findAll();

    public T findById(int id);

    public List<T> where(String query);
}
