package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.junit.Test;

public class CylinderUnitTests {

	@Test
	public void testCylinderHeight() throws IllegalArgumentException {
		// 1. Arrange
		Cylinder myCylinder = new Cylinder(1.0f, 2.0f);
		float expected = 2.0f;
		
		// 2. Act
		float actual = myCylinder.getHeight();
		
		// 3. Assert 
		assertEquals("Height should equal 2.0f", expected, actual, 0);
	}
	
	@Test
	public void testCylinderRadius() throws IllegalArgumentException {
		// 1. Arrange
		Cylinder myCylinder = new Cylinder(1.0f, 2.0f);
		float expected = 1.0f;
		
		// 2. Act
		float actual = myCylinder.getRadius();
		
		// 3. Assert 
		assertEquals("Radius should equal 1.0f", expected, actual, 0);
	}
	
	@Test
	public void testCylinderInstantiation() throws IllegalArgumentException {
		// 1. Arrange
		Cylinder myCylinder = new Cylinder(1.0f, 2.0f);
		float expectedRadius = 1.0f;
		float expectedHeight = 2.0f;
		
		// 2. Act
		float actualHeight = myCylinder.getHeight();
		float actualRadius = myCylinder.getRadius();
		
		// 3. Assert 
		assertEquals("Radius should equal 2.0f", expectedRadius, actualRadius, 0);
		assertEquals("Height should equal 1.0f", expectedHeight, actualHeight, 0);
	}
	
	@Test
	public void testCylinderSurfaceArea() throws IllegalArgumentException {
		// 1. Arrange
		Cylinder myCylinder = new Cylinder(1.0f, 2.0f);
		float expected = 18.8495559215388f;
		
		// 2. Act
		float actual = myCylinder.getSurfaceArea();
		
		// 3. Assert 
		assertEquals("Surface area should equal 18.8495559215388f", expected, actual, 0);
	}
	
	@Test
	public void testCylinderSurfaceArea2() throws IllegalArgumentException {
		// 1. Arrange
		Cylinder myCylinder = new Cylinder(50.0f, 100.2f);
		float expected = 47186.723f;
		
		// 2. Act
		float actual = myCylinder.getSurfaceArea();
		
		// 3. Assert 
		assertEquals("Surface area should equal 47186.723f", expected, actual, 0);
	}
	
	@Test
	public void testCylinderSurfaceArea3() throws IllegalArgumentException {
		// 1. Arrange
		Cylinder myCylinder = new Cylinder(5.5f, 72.25f);
		float expected = 2686.8474f;
		
		// 2. Act
		float actual = myCylinder.getSurfaceArea();
		
		// 3. Assert 
		assertEquals("Surface area should equal 2686.8474f", expected, actual, 0);
	}
	
	@Test
	public void testCylinderVolume() throws IllegalArgumentException {
		// 1. Arrange
		Cylinder myCylinder = new Cylinder(1.0f, 2.0f);
		float expected = 6.2831855f;
		
		// 2. Act
		float actual = myCylinder.getVolume();
		
		// 3. Assert 
		assertEquals("Volume should equal 6.2831855f", expected, actual, 0);
	}
	
	@Test
	public void testCylinderVolume2() throws IllegalArgumentException {
		// 1. Arrange
		Cylinder myCylinder = new Cylinder(50.0f, 100.2f);
		float expected = 786968.94f;
		
		// 2. Act
		float actual = myCylinder.getVolume();
		
		// 3. Assert 
		assertEquals("Volume should equal 786968.94f", expected, actual, 0);
	}
	
	@Test
	public void testCylinderVolume3() throws IllegalArgumentException {
		// 1. Arrange
		Cylinder myCylinder = new Cylinder(5.5f, 72.25f);
		float expected = 6866.1475f;
		
		// 2. Act
		float actual = myCylinder.getVolume();
		
		// 3. Assert 
		assertEquals("Volume should equal 6866.1475", expected, actual, 0);
	}
	
	//Error Handling
	
		@Test(expected = IllegalArgumentException.class)
		public void getRadiusZeroValueThrowsException() throws IllegalArgumentException {
			Cylinder myCylinder = new Cylinder(0, 1);
			myCylinder.getRadius();
		}
		
		@Test(expected = IllegalArgumentException.class)
		public void getRadiusNegativeValueThrowsException() throws IllegalArgumentException {
			Cylinder myCylinder = new Cylinder(-1, 0);
			myCylinder.getRadius();
		}
		
		@Test(expected = IllegalArgumentException.class)
		public void getHeightZeroValueThrowsException() throws IllegalArgumentException {
			Cylinder myCylinder = new Cylinder(1, 0);
			myCylinder.getHeight();
		}
		
		@Test(expected = IllegalArgumentException.class)
		public void getHeightNegativeValueThrowsException() throws IllegalArgumentException {
			Cylinder myCylinder = new Cylinder(1, -1);
			myCylinder.getHeight();
		}
		
		@Test(expected = IllegalArgumentException.class)
		public void getSurfaceAreaZeroValueThrowsException() throws IllegalArgumentException {
			Cylinder myCylinder = new Cylinder(0, 0);
			myCylinder.getSurfaceArea();
		}
		
		@Test(expected = IllegalArgumentException.class)
		public void getSurfaceAreaNegativeValueThrowsException() throws IllegalArgumentException {
			Cylinder myCylinder = new Cylinder(-1, 1);
			myCylinder.getSurfaceArea();
		}
		
		@Test(expected = IllegalArgumentException.class)
		public void getVolumeZeroValueThrowsException() throws IllegalArgumentException {
			Cylinder myCylinder = new Cylinder(0, 0);
			myCylinder.getVolume();
		}
		
		@Test(expected = IllegalArgumentException.class)
		public void getVolumeNegativeValueThrowsException() throws IllegalArgumentException {
			Cylinder myCylinder = new Cylinder(-1, 1);
			myCylinder.getVolume();
		}

}
