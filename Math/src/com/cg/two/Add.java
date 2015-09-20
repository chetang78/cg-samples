/**
 * 
 */
package com.cg.two;

/**
 * @author chetan
 *
 */
public class Add {
	public int add (int val1, int val2) {
		
		System.out.println("Math -> Release 6");
		if (val1 >100) {
			throw new RuntimeException("Invalid Percentage being added");
		}
		return val1 + val2;
	}
}
