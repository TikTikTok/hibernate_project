package hibernate.inheritance.stategies.one_table_per_class_hierarchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "circle")
@DiscriminatorValue("C")
public class Circle extends Shape {

    @Column(name = "circle_length")
    int length;

    @Column(name = "circle_breath")
    int breath;

    public Circle()
    {

    }

    public Circle(String shapeName, int length, int breath)
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
