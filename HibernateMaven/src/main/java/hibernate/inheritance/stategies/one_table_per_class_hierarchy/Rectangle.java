package hibernate.inheritance.stategies.one_table_per_class_hierarchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rectangle")
@DiscriminatorValue("R")
public class Rectangle extends Shape {

    @Column(name = "rectangle_length")
    double length;

    @Column(name = "rectangle_breath")
    double breath;

    public Rectangle()
    {

    }

    public Rectangle(String shapeName, double length, double breath)
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
