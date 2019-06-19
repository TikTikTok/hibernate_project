package hibernate.inheritance.stategies.one_table_per_sub_class;

import javax.persistence.*;

@Entity
@Table(name = "table_per_rectangle")
@PrimaryKeyJoinColumn(name = "ID")
public class Rectangle_Per_Table extends Shape_Per_Table {

    /*@Id
    @Column(name = "rec_id", updatable = false, unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rec_id;*/

    @Column(name = "rectangle_length")
    double length;

    @Column(name = "rectangle_breath")
    double breath;

    public Rectangle_Per_Table()
    {

    }

    public Rectangle_Per_Table(String shapeName, double length, double breath)
    {
        super(shapeName);
        this.length = length;
        this.breath = breath;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreath() {
        return breath;
    }

    public void setBreath(double breath) {
        this.breath = breath;
    }
}
