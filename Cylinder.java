package cop2805;

public class Cylinder extends Shape3D{
	
	int radius,height;
	
	//Cylinder constructor function
	// assigns variables to radius and height
	public Cylinder(int r, int h){
		radius = r;
		height = h;
	}
	
	//overides Shapes3D volume method
	//calculates Volume for Cylinder
	@Override
	public double Volume() {
	
		return Math.PI * radius * radius * height;
	}

	
	
}