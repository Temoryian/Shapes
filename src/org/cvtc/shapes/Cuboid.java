package org.cvtc.shapes;

//Message box import
import javax.swing.JOptionPane;

//Represents a 3D Cuboid shape.
public class Cuboid extends Shape{

	//The width of this Cuboid instance.
	private float width = 0.0f;
	
	//The height of this Cuboid instance.
	private float height = 0.0f;
	
	//The depth of this Cuboid instance.
	private float depth = 0.0f;
  
	//Gets the width of this Cuboid instance.
	public float getWidth() {
		return width;
	}
	
	//Sets the width of this Cuboid instance.
	private void setWidth(float width) {
		this.width = width;
	}

	//Gets the height of this Cuboid instance.
	public float getHeight() {
		return height;
	}
	
	//Sets the height of this Cuboid instance.
	private void setHeight(float height) {
		this.height = height;
	}
	
	//Gets the depth of this Cuboid instance.
	public float getDepth() {
		return depth;
	}
	
	//Sets the depth of this Cuboid instance.
	private void setDepth(float depth) {
		this.depth = depth;
	}
	
	//Initializes a new instance of a Cuboid.
	public Cuboid(float width, float height, float depth) throws IllegalArgumentException {
		// Checking for negative arguments and display an error message if a negative number is entered.
		if (height <= 0 || width <= 0 || depth <= 0) {
			//Option Message disabled for error testing.
			//JOptionPane.showMessageDialog(null, "You have entered an invalid or negative number.");
			throw new IllegalArgumentException ();
		} 
		else {
	      //Sets the dimensions of this Cuboid instance if all values are > 0
	      setWidth(width);
	      setHeight(height);
	      setDepth(depth);      
		}
	}
	
	//Overrides the functionality of the getSurfaceArea() method in Shape
	@Override
	//Calculates and returns the surface area for this Cuboid instance.
	public float getSurfaceArea() {
    //Formula for the total surface area of a Cuboid = 2(dw + wh + hd)
		return 2 * (getDepth() * getWidth() + getWidth() * getHeight() + getHeight() * getDepth());
	}

	//Overrides the functionality of the getVolume() method in Shape	
	@Override
	//Calculates and returns the volume for this Cuboid instance.
	public float getVolume() {
		//Formula for the volume of a Cuboid
		return getDepth() * getWidth() * getHeight();
	}
	
	//Overrides the functionality of the render() method in Shape
	@Override
	//Displays via a message box the dimensions, surface area, and volume for this Cuboid instance.  Broken into multiple lines for readability.	
	public void render() {
		JOptionPane.showMessageDialog(null, "The width of the cuboid is: " + getWidth() + 
				"\nThe depth of the cuboid is: " + getDepth() +
				"\nThe height of the cuboid is: " + getHeight() +
				"\nThe surface area of the cuboid is: " + getSurfaceArea() + 
				"\nThe volume of the cuboid is: " + getVolume());
	}
	
}