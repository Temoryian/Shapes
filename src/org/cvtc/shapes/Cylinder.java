package org.cvtc.shapes;

//Message box import
import javax.swing.JOptionPane;

//Represents a 3D Cylinder shape
public class Cylinder extends Shape {
	
	//The radius of this Cylinder instance.
	private float radius = 0.0f;

	//The height of this Cylinder instance.
	private float height = 0.0f;
  
	//Gets the radius of this Cylinder instance.
	public float getRadius() {
		return radius;
	}
  
	//Sets the radius of this Cylinder instance.
	private void setRadius(float radius) {
		this.radius = radius;
	}
  
	//Gets the height of this Cylinder instance.
	public float getHeight() {
		return height;
	}
  
	//Sets the height of this Cylinder instance.
	private void setHeight(float height) {
		this.height = height;
	}
  
	//Initializes a new instance of a Cylinder.
	public Cylinder(float radius, float height) throws IllegalArgumentException {
		// Checking for negative arguments and display an error message if a negative number is entered.
		if (radius <= 0 || height <= 0) {
			//Option Message disabled for error testing.
			//JOptionPane.showMessageDialog(null, "You have entered an invalid or negative number.");
			throw new IllegalArgumentException ();
		} 
		else {
			// Set the dimensions of this Cylinder instance if radius and height entered are positive values.
			setRadius(radius);
			setHeight(height);
		} 
	}
	
	//Overrides the functionality of the getSurfaceArea() method in Shape
	@Override
	//Calculates and returns the surface area for this Cylinder instance
	public float getSurfaceArea() {
		//Formula for the surface area of a Cylinder: 2(pi r 2) + (2 pi r)* h
		return (float) ((2 * (float)Math.PI * getRadius() * getHeight()) + (2 * (float)Math.PI * Math.pow(getRadius(), 2)));
	}

	//Overrides the functionality of the getVolume() method in Shape
	@Override 
	//Calculates and returns the volume for this Cylinder instance
	public float getVolume() {
		//Formula for the volume of a cylinder: PIr2h
		return (float) Math.PI * (float)Math.pow(getRadius(), 2) * getHeight();
	}

	//Overrides the functionality of the render() method in Shape
	@Override
	//Displays via a message box the dimensions, surface area, and volume for this Cylinder instance.  Broken into multiple lines for readability.	
	public void render() {
		JOptionPane.showMessageDialog(null, "The radius of the cylinder is: " + getRadius() + 
				"\nThe height of the cylinder is: " + getHeight() +
				"\nThe surface area of the cylinder is: " + getSurfaceArea() + 
				"\nThe volume of the cylinder is: " + getVolume());
	}
	
}