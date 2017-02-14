package org.cvtc.shapes;

//Class to instantiate Cuboid, Cylinder, Sphere and display their dimensions, surface area, and volume.
public class ShapesTest {

	public static void main(String[] args) {
		//Instantiate Cuboid object
		Cuboid CreateCuboid = new Cuboid(0, 0, 0);
		//Instantiate Cylinder object
		Cylinder CreateCylinder = new Cylinder(0, 0);
		//Instantiate Sphere object
		Sphere CreateSphere = new Sphere(0);
		//Render method calls to display dimensions, surface area, and volume of the Cuboid, Cylinder, & Sphere.
		CreateCuboid.render();
		CreateCylinder.render();
		CreateSphere.render();
	}

}