public class Sphere extends Circle implements Volume{

    public Sphere(double radius, String name){
	super(radius,name);
    }
    public double getVolume(){
	return 4/3*super.getArea()*super.getRadius();
    }

    public String toString(){
	return "Sphere with radius of"+super.getRadius();
    }
}