package eu.ncdc.dao;


import eu.ncdc.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
@Transactional
public class BookDaoImpl implements BookDao{

    @Autowired
    private SessionFactory sessionFactory;

    public BookDaoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void saveBook(Book book) {
        sessionFactory.getCurrentSession().save(book);
    }

    @Override
    public Book findBookById(Integer id) {
        return sessionFactory.getCurrentSession().find(Book.class, id);
    }

    @Override
    public List<Book> findAllBooks() {
        CriteriaBuilder criteriaBuilder = getCurrentSession().getCriteriaBuilder();
        CriteriaQuery<Book> criteriaQuery = criteriaBuilder.createQuery(Book.class);
        criteriaQuery.from(Book.class);
        return getCurrentSession().createQuery(criteriaQuery).list();
    }

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

}
