/**
 * 
 */
package edu.cvtc.models;

import javax.swing.JOptionPane;

/**
 * @author ericvandenheuvel
 * @version 1.0.0
 * 2/3/19
 */
public class Cylinder extends Shape {

	/**
	 * Section: Fields
	 */
	
	float radius; // initialize float value describing radius
	float height; // initialize float value describing height
	
	/**
	 * Section: Constructors
	 */
	
	// default constructor for a Cylinder object
	public Cylinder() {
		
		this.radius = 0; // assign default value of 0.0 to radius
		this.height = 0; // assign default value of 0.0 to height
	}

	// constructor with parameters for Cylinder object
	public Cylinder(float radius, float height) {
		
		if (radius > 0 && height > 0) {
			
			this.radius = radius; // assign height of Cylinder to passed in value for radius
			this.height = height; // assign height of Cylinder to passed in value for height
		
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
		
		if (this.radius > 0 && this.height > 0) {
			// return the value of the formula for surface area of a cylinder: 2*pi*r*(r+h)
			return (float) (2.0 * Math.PI * this.radius * (this.radius + this.height));
		
		} else {
			
			throw new IllegalArgumentException("Can only accept non-zero, non-negative float values");
			
		}
		
	}

	/* (non-Javadoc)
	 * @see edu.cvtc.models.Shape#volume()
	 */
	@Override
	public float volume() {
		
		if (this.radius > 0 && this.height > 0) {
			// return the value of the formula for volume of a cylinder: pi*r^2*h
			return (float) (Math.PI * Math.pow(this.radius, 2) * this.height);
			
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
	 * @return the height
	 */
	public float getHeight() {
		return height;
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
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
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
		return "Cylinder [radius=" + this.radius + ", height=" + this.height + ", surfaceArea()=" + this.surfaceArea() + ", volume()="
				+ this.volume() + "]";
	}

}
