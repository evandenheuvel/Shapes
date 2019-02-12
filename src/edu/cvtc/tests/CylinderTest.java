/**
 * 
 */
package edu.cvtc.tests;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.jupiter.api.BeforeEach;

import edu.cvtc.models.Cylinder;

/**
 * @author ericvandenheuvel
 *
 */
public class CylinderTest {
	
	Cylinder _cylinder = new Cylinder(1.0f, 1.0f);
	Cylinder _cylinderZeros = new Cylinder();
	Cylinder _cylinderNegatives = new Cylinder();
	
	float expectedValue;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		_cylinderNegatives.setHeight(-1.0f);
		_cylinderNegatives.setRadius(-1.0f);
		
	}

	/**
	 * Test method for {@link edu.cvtc.models.Cylinder#surfaceArea()}.
	 */
	@Test
	public void testSurfaceArea() {
		expectedValue = 2 * (float)Math.PI * 1.0f * (1.0f + 1.0f);
		assertEquals(expectedValue, _cylinder.surfaceArea(), 0.001);
	}
	
	/**
	 * Test method for {@link edu.cvtc.models.Cylinder#surfaceArea()}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceAreaZeroValues() {
		_cylinderZeros.surfaceArea();
	}
	
	/**
	 * Test method for {@link edu.cvtc.models.Cylinder#surfaceArea()}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceAreaNegativeValues() {
		_cylinderNegatives.surfaceArea();
	}

	/**
	 * Test method for {@link edu.cvtc.models.Cylinder#volume()}.
	 */
	@Test
	public void testVolume() {
		expectedValue = (float) (Math.PI * Math.pow(1.0f, 2) * 1.0f);
		assertEquals(expectedValue, _cylinder.volume(), 0.001);
	}
	
	/**
	 * Test method for {@link edu.cvtc.models.Cylinder#volume()}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testVolumeZeroValues() {
		_cylinderZeros.volume();
	}
	
	/**
	 * Test method for {@link edu.cvtc.models.Cylinder#volume()}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testVolumeNegativeValues() {
		_cylinderNegatives.volume();
	}

	/**
	 * Test method for {@link edu.cvtc.models.Cylinder#Cylinder(float, float)}.
	 */
	@Test
	public void testCylinderFloatFloat() {
		assertNotNull(new Cylinder(1.0f, 1.0f));
	}
	
	/**
	 * Test method for {@link edu.cvtc.models.Cylinder#Cylinder(float, float)}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCylinderConstructorNegativeValues() {
		new Cylinder(-1.0f, 1.0f);
	}

	/**
	 * Test method for {@link edu.cvtc.models.Cylinder#getRadius()}.
	 */
	@Test
	public void testGetRadius() {
		assertEquals(1.0f, _cylinder.getRadius(), 0.0);
	}

	/**
	 * Test method for {@link edu.cvtc.models.Cylinder#getHeight()}.
	 */
	@Test
	public void testGetHeight() {
		assertEquals(1.0f, _cylinder.getHeight(), 0.0);
	}

}
