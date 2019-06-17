package hibernate.inheritance.stategies.one_table_per_class_hierarchy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TablePerHierarchyTest {

    public static void main(String[] args) {

        Shape shape = new Shape("square");
        Rectangle rectangle  = new Rectangle("Rectangle",12,15);
        Circle circle = new Circle("Circle", 12,12);

        SessionFactory sessionFactory = HibernateSessionUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(shape);
        session.save(rectangle);
        session.save(circle);
        session.getTransaction().commit();
        session.close();
    }


}
