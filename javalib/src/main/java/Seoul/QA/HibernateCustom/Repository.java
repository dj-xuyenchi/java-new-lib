
package Seoul.QA.HibernateCustom;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Repository<T> implements Behavior<T> {
    private Class<?> className;

    public Repository(Class<?> className) {
        this.className = className;
    }

    @Override
    public T save(T e) {
        try (Session session = HibernateContext.getSessionFactory().openSession()) {
            session.save(e);
            session.close();
            return e;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Override
    public T deleteById(int id) {
        Transaction transaction = null;
        try (Session session = HibernateContext.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            T e = (T) session.get(className, id);
            if (e == null) {
                return null;
            }
            session.delete(e);
            transaction.commit();
            session.close();
            return e;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Override
    public T update(T e) {
        Transaction transaction = null;
        try (Session session = HibernateContext.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(e);
            transaction.commit();
            session.close();
            return e;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Override
    public List<T> findAll() {
        try (Session session = HibernateContext.getSessionFactory().openSession()) {
            List<T> result = (List<T>) session.createQuery("from " + className.getSimpleName()).getResultList();
            session.close();
            return result;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Override
    public T findById(int id) {
        try (Session session = HibernateContext.getSessionFactory().openSession()) {
            T e = (T) session.get(className, id);
            session.close();
            return e;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Override
    public List<T> where(String query) {
        try (Session session = HibernateContext.getSessionFactory().openSession()) {
            List<T> result = session.createQuery(query).getResultList();
            session.close();
            return result;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }
}