/**
 * 
 */
package edu.cvtc.controllers;

import javax.swing.JOptionPane;

import edu.cvtc.models.Cuboid;
import edu.cvtc.models.Cylinder;
import edu.cvtc.models.Sphere;

/**
 * @author ericvandenheuvel
 *
 */
public class ShapesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// initialize the shapes
		Cuboid cuboid;
		Cylinder cylinder;
		Sphere sphere;
		
		// initialize variables that will be assigned by user input then passed into the constructors.
		float width;
		float height;
		float depth;
		float radius;
		
		// First, get the dimensions for a Cuboid
		
		// get the width for a Cuboid from the user
		width = promptUser("Cuboid", "width");
		// get the height for a Cuboid from the user
		height = promptUser("Cuboid", "height");
		// get the depth for a Cuboid from the user
		depth = promptUser("Cuboid", "depth");
		
		// instantiate a new cuboid object using the data from the user
		cuboid = new Cuboid(width, height, depth);
		
		// Second, get the dimensions for a Cylinder
		
		// get the width for a Cylinder from the user
		radius = promptUser("Cylinder", "radius");
		// get the height for a Cylinder from the user
		// we can reset height because the cuboid no longer needs to know it at this level
		height = promptUser("Cylinder", "height");
		
		// instantiate a new Cylinder object using the data from the user
		cylinder = new Cylinder(radius, height);
		
		// Third, get the dimensions for a Sphere
		// get the width for a Sphere from the user
		// we can reset radius because the cylinder no longer needs to know it at this level
		radius = promptUser("Sphere", "radius");
		
		// instantiate a new Cylinder object using the data from the user
		sphere = new Sphere(radius);
		
		// run each object's render methods to show the user their shapes' statistics
		cuboid.render();
		cylinder.render();
		sphere.render();

	}
	
	// method to prompt the user for data taking in the shape we are creating and the dimension we are getting
	private static float promptUser(String shape, String dimentionToGet) {
		
		// initialize a variable to hold the text for the dialog box
		String prompt;
		// initialize a variable to hold the text to guide the user
		String usePositiveNumber;
		// initialize a variable to hold the input given by the user
		String input;
		// create a flag to signal valid data
		boolean dataIsNotValid;
		
		// assign the text that will be used in multiple dialog boxes
		prompt = "Create a " + shape + "!\nPlease enter the ";
		usePositiveNumber = "*Please enter a valid number greater than 0*";
		
		// get a value from the user
		input = JOptionPane.showInputDialog(prompt + dimentionToGet);
		
		// set flag to true
		dataIsNotValid = true;
		
		// check that the value contains data, that it is a number, and that it is greater than 0.
		while (dataIsNotValid) {
			try {
				// try to check for valid data, and prompt the user for valid data if it is not already
				if (Float.valueOf(input).isNaN() || Float.valueOf(input) <= 0) {
					input = JOptionPane.showInputDialog(prompt + dimentionToGet + "\n" + usePositiveNumber);
				} else {
					// the data is valid, so the input can be used as a float value. 
					// flip the flag to exit the loop.
					dataIsNotValid = false;
				}
			} catch(NumberFormatException e) {
				// continue to prompt for new data until valid data is given
				input = JOptionPane.showInputDialog(prompt + dimentionToGet + "\n" + usePositiveNumber);
			}
			
		}
		
		// now that we know the data is good, assign it to the correct value.
		return Float.valueOf(input);
	}

}
