package org.cvtc.shapes.tests;

import static org.junit.Assert.*;

import org.cvtc.shapes.*;
import org.cvtc.shapes.tests.substitutes.MessageBoxSub;
import org.junit.Test;

public class ShapeFactoryUnitTests {

	MessageBoxSub dialogSub = new MessageBoxSub();
	ShapeFactory shapeFactory = new ShapeFactory(dialogSub);
	
	@Test
	public void testShapeFactoryCuboid() {
		// 1. Arrange
		Cuboid myCuboid = shapeFactory.buildCuboid(1, 1, 1);
		// 2. Act
		// 3. Assert 
		myCuboid.render();
	}
	
	@Test
	public void testShapeFactoryCylinder() {
		// 1. Arrange
		Cylinder myCylinder = shapeFactory.buildCylinder(1, 1);
		// 2. Act
		// 3. Assert 
		myCylinder.render();
	}
	
	@Test
	public void testShapeFactorySphere() {
		// 1. Arrange
		Sphere mySphere = shapeFactory.buildSphere(1);
		// 2. Act
		// 3. Assert 
		mySphere.render();
	}
}
