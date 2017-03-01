package org.cvtc.shapes;

//Class to instantiate Cuboid, Cylinder, Sphere and display their dimensions, surface area, and volume.
public class ShapesTest {

	public static void main(String[] args) {
		
		Dialog dialog = new MessageBox();
		ShapeFactory shapeFactory = new ShapeFactory(dialog);
		
		Cuboid cuboid = shapeFactory.buildCuboid(1,1,1);
		Cylinder cylinder = shapeFactory.buildCylinder(1,1);
		Sphere sphere = shapeFactory.buildSphere(1);
		
		cuboid.render();
		cylinder.render();
		sphere.render();
	
	}

}