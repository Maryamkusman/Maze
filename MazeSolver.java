import java.io.*;
import java.util.*;

///////////////////////////////////////////////////////////////////////////////
//ALL STUDENTS COMPLETE THESE SECTIONS
//Main Class File:    Assignment7.java
//File:               MazeSolver.java
//Quarter:            (cse8b) Fall 2021
//
//Author:             Maryam usman musman@ucsd.edu
//Instructor's Name:  Ben Ochoa
//

/**
* This class executes several methods that determine the solvability of the maze 
*
* Bugs: unknown
*
* @author Maryam Usman
*/
public class MazeSolver {
	private MazeElement[][] maze;

	/**
	 * Public getter that retrieves private member variables - maze. DO NOT CHANGE.
	 *
	 * @return return the member variable - maze.
	 */
	public MazeElement[][] getMaze() {
		return this.maze;
	}

	/**
	 * Public setter that overrides private member variables - maze. DO NOT CHANGE.
	 *
	 * @param maze Maze to be stored.
	 */
	public void setMaze(MazeElement[][] maze) {
		this.maze = maze;
	}

	/**
	 * Public no-arg constructor. DO NOT CHANGE.
	 */
	public MazeSolver() {
	}

	/**
	 * This constructor will read the maze file and parse the maze to a 2D array of
	 * MazeElement objects.
	 *
	 * @param a string called fileToRead
	 */
	public MazeSolver(String fileToRead) {
		java.io.File file = new java.io.File(fileToRead);
		try (Scanner scanner = new Scanner(file);) {
			while (scanner.hasNext()) {
				int nrow = scanner.nextInt();
				int ncolumn = scanner.nextInt();

				maze = new MazeElement[nrow][ncolumn];
				for (int x = 0; x < maze.length; x++) {
					for (int y = 0; y < maze[x].length; y++) {
						String character = scanner.next();
						maze[x][y] = new MazeElement(character);

					}

					scanner.nextLine();
				}

			}
			scanner.close();

		} catch (FileNotFoundException | InvalidSymbolException e) {
			System.out.println(e.getMessage());
		}
	}

	/*
	 * try { BufferedReader reader=new BufferedReader(new FileReader(fileToRead));
	 * System.out.println(reader.readLine()); reader.close(); } catch (IOException
	 * e){ e.printStackTrace();
	 * 
	 * }
	 */
	// Scanner input = new Scanner(System.in);
	// Scanner input = new Scanner(new File(filename));
	// java.io.File file = new java.io.File("image/us.gif");
	// Scanner input = new Scanner(System.in);
	// Scanner input = new Scanner(new File(fileToRead));
	/**
	 * MazeSolver object with the above constructor, a maze is loaded and stored in
	 * the member variable maze. The starting position (i.e., entrance) of all input
	 * mazes is at the top left corner of the maze. found a path through the maze to
	 * the ending position (i.e., exit), which will always be at the bottom right
	 * corner of the maze.
	 *
	 * @param
	 */
	public void solveMaze() {
		int i = 0;
		int j = 0;
		int nRow = this.maze.length;
		int nCol = this.maze[0].length;
		if (maze[0][0].isWall()) {
			throw new UnsolvableMazeException();
		}
		while (i + 1 < nRow || j + 1 < nCol) {
			maze[i][j].setToPath();
			if (i+1<maze.length && maze[i + 1][j].isEmpty()) {
				i++;
				maze[i][j].setToPath();
			} else if (j+1<maze[i].length && maze[i][j + 1].isEmpty()) {
				j++;
				maze[i][j].setToPath();
			} else {
				throw new UnsolvableMazeException();
			}
		}
		maze[nRow - 1][nCol - 1].setToPath();
	}

	/**
	 * This method writes the member variable maze to a file. The fileToWrite is the
	 * name of the file that the maze is written in.
	 *
	 * @param a string value called fileToWrite
	 */
	public void writeMaze(String fileToWrite) {
		java.io.File file = new java.io.File(fileToWrite);
		// PrintWriter writer = new PrintWriter(fileToWrite);
		// writer.write("Javatpoint provides tutorials of all technology.");
		try

		(java.io.PrintWriter output = new java.io.PrintWriter(file);) {
			output.println(maze.length + " " + maze[0].length);
			for (int i = 0; i < maze.length; i++) {
				for (int j = 0; j < maze[0].length; j++) {
					if (j != maze[0].length - 1) {
						output.print(maze[i][j].getSymbol() + " ");
					} else {
						output.println(maze[i][j].getSymbol());
					}

				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		}
	}

	/**
	 * This method takes in two 2D arrays of MazeElement references and compares
	 * them. The function returns a boolean value of true if two arrays are deep
	 * equal to each other, and false otherwise
	 *
	 * @param a Maze element array called maze1 and maze2
	 */
	public static boolean mazeMatch(MazeElement[][] maze1, MazeElement[][] maze2) {
		if (maze1.length != maze2.length || maze1[0].length != maze2[0].length) {
			return false;
		}
		for (int i = 0; i < maze1.length; i++) {
			for (int j = 0; j < maze1[0].length; j++) {
				if (!maze1[i][j].getSymbol().equals(maze2[i][j].getSymbol())) {
					return false;
				}
			}
		}
		return true;
	}
}
