package org.cvtc.shapes;

//Abstract Shape functionality definition
public abstract class Shape {
	//Method to retrieve the surface area of a shape
	public abstract float getSurfaceArea();
	//Method to retrieve the volume of a shape
	public abstract float getVolume();
	//Method to retrieve the dimensions, surface area, and volume of a shape
	public abstract void render();
}
