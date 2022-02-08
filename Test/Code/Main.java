class Figure {
    protected String str;
    String Show() {return "";}
    double Area() {return 0;}
}

class Circle extends Figure {
    protected double r;
    protected Float temp;
    Circle(double r_p){
        r = r_p;
    }
    double Area(){
        return 3.14 * (r * r);
    }
    String Show(){
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

class Rectangle extends Figure {
    protected double a, b;
    protected Float temp;
    Rectangle(double a_p, double b_p){
        a = a_p;
        b = b_p;
    }
    double Area(){
        return a * b;
    }
    String Show(){
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

class Cylinder
{
    protected double h;
    protected String str;
    protected Figure shp;
    protected Float temp;
    Cylinder(double h_p, Figure shp_p){
		h = h_p;
		shp = shp_p;
	}
    double Volume(){
		return h * shp.Area();
	}
    String Show(){
		str = "Cylinder info: ";
		str += "Height h: ";
		temp = new Float(h);
        str += temp.toString();
		str += " Base area: ";
		temp = new Float(shp.Area());
        str += temp.toString();
		str += " Volume: ";
		temp = new Float(Volume());
        str += temp.toString();
		str += "\n";
		return str;
	}
}

class Main {
    public static void main(String[] args) {
        Figure shp;
        Cylinder clr;
        shp = new Circle(5);
        System.out.println(shp.Show());
        shp = new Rectangle(4,5);
        System.out.println(shp.Show());
        clr = new Cylinder(3, new Circle(3));
        System.out.println(clr.Show());
    }
}