import java.util.Scanner;
import exceptions.ExcpRadius;
import figure.Figure;
import figure.rectangle.Rectangle;
import figure.circle.Circle;
import figure.cylinder.Cylinder;

class Main {
    public static void main(String[] args) {
        Figure shp = null;
        Cylinder clr = null;
        try {
            shp = new Circle(5);
	        clr = new Cylinder(3, new Circle(3));
            shp = new Rectangle(4,5);
        }
        catch(ExcpRadius e) {
            System.out.println(e.getMessage());
            System.out.println("Try again...");
        }
        System.out.println(shp.Show());
	    System.out.println(clr.Show());
        System.out.println(shp.Show());
    }
}
