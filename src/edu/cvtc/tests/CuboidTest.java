/**
 * 
 */
package edu.cvtc.tests;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.jupiter.api.BeforeEach;

import edu.cvtc.models.Cuboid;

/**
 * @author ericvandenheuvel
 *
 */
public class CuboidTest {

	Cuboid _cuboid = new Cuboid(1.0f, 1.0f, 1.0f);
	Cuboid _cuboidZeros = new Cuboid();
	Cuboid _cuboidNegatives = new Cuboid();
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception  {
		_cuboidNegatives.setHeight(-1.0f);
		_cuboidNegatives.setWidth(-1.0f);
		_cuboidNegatives.setDepth(-1.0f);
	}
	
	/**
	 * Test method for {@link edu.cvtc.models.Cuboid#surfaceArea()}.
	 */
	@Test
	public void testSurfaceArea() {
		assertEquals("Failed to correctly calculate surface area", 6.0f, _cuboid.surfaceArea(), 0.0);
	}
	
	/**
	 * Test method for {@link edu.cvtc.models.Cuboid#surfaceArea()}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceAreaZeroValues() {
		_cuboidZeros.surfaceArea();
	}
	
	/**
	 * Test method for {@link edu.cvtc.models.Cuboid#surfaceArea()}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceAreaNegativeValues() {
		_cuboidNegatives.surfaceArea();
	}

	/**
	 * Test method for {@link edu.cvtc.models.Cuboid#volume()}.
	 */
	@Test
	public void testVolume() {
		assertEquals(1.0f, _cuboid.volume(), 0.0);
	}
	
	/**
	 * Test method for {@link edu.cvtc.models.Cuboid#volume()}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testVolumeZeroValues() {
		_cuboidZeros.volume();
	}
	
	/**
	 * Test method for {@link edu.cvtc.models.Cuboid#volume()}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testVolumeNegativeValues() {
		_cuboidNegatives.volume();
	}

	/**
	 * Test method for {@link edu.cvtc.models.Cuboid#Cuboid(float, float, float)}.
	 */
	@Test
	public void testCuboidFloatFloatFloat() {
		assertNotNull(new Cuboid(1.0f, 1.0f, 1.0f));
	}
	
	/**
	 * Test method for {@link edu.cvtc.models.Cuboid#Cuboid(float, float, float)}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCuboidConstructorNegativeValues() {
		new Cuboid(-1.0f, 1.0f, 1.0f);
	}

	/**
	 * Test method for {@link edu.cvtc.models.Cuboid#getWidth()}.
	 */
	@Test
	public void testGetWidth() {
		assertEquals(1.0f, _cuboid.getWidth(), 0.0);
	}

	/**
	 * Test method for {@link edu.cvtc.models.Cuboid#getHeight()}.
	 */
	@Test
	public void testGetHeight() {
		assertEquals(1.0f, _cuboid.getHeight(), 0.0);
	}

	/**
	 * Test method for {@link edu.cvtc.models.Cuboid#getDepth()}.
	 */
	@Test
	public void testGetDepth() {
		assertEquals(1.0f, _cuboid.getDepth(), 0.0);
	}

}
