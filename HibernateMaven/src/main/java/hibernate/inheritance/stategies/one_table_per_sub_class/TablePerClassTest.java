package hibernate.inheritance.stategies.one_table_per_sub_class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TablePerClassTest {

    public static void main(String[] args) {

        Shape_Per_Table shape_per_class = new Shape_Per_Table("Table_Per_class");
        Rectangle_Per_Table rectangle_per_class = new Rectangle_Per_Table("Table_Per_Rectangle", 12, 15);
        Circle_Per_Table circle_per_class = new Circle_Per_Table("Circle_Per_Table", 12, 12);

        SessionFactory sessionFactory = HibernateSessionUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(shape_per_class);
        session.save(rectangle_per_class);
        session.save(circle_per_class);
        session.getTransaction().commit();
        session.close();
    }
}
