///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Assignment7.java
// File:               MazeElement.java
// Quarter:            (cse8b) Fall 2021
//
// Author:             Maryam usman musman@ucsd.edu
// Instructor's Name:  Ben Ochoa
//

/**
 * this class checks is the symbol is correct as well as gets symbol and uses the methods that determine if its a wall an empty space etc.
 *
 * Bugs: unknown
 *
 * @author Maryam Usman
 */
public class MazeElement {

	private String symbol; // Internal representation of a symbol in the maze

	// Constants that are used to compare symbols.
	public static final String WALL = "X";
	public static final String EMPTY = "-";
	public static final String PATH = "*";
	 /**
		 * this checks if the symbol is one of the above symbols if not it throws an exception
		 *
		 * @param a string called symbol
		 */
	public MazeElement(String symbol) throws InvalidSymbolException {
		if (symbol.equals(WALL) || symbol.equals(EMPTY) || symbol.equals(PATH)) {
			this.symbol = symbol;
			return;
		}

		throw new InvalidSymbolException(symbol);

	}

	/**
	 * return the internal representation of symbol.
	 *
	 * Precondition: this object has been created and this.symbol has some value
	 *
	 * Takes no parameters.
	 *
	 * @return A String value represents the current symbol
	 */
	public String getSymbol() {
		return this.symbol;
	}

	/**
	 * Checks if this point is a wall or not.
	 *
	 * Precondition: this object has been created and this.symbol has some value
	 *
	 * Takes no parameters.
	 *
	 * @return A boolean value that is true if this symbol is "X", otherwise false.
	 */
	public boolean isWall() {
		return this.symbol.equals(WALL);
	}

	/**
	 * Checks if this point is empty or not.
	 *
	 * Precondition: this object has been created and this.symbol has some value
	 *
	 * Takes no parameters.
	 *
	 * @return A boolean value that is true if this symbol is "-", otherwise false.
	 */
	public boolean isEmpty() {
		return this.symbol.equals(EMPTY);
	}

	/**
	 * Checks if this point is in the escape path or not.
	 *
	 * Precondition: this object has been created and this.symbol has some value
	 *
	 * Takes no parameters.
	 *
	 * @return A boolean value that is true if this symbol is "*", otherwise false.
	 */
	public boolean isPath() {
		return this.symbol.equals(PATH);
	}

	/**
	 * Sets this point to "*", indicating that it is in the escape path.
	 *
	 * Takes no parameters and returns nothing.
	 */
	public void setToPath() {
		this.symbol = PATH;
	}

	/**
	 * Sets this point to "-", indicating that it is empty.
	 *
	 * Takes no parameters and returns nothing.
	 */
	public void setToEmpty() {
		this.symbol = EMPTY;
	}

	/**
	 * Sets this point to "X", indicating that it is a wall.
	 *
	 * Takes no parameters and returns nothing.
	 */
	public void setToWall() {
		this.symbol = WALL;
	}
}