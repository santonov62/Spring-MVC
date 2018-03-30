package SpringMVC.dao;

import SpringMVC.model.Person;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Person get(long id) {
        return sessionFactory.getCurrentSession().get(Person.class, id);
    }
}
