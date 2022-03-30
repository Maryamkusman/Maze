///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment7.java
// File:               InvalidSymbolExceltion.java
// Quarter:            (cse8b) Fall 2021
//
// Author:             Maryam usman musman@ucsd.edu
// Instructor's Name:  Ben Ochoa
//

/**
 * This class calls a symbol 
 *
 * Bugs: unknown
 *
 * @author Maryam Usman
 */
public class InvalidSymbolException extends Exception {
    private static final String EXCEPT_MSG = "Symbol \"%s\" is invalid! " + 
    "Must be \"X\", \"*\", or \"-\"";
    /**
   	 * called a except msg from super class and formats it 
   	 *
   	 * @param String caleed symbol
   	 */
    public InvalidSymbolException(String symbol) {
        
        //String.format("X", EXCEPT_MSG);
    	  super(String.format(EXCEPT_MSG, symbol));
        
      
        //String.format("*", EXCEPT_MSG);
        //String.format("-", EXCEPT_MSG);
    }
}
