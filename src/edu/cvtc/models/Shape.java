/**
 * 
 */
package edu.cvtc.models;

/**
 * @author ericvandenheuvel
 *
 */
public abstract class Shape {
	
	// abstract method to find the surface area of the shape
	abstract float surfaceArea();
	
	// abstract method to find the volume of the shape
	abstract float volume();
	
	// abstract method to display a message box with shape dimensions and calculations
	abstract void render();

}
