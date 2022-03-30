///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              Assignment7
// Files:              input1, input2, InvalidSymbolException.java, MazeElement.java, UnsolvableMazeException.java, MazeSolver.java
// Quarter:            (CSE8b) Fall 2021
//
// Author:             Maryam Usman
// Email:              musman@ucsd.edu
// Instructor's Name:  Ben Ochoa
//

/**
 * this class runs unit tests on the methods
 *
 * Bugs: unknown
 *
 * @author Maryam Usman
 */
public class Assignment7 {

	/**
	 * Test implementation of {@code mazeMatch}. using assert to raise exception if
	 * the functionality of incorrect.
	 */
	public static void testMazeMatch() {
		// We must try-catch InvalidSymbolException since it is checked exception
		try {
			MazeElement[][] maze1 = { { new MazeElement("X"), new MazeElement("X") },
					{ new MazeElement("-"), new MazeElement("*") } };
			MazeElement[][] maze2 = { { new MazeElement("X"), new MazeElement("X") },
					{ new MazeElement("-"), new MazeElement("*") } };
			MazeElement[][] maze3 = { { new MazeElement("X"), new MazeElement("*") },
					{ new MazeElement("-"), new MazeElement("*") } };

			// Use assert to check our implementation correctness
			assert MazeSolver.mazeMatch(maze1, maze2) : "maze1 and maze2 should match";
			assert !MazeSolver.mazeMatch(maze1, maze3) : "maze1 and maze3 should NOT match";
		}

		// Since there is no invalid symbol, this should not be executed
		catch (InvalidSymbolException e) {
			assert false : "Test case is designed so that this will not run";
		}
	}

	public static void testMazeMatch2() {
		// We must try-catch InvalidSymbolException since it is checked exception
		try {
			MazeElement[][] maze1 = { { new MazeElement("X"), new MazeElement("X") },
					{ new MazeElement("-"), new MazeElement("*") } };
			MazeElement[][] maze2 = { { new MazeElement("X"), new MazeElement("X") },
					{ new MazeElement("-"), new MazeElement("*") } };
			MazeElement[][] maze3 = { { new MazeElement("X"), new MazeElement("*") },
					{ new MazeElement("-"), new MazeElement("*") } };
			MazeElement[][] maze4 = { { new MazeElement("X"), new MazeElement("*") },
					{ new MazeElement("-"), new MazeElement("*") } };
			MazeElement[][] maze5 = { { new MazeElement("X"), new MazeElement("*") },
					{ new MazeElement("-"), new MazeElement("*") } };

			// Use assert to check our implementation correctness
			assert MazeSolver.mazeMatch(maze1, maze2) : "maze1 and maze2 should match";
			assert !MazeSolver.mazeMatch(maze1, maze3) : "maze1 and maze3 should NOT match";
			assert !MazeSolver.mazeMatch(maze1, maze5) : "maze1 and maze3 should NOT match";
			assert MazeSolver.mazeMatch(maze4, maze5) : "maze1 and maze2 should match";

		}

		// Since there is no invalid symbol, this should not be executed
		catch (InvalidSymbolException e) {
			assert false : "Test case is designed so that this will not run";
		}
	}

	public static void testMazeSolver3() {
		// We must try-catch InvalidSymbolException since it is checked exception
		MazeSolver fileToRead = new MazeSolver("input1");

		try {
			fileToRead.solveMaze();
			// Use assert to check our implementation correctness
			assert false : "unreachable";
		}
		// Since there is no invalid symbol, this should not be executed
		catch (UnsolvableMazeException e) {
			System.out.println(e.getMessage());
			System.out.println("Successfully caught unsolvable maze exception");

		}
	}
	
	
	public static void testMazeSolver2() {
		MazeSolver mazeSolver = new MazeSolver("input2");
		mazeSolver.solveMaze();
		// We must try-catch InvalidSymbolException since it is checked exception
		try {
			MazeElement[][] expected = { { new MazeElement("-"), new MazeElement("-"), new MazeElement("X"), new MazeElement("X") },
					{ new MazeElement("X"), new MazeElement("*"), new MazeElement("X"),new MazeElement("X") },
					{ new MazeElement("X"), new MazeElement("*"), new MazeElement("X"),new MazeElement("X") } };

			// Use assert to check our implementation correctness
			assert MazeSolver.mazeMatch(expected, mazeSolver.getMaze());
		}
		// Since there is no invalid symbol, this should not be executed
		catch (InvalidSymbolException e) {
			assert false : "Test case is designed so that this will not run";
		}
	}
		

