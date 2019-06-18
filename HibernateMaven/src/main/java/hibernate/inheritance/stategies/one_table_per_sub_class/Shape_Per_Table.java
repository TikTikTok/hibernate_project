package hibernate.inheritance.stategies.one_table_per_sub_class;

import javax.persistence.*;

@Entity
@Table(name = "table_per_shape")
@Inheritance(strategy = InheritanceType.JOINED)
public class Shape_Per_Table {

    @Id
    @Column(name = "id", nullable = false, updatable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "shape_name")
    String shapeName;

    public Shape_Per_Table() {

    }

    public Shape_Per_Table(String shapeName) {
        this.shapeName = shapeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}
