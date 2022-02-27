package figure.circle;

import figure.Figure;
import exceptions.ExcpRadius;

public class Circle implements Figure {
    protected String str;
    protected double r;
    protected Float temp;
    public Circle(double r_p) throws ExcpRadius {
        if (r_p <= 0) {
            throw new ExcpRadius(r_p);
        }
        r = r_p;
    }
    public double Area(){
        return 3.14 * (r * r);
    }
    public String Show(){
        str = "Circle info: ";
        str += "Radius: ";
        temp = new Float(r);
        str += temp.toString();
        str += " Area: ";
        temp = new Float(Area());
        str += temp.toString();
        str += "\n";
        return str;
    }
}