	public static void test() {
		// We must try-catch InvalidSymbolException since it is checked exception
		try {
			MazeElement[][] maze1 = { { new MazeElement("X"), new MazeElement("X") },
					{ new MazeElement("-"), new MazeElement("*") } };
			MazeElement[][] maze2 = { { new MazeElement("X"), new MazeElement("X") },
					{ new MazeElement("-"), new MazeElement("*") } };
			MazeElement[][] maze3 = { { new MazeElement("X"), new MazeElement("*") },
					{ new MazeElement("-"), new MazeElement("*") } };

			// Use assert to check our implementation correctness
			assert MazeSolver.mazeMatch(maze1, maze2) : "maze1 and maze2 should match";
			assert !MazeSolver.mazeMatch(maze1, maze3) : "maze1 and maze3 should NOT match";
		}

		// Since there is no invalid symbol, this should not be executed
		catch (InvalidSymbolException e) {
			assert false : "Test case is designed so that this will not run";
		}
	}

	public static void test2() {
		// We must try-catch InvalidSymbolException since it is checked exception
		try {
			MazeElement[][] maze1 = { { new MazeElement("X"), new MazeElement("X") },
					{ new MazeElement("-"), new MazeElement("*") } };
			MazeElement[][] maze2 = { { new MazeElement("X"), new MazeElement("X") },
					{ new MazeElement("-"), new MazeElement("*") } };
			MazeElement[][] maze3 = { { new MazeElement("X"), new MazeElement("*") },
					{ new MazeElement("-"), new MazeElement("*") } };
			MazeElement[][] maze4 = { { new MazeElement("X"), new MazeElement("*") },
					{ new MazeElement("-"), new MazeElement("*") } };

			// Use assert to check our implementation correctness
			assert MazeSolver.mazeMatch(maze1, maze2) : "maze1 and maze2 should match";
			assert !MazeSolver.mazeMatch(maze1, maze3) : "maze1 and maze3 should NOT match";
			assert MazeSolver.mazeMatch(maze3, maze4) : "maze3 and maze4 should match";

		}

		// Since there is no invalid symbol, this should not be executed
		catch (InvalidSymbolException e) {
			assert false : "Test case is designed so that this will not run";
		}
	}

	/**
	 * Test the implementation of {@code MazeSolver} constructor and
	 * {@code writeMaze}. Create a 2D MazeElement object representing the expected
	 * maze after solving. Then compare the solved maze with the expected maze.
	 */
	public static void testReadWriteInput1() {
		MazeSolver mazeSolver = new MazeSolver("input1");
		mazeSolver.solveMaze();
		// We must try-catch InvalidSymbolException since it is checked exception
		try {
			MazeElement[][] expected = { { new MazeElement("*"), new MazeElement("*"), new MazeElement("X") },
					{ new MazeElement("X"), new MazeElement("*"), new MazeElement("*") },
					{ new MazeElement("X"), new MazeElement("X"), new MazeElement("*") } };

			// Use assert to check our implementation correctness
			assert MazeSolver.mazeMatch(expected, mazeSolver.getMaze());
		}
		// Since there is no invalid symbol, this should not be executed
		catch (InvalidSymbolException e) {
			assert false : "Test case is designed so that this will not run";
		}

		// Write the maze into output1. You can then eyeball the correctness of
		// the file content.
		mazeSolver.writeMaze("output1");
	}

	public static void testReadWriteInput4() {
		// We must try-catch InvalidSymbolException since it is checked exception
		try {
			MazeElement maze = new MazeElement("X");
			assert false : "This line not reached";
		}
		// Since there is no invalid symbol, this should not be executed
		catch (InvalidSymbolException e) {
			System.out.println("Successfully caught InvalidSymbolException");
			System.out.println(e.getMessage());
		}
	}

	public static void testReadWriteInput5() {
		// We must try-catch InvalidSymbolException since it is checked exception
		try {
			MazeElement maze = new MazeElement("*");
			assert false : "This line not reached";
		}
		// Since there is no invalid symbol, this should not be executed
		catch (InvalidSymbolException e) {
			System.out.println("Successfully caught InvalidSymbolException");
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Test the implementation of {@code MazeSolver} constructor and
	 * {@code writeMaze}. This time we want to solve an unsolvable maze.
	 */
	public static void testReadWriteInput2() {
		MazeSolver mazeSolver = new MazeSolver("input2");

		try {
			mazeSolver.solveMaze();
			// This about why the following line should not be reached
			assert false : "This line should not be reached";
		} catch (UnsolvableMazeException e) {
			System.out.println("Successfully caught UnsolvableMazeException");
			System.out.println(e.getMessage());
		}
	}
	

	public static void unitTests() {
		testMazeMatch();
		testReadWriteInput1();
		testReadWriteInput2();
		testMazeSolver2();
		test2();
		testMazeMatch2();
		testReadWriteInput4();
		testReadWriteInput5();
		testMazeSolver3();

	}

	public static void main(String[] args) {
		unitTests();

	}
}
