package org.cvtc.shapes;

//Message box import
import javax.swing.JOptionPane;

//Represents a 3D Sphere shape
public class Sphere extends Shape {

	//The radius of this Sphere instance.
	private float radius = 0.0f;
	
	//Gets the radius of this Sphere instance.
	public float getRadius() {
		return radius;
	}
	  
	//Sets the radius of this Sphere instance.
	private void setRadius(float radius) {
		this.radius = radius;
	}
	
	//Initializes a new instance of a Sphere.
	public Sphere(float radius) throws IllegalArgumentException {
		// Checking for negative arguments and display an error message if a negative number is entered.
		if (radius <= 0) {
			//Option Message disabled for error testing.
			//JOptionPane.showMessageDialog(null, "You have entered an invalid or negative number.");
			throw new IllegalArgumentException ();
		} 
		else {
			// Set the dimensions of this Sphere instance if radius is a positive value.
			setRadius(radius);
		}
	}
	
	//Overrides the functionality of the getSurfaceArea() method in Shape
	@Override
	//Calculates and returns the surface area for this Sphere instance
	public float getSurfaceArea() {
		//Formula for the surface area of a sphere: 4 pi r^2
		return (float) (4 * Math.PI * (Math.pow(radius, 2)));
	}

	//Overrides the functionality of the getVolume() method in Shape
	@Override
	//Calculates and returns the volume for this Sphere instance
	public float getVolume() {
		//Formula for the volume of a sphere: (4/3) pi r^3 - Math.pow used for exponents > 2
		return (float) ((4.0 / 3.0) * Math.PI * (Math.pow(radius, 3)));
	}

	//Overrides the functionality of the render() method in Shape
	@Override
	//Displays via a message box the dimensions, surface area, and volume for this Sphere instance.  Broken into multiple lines for readability.	
	public void render() {
		JOptionPane.showMessageDialog(null, "The radius of the sphere is: " + getRadius() + 
				"\nThe surface area of the sphere is: " + getSurfaceArea() + 
				"\nThe volume of the sphere is: " + getVolume());
	}
  
}