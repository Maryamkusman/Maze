///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment7.java
// File:               UnsolvableMazeException.java
// Quarter:            (cse8b) Fall 2021
//
// Author:             Maryam usman musman@ucsd.edu
// Instructor's Name:  Ben Ochoa
//

/**
 * this class calls the except msg from super class
 *
 * Bugs: unknown
 *
 * @author Maryam Usman
 */
public class UnsolvableMazeException extends RuntimeException {
    private static final String EXCEPT_MSG = "Maze is unsolvable!";
    /**
	 * called a string msg from super class 
	 *
	 * @param 
	 */
    public UnsolvableMazeException() {
        super(EXCEPT_MSG);
    }
}
