package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Sphere;
import org.junit.Test;

public class SphereUnitTests {

	@Test
	public void testSphereRadius() {
		// 1. Arrange
		Sphere mySphere = new Sphere (1.0f);
		float expected = 1.0f;
		
		// 2. Act
		float actual = mySphere.getRadius();
		
		// 3. Assert 
		assertEquals("Radius should equal 1.0f", expected, actual, 0);
	}
	
	@Test
	public void testSphereInstantiation() {
		// 1. Arrange
		Sphere mySphere = new Sphere (100.2f);
		float expectedRadius = 100.2f;
		
		// 2. Act
		float actualRadius = mySphere.getRadius();
		
		// 3. Assert 
		assertEquals("Radius should equal 100.2f", expectedRadius, actualRadius, 0);
	}
	
	@Test
	public void testSphereSurfaceArea() {
		// 1. Arrange
		Sphere mySphere = new Sphere (1.0f);
		float expected = 12.566371f;
		
		// 2. Act
		float actual = mySphere.getSurfaceArea();
		
		// 3. Assert 
		assertEquals("Surface area should equal 12.566371f", expected, actual, 0);
	}
	
	@Test
	public void testSphereSurfaceArea2() {
		// 1. Arrange
		Sphere mySphere = new Sphere (100.2f);
		float expected = 126166.86f;
		
		// 2. Act
		float actual = mySphere.getSurfaceArea();
		
		// 3. Assert 
		assertEquals("Surface area should equal 126166.86f", expected, actual, 0);
	}
	
	@Test
	public void testSphereSurfaceArea3() {
		// 1. Arrange
		Sphere mySphere = new Sphere (47.7f);
		float expected = 28592.139f;
		
		// 2. Act
		float actual = mySphere.getSurfaceArea();
		
		// 3. Assert 
		assertEquals("Surface area should equal 28592.139f", expected, actual, 0);
	}
	
	@Test
	public void testSphereVolume() {
		// 1. Arrange
		Sphere mySphere = new Sphere (1.0f);
		float expected = 4.1887903f;
		
		// 2. Act
		float actual = mySphere.getVolume();
		
		// 3. Assert 
		assertEquals("Volume should equal 4.1887903f", expected, actual, 0);
	}
	
	@Test
	public void testSphereVolume2() {
		// 1. Arrange
		Sphere mySphere = new Sphere (100.2f);
		float expected = 4213973f;
		
		// 2. Act
		float actual = mySphere.getVolume();
		
		// 3. Assert 
		assertEquals("Volume should equal 4213973f", expected, actual, 0);
	}
	
	@Test
	public void testSphereVolume3() {
		// 1. Arrange
		Sphere mySphere = new Sphere (47.7f);
		float expected = 454615f;
		
		// 2. Act
		float actual = mySphere.getVolume();
		
		// 3. Assert 
		assertEquals("Volume should equal 454615f", expected, actual, 0);
	}
	
	//Error Handling
	
			@Test(expected = IllegalArgumentException.class)
			public void getRadiusZeroValueThrowsException() throws IllegalArgumentException {
				Sphere mySphere = new Sphere(0);
				mySphere.getRadius();
			}
			
			@Test(expected = IllegalArgumentException.class)
			public void getRadiusNegativeValueThrowsException() throws IllegalArgumentException {
				Sphere mySphere = new Sphere(-1);
				mySphere.getRadius();
			}
			
			@Test(expected = IllegalArgumentException.class)
			public void getSurfaceAreaZeroValueThrowsException() throws IllegalArgumentException {
				Sphere mySphere = new Sphere(0);
				mySphere.getSurfaceArea();
			}
			
			@Test(expected = IllegalArgumentException.class)
			public void getSurfaceAreaNegativeValueThrowsException() throws IllegalArgumentException {
				Sphere mySphere = new Sphere(-1);
				mySphere.getSurfaceArea();
			}
			
			@Test(expected = IllegalArgumentException.class)
			public void getVolumeZeroValueThrowsException() throws IllegalArgumentException {
				Sphere mySphere = new Sphere(0);
				mySphere.getVolume();
			}
			
			@Test(expected = IllegalArgumentException.class)
			public void getVolumeNegativeValueThrowsException() throws IllegalArgumentException {
				Sphere mySphere = new Sphere(-1);
				mySphere.getVolume();
			}

}
