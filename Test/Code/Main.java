class ExcpRadius extends Exception {
    private double r;
    private String msg;
    private Float temp;
    ExcpRadius(double r_p) {
        r = r_p;
        msg = "The radius must be greater than 0. Invalid values: ";
        temp = new Float(r);
        msg += temp.toString();
    }
    public String getMessage() {
        return msg;
    }
}

interface Figure {
    public String Show();
    public double Area();
}

class Circle implements Figure {
    protected String str;
    protected double r;
    protected Float temp;
    Circle(double r_p) throws ExcpRadius {
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

class Rectangle implements Figure {
    protected String str;
    protected double a, b;
    protected Float temp;
    Rectangle(double a_p, double b_p){
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
        Figure shp = null;
        Cylinder clr;
        try {
            shp = new Circle(5);
        }
        catch(ExcpRadius e) {
            System.out.println(e.getMessage());
            System.out.println("Try again...");
        }
        System.out.println(shp.Show());
        //shp = new Rectangle(4,5);
        //System.out.println(shp.Show());
        clr = new Cylinder(3, new Circle(3));
        System.out.println(clr.Show());
    }
}