/**
 * 
 */
package edu.cvtc.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.cvtc.models.Sphere;

/**
 * @author ericvandenheuvel
 *
 */
public class SphereTest {

	Sphere _sphere = new Sphere(1.0f);
	Sphere _sphereZeros = new Sphere();
	Sphere _sphereNegatives = new Sphere();
	
	float expectedValue;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		_sphereNegatives.setRadius(-1.0f);
		
	}

	/**
	 * Test method for {@link edu.cvtc.models.Sphere#surfaceArea()}.
	 */
	@Test
	public void testSurfaceArea() {
		expectedValue = (float) (4.0f * Math.PI * Math.pow(1.0f, 2));
		assertEquals(expectedValue, _sphere.surfaceArea(), 0.001);	
	}
	
	/**
	 * Test method for {@link edu.cvtc.models.Sphere#surfaceArea()}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceAreaZeroValues() {
		_sphereZeros.surfaceArea();
	}
	
	/**
	 * Test method for {@link edu.cvtc.models.Sphere#surfaceArea()}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceAreaNegativeValues() {
		_sphereNegatives.surfaceArea();
	}

	/**
	 * Test method for {@link edu.cvtc.models.Sphere#volume()}.
	 */
	@Test
	public void testVolume() {
		expectedValue = (float) (Math.PI * Math.pow(1.0f, 3) * (4.0f / 3.0f));
		assertEquals(expectedValue, _sphere.volume(), 0.001);
	}
	
	/**
	 * Test method for {@link edu.cvtc.models.Sphere#volume()}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testVolumeZeroValues() {
		_sphereZeros.volume();	
	}
	
	/**
	 * Test method for {@link edu.cvtc.models.Sphere#volume()}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testVolumeNegativeValues() {
		_sphereNegatives.volume();	
	}

	/**
	 * Test method for {@link edu.cvtc.models.Sphere#Sphere(float)}.
	 */
	@Test
	public void testSphereFloat() {
		assertNotNull(new Sphere(1.0f));
	}
	
	/**
	 * Test method for {@link edu.cvtc.models.Sphere#Sphere(float)}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSphereConstructorNegativeValues() {
		new Sphere(-1.0f);
	}

	/**
	 * Test method for {@link edu.cvtc.models.Sphere#getRadius()}.
	 */
	@Test
	public void testGetRadius() {
		assertEquals(1.0f, _sphere.getRadius(), 0.0);
	}

}
