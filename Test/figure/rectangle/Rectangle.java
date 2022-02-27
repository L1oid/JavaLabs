package figure.rectangle;

import figure.Figure;
import exceptions.ExcpRadius;

public class Rectangle implements Figure {
    protected String str;
    protected double a, b;
    protected Float temp;
    public Rectangle(double a_p, double b_p){
        a = a_p;
        b = b_p;
    }
    public double Area(){
        return a * b;
    }
    public String Show(){
        str = "Rectangle info: ";
        str += "Side a: ";
        temp = new Float(a);
        str += temp.toString();
        str += " Side b: ";
        temp = new Float(b);
        str += temp.toString();
        str += " Area: ";
        temp = new Float(Area());
        str += temp.toString();
        str += "\n";
        return str;
    }
}