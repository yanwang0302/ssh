package com.ssh.repository.impl;

import com.ssh.repository.PersonRepository;
import com.ssh.entity.Person;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Evin
 * On 2/2/2017.2:30 PM
 */
@Repository
public class PersonRepositoryImpl implements PersonRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }

    public Person load(Long id) {
        return (Person)getCurrentSession().load(Person.class,id);
    }

    public Person get(Long id) {
        return (Person)getCurrentSession().get(Person.class,id);
    }

    public List<Person> findAll() {
        SQLQuery sqlQuery = getCurrentSession().createSQLQuery("select * from person");
        sqlQuery.addEntity(Person.class);
        return sqlQuery.list();
    }

    public void persist(Person entity) {
        getCurrentSession().persist(entity);
    }

    public Long save(Person entity) {
        Session session = getCurrentSession();
        try {
            Transaction t = session.beginTransaction();
            Long lo =  (Long)session.save(entity);
            t.commit();
            session.flush();
            return lo;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //session.close();
            //sessionFactory.close();
        }
        return 123L;
    }

    public void saveOrUpdate(Person entity) {
        getCurrentSession().saveOrUpdate(entity);
    }

    public void delete(Long id) {
        Person person = load(id);
        getCurrentSession().delete(person);
    }

    public void flush() {
        getCurrentSession().flush();
    }
}