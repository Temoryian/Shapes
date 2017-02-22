package org.cvtc.shapes;

//Class to instantiate Cuboid, Cylinder, Sphere and display their dimensions, surface area, and volume.
public class ShapesTest {

	public static void main(String[] args) {
		
		Dialog dialog = new MessageBox();
		
		//Instantiate Cuboid object
		Cuboid cuboid = new Cuboid(dialog, 1, 1, 1);
		//Instantiate Cylinder object
		Cylinder cylinder = new Cylinder(dialog, 1, 1);
		//Instantiate Sphere object
		Sphere sphere = new Sphere(dialog, 1);
		
		//Render method calls to display dimensions, surface area, and volume of the Cuboid, Cylinder, & Sphere.
		cuboid.render();
		cylinder.render();
		sphere.render();
	}

}