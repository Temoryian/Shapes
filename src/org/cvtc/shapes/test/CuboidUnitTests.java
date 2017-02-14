package org.cvtc.shapes.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.cvtc.shapes.Cuboid;

public class CuboidUnitTests {

	@Test
	public void testCuboidWidth() throws IllegalArgumentException {
		// 1. Arrange
		Cuboid myCuboid = new Cuboid(1.0f, 2.0f, 3.0f);
		float expected = 1.0f;
		
		// 2. Act
		float actual = myCuboid.getWidth();
		
		// 3. Assert 
		assertEquals("Width should equal 1.0f", expected, actual, 0);
	}
	
	@Test
	public void testCuboidHeight() throws IllegalArgumentException {
		// 1. Arrange
		Cuboid myCuboid = new Cuboid(1.0f, 2.0f, 3.0f);
		float expected = 2.0f;
		
		// 2. Act
		float actual = myCuboid.getHeight();
		
		// 3. Assert 
		assertEquals("Height should equal 2.0f", expected, actual, 0);
	}
	
	@Test
	public void testCuboidDepth() throws IllegalArgumentException {
		// 1. Arrange
		Cuboid myCuboid = new Cuboid(1.0f, 2.0f, 3.0f);
		float expected = 3.0f;
		
		// 2. Act
		float actual = myCuboid.getDepth();
		
		// 3. Assert 
		assertEquals("Depth should equal 3.0f", expected, actual, 0);
	}
	
	@Test
	public void testCuboidInstantiation() throws IllegalArgumentException {
		// 1. Arrange
		Cuboid myCuboid = new Cuboid(1.0f, 2.0f, 3.0f);
		float expectedWidth = 1.0f;
		float expectedHeight = 2.0f;
		float expectedDepth = 3.0f;
		
		// 2. Act
		float actualWidth = myCuboid.getWidth();
		float actualHeight = myCuboid.getHeight();
		float actualDepth = myCuboid.getDepth();
		
		// 3. Assert 
		assertEquals("Width should equal 1.0f", expectedWidth, actualWidth, 0);
		assertEquals("Height should equal 2.0f", expectedHeight, actualHeight, 0);
		assertEquals("Depth should equal 3.0f", expectedDepth, actualDepth, 0);
	}
	
	@Test
	public void testCuboidSurfaceArea() throws IllegalArgumentException {
		// 1. Arrange
		Cuboid myCuboid = new Cuboid(1.0f, 2.0f, 3.0f);
		float expected = 22.0f;
		
		// 2. Act
		float actual = myCuboid.getSurfaceArea();
		
		// 3. Assert 
		assertEquals("Surface area should equal 22.0f", expected, actual, 0);
	}
	
	@Test
	public void testCuboidSurfaceArea2() throws IllegalArgumentException {
		// 1. Arrange
		Cuboid myCuboid = new Cuboid(2.0f, 4.0f, 6.0f);
		float expected = 88.0f;
		
		// 2. Act
		float actual = myCuboid.getSurfaceArea();
		
		// 3. Assert 
		assertEquals("Surface area should equal 88.0f", expected, actual, 0);
	}
	
	@Test
	public void testCuboidSurfaceArea3() throws IllegalArgumentException {
		// 1. Arrange
		Cuboid myCuboid = new Cuboid(100.0f, 200.0f, 300.0f);
		float expected = 220000.0f;
		
		// 2. Act
		float actual = myCuboid.getSurfaceArea();
		
		// 3. Assert 
		assertEquals("Surface area should equal 220000.0f", expected, actual, 0);
	}
	
	@Test
	public void testCuboidVolume() throws IllegalArgumentException {
		// 1. Arrange
		Cuboid myCuboid = new Cuboid(1.0f, 2.0f, 3.0f);
		float expected = 6.0f;
		
		// 2. Act
		float actual = myCuboid.getVolume();
		
		// 3. Assert 
		assertEquals("Volume should equal 6.0f", expected, actual, 0);
	}
	
	@Test
	public void testCuboidVolume2() throws IllegalArgumentException {
		// 1. Arrange
		Cuboid myCuboid = new Cuboid(2.0f, 4.0f, 6.0f);
		float expected = 48.0f;
		
		// 2. Act
		float actual = myCuboid.getVolume();
		
		// 3. Assert 
		assertEquals("Volume should equal 48.0f", expected, actual, 0);
	}
	
	@Test
	public void testCuboidVolume3() throws IllegalArgumentException {
		// 1. Arrange
		Cuboid myCuboid = new Cuboid(100.0f, 200.0f, 300.0f);
		float expected = 6000000.0f;
		
		// 2. Act
		float actual = myCuboid.getVolume();
		
		// 3. Assert 
		assertEquals("Volume should equal 600000.0f", expected, actual, 0);
	}
	
	//Error Handling
	
	@Test(expected = IllegalArgumentException.class)
	public void getDepthZeroValueThrowsException() throws IllegalArgumentException {
		Cuboid myCuboid = new Cuboid(1, 1, 0);
		myCuboid.getDepth();
	}	
	
	@Test(expected = IllegalArgumentException.class)
	public void getHeightZeroValueThrowsException() throws IllegalArgumentException {
		Cuboid myCuboid = new Cuboid(1, 0, 1);
		myCuboid.getHeight();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getWidthZeroValueThrowsException() throws IllegalArgumentException {
		Cuboid myCuboid = new Cuboid(0, 1, 1);
		myCuboid.getWidth();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getDepthNegativeValueThrowsException() throws IllegalArgumentException {
		Cuboid myCuboid = new Cuboid(1, 1, -1);
		myCuboid.getDepth();
	}	
	
	@Test(expected = IllegalArgumentException.class)
	public void getHeightNegativeValueThrowsException() throws IllegalArgumentException {
		Cuboid myCuboid = new Cuboid(1, -1, 1);
		myCuboid.getHeight();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getWidthNegativeValueThrowsException() throws IllegalArgumentException {
		Cuboid myCuboid = new Cuboid(-1, 1, 1);
		myCuboid.getWidth();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getSurfaceAreaZeroValueThrowsException() throws IllegalArgumentException {
		Cuboid myCuboid = new Cuboid(0, 0, 0);
		myCuboid.getSurfaceArea();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getSurfaceAreaNegativeValueThrowsException() throws IllegalArgumentException {
		Cuboid myCuboid = new Cuboid(-1, 1, 1);
		myCuboid.getSurfaceArea();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getVolumeZeroValueThrowsException() throws IllegalArgumentException {
		Cuboid myCuboid = new Cuboid(0, 0, 0);
		myCuboid.getVolume();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getVolumeNegativeValueThrowsException() throws IllegalArgumentException {
		Cuboid myCuboid = new Cuboid(-1, 1, 1);
		myCuboid.getVolume();
	}
	
}
