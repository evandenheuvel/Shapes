/**
 * 
 */
package edu.cvtc.models;

import javax.swing.JOptionPane;

/**
 * @author ericvandenheuvel
 *
 */
public class Sphere extends Shape {

	/**
	 * Section: Fields
	 */
	
	float radius; // initialize float value describing radius
	
	/**
	 * Section: Constructors
	 */
	
	// default constructor for a Sphere object
	public Sphere() {
		
		this.radius = 0; // assign default value of 0.0 to radius
		
	}
	
	// constructor with parameters for Sphere object
	public Sphere(float radius) {
		
		if (radius > 0) {
			
			this.radius = radius; // assign height of Sphere to passed in value for radius
		
		} else {
			
			throw new IllegalArgumentException("Can only accept non-zero, non-negative float values");
			
		}
	
	}

	/**
	 * Section: Methods
	 */

	/* (non-Javadoc)
	 * @see edu.cvtc.models.Shape#surfaceArea()
	 */
	@Override
	public float surfaceArea() {
		
		if (this.radius > 0) {
			// return the value of the formula for surface area of a sphere: 4*pi*r^2
			return (float) (4.0 * Math.PI * Math.pow(this.radius, 2));
		
		} else {
			
			throw new IllegalArgumentException("Can only accept non-zero, non-negative float values");
			
		}
		
	}

	/* (non-Javadoc)
	 * @see edu.cvtc.models.Shape#volume()
	 */
	@Override
	public float volume() {
		
		if (this.radius > 0) {
			// return the value of the formula for volume of a sphere: (4/3)*pi*r^3
			return (float) (Math.PI * Math.pow(this.radius, 3) * (4.0 / 3.0));
			
		} else {
			
			throw new IllegalArgumentException("Can only accept non-zero, non-negative float values");
			
		}
		
	}

	/* (non-Javadoc)
	 * @see edu.cvtc.models.Shape#render()
	 */
	@Override
	public void render() {
		
		// pop up a message box with all the dimensions and calculations for the cylinder
		JOptionPane.showMessageDialog(null, this.toString());

	}

	
	/**
	 * Section: Getters
	 */
	
	/**
	 * @return the radius
	 */
	public float getRadius() {
		return radius;
	}
	
	/**
	 * Section: Setters
	 */

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	/**
	 * Section: ToString
	 * 
	 * set the string value for the class
	 */

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Sphere [radius=" + this.radius + ", surfaceArea()=" + this.surfaceArea() + ", volume()=" + this.volume()
				+ "]";
	}
	
}
