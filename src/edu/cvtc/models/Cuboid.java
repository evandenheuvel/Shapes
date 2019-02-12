/**
 * 
 */
package edu.cvtc.models;

import javax.swing.JOptionPane;

/**
 * @author ericvandenheuvel
 *
 */
public class Cuboid extends Shape {

	/**
	 * Section: Fields
	 */
	
	float width; // initialize float value describing width
	float height; // initialize float value describing height
	float depth; // initialize float value describing depth
	
	/**
	 * Section: Constructors
	 */
	
	// default constructor for a Cuboid object
	public Cuboid() {
		
		this.width = (float) 0.0; // assign default value of 0.0 to width
		this.height = (float) 0.0; // assign default value of 0.0 to height
		this.depth = (float) 0.0; // assign default value of 0.0 to depth
		
	}
	
	// constructor with parameters for Cuboid object
	public Cuboid(float width, float height, float depth) {
		
		if (width > 0 && height > 0 && depth > 0) {
			
			this.width = width; // assign width of Cuboid to passed in value for width
			this.height = height; // assign height of Cuboid to passed in value for height
			this.depth = depth; // assign depth of Cuboid to passed in value for depth
			
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
		
		if (this.width > 0 && this.height > 0 && this.depth > 0) {
			// return the value of the formula for surface area of a cuboid: (2*w*h)+(2*w*d)+(2*h*d)
			return (2 * this.width * this.height) + (2 * this.width * this.depth) + (2 * this.height * this.depth);
		
		} else {
			
			throw new IllegalArgumentException("Can only accept non-zero, non-negative float values");
			
		}
		
	}

	/* (non-Javadoc)
	 * @see edu.cvtc.models.Shape#volume()
	 */
	@Override
	public float volume() {
		
		if (this.width > 0 && this.height > 0 && this.depth > 0) {
			// return the value of the formula for volume of a cuboid: w*h*d
			return this.width * this.height * this.depth;
	
		} else {
		
			throw new IllegalArgumentException("Can only accept non-zero, non-negative float values");
		
		}
	}

	/* (non-Javadoc)
	 * @see edu.cvtc.models.Shape#render()
	 */
	@Override
	public void render() {
		
		// pop up a message box with all the dimensions and calculations for the cuboid
		JOptionPane.showMessageDialog(null, this.toString());

	}
	
	/**
	 * Section: Getters
	 */

	/**
	 * @return the width
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * @return the depth
	 */
	public float getDepth() {
		return depth;
	}
	
	/**
	 * Section: Setters
	 */

	/**
	 * @param width the width to set
	 */
	public void setWidth(float width) {
		this.width = width;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * @param depth the depth to set
	 */
	public void setDepth(float depth) {
		this.depth = depth;
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
		return "Cuboid [width=" + this.width + ", height=" + this.height + ", depth=" + this.depth + ", surfaceArea()=" + this.surfaceArea()
				+ ", volume()=" + this.volume() + "]";
	}
	
	

}
