package hibernate.inheritance.stategies.one_table_per_sub_class;

import javax.persistence.*;

@Entity
@Table(name = "table_per_circle")
@PrimaryKeyJoinColumn(name = "ID")
public class Circle_Per_Table extends Shape_Per_Table {

    @Id
    @Column(name = "circle_id", updatable = false, unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    int circle_id;

    @Column(name = "circle_length")
    int length;

    @Column(name = "circle_breath")
    int breath;

    public Circle_Per_Table()
    {

    }

    public Circle_Per_Table(String shapeName, int length, int breath)
    {
        super(shapeName);
        this.length = length;
        this.breath = breath;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }
}
