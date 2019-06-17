package hibernate.inheritance.stategies.one_table_per_class_hierarchy;

import javax.persistence.*;

@Entity
@Table(name = "shape")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "Discriminator",
        discriminatorType = DiscriminatorType.STRING
)
@DiscriminatorValue("S")
public class Shape {

    @Id
    @Column(name = "id", nullable = false, updatable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    int shapeId;

    @Column(name = "shape_name")
    String shapeName;

    public Shape() {

    }

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public int getShapeId() {
        return shapeId;
    }

    public void setShapeId(int shapeId) {
        this.shapeId = shapeId;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}
