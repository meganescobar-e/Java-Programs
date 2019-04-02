import java.io.*;
import java.util.*;

public class SolveMaze {
	public static void main(String[] args) throws FileNotFoundException {
		String fileText = "";
		Scanner input = new Scanner(new File("maze1.txt"));
		while (input.hasNextLine()) {
			fileText += input.nextLine() + "\n";
		}

		Maze maze = new Maze(fileText);
		maze.setAnimated(true);
		System.out.println(maze);
		System.out.println();

		int startRow = 1;
		int startCol = 6;
		System.out.println("Start from (" + startRow + ", " + startCol + ")");
		solve(maze, startRow, startCol);
	}

	// Finds a pathway out of the given maze from the given start location.
	// Preconditions: maze != null and startRow/Col are within the maze
	public static void solve(Maze maze, int startRow, int startCol) {
		if (explore(maze, startRow, startCol)) {
			System.out.println(maze);
		} else {
			System.out.println("no solution");
		}
	}

    // Private helper that finds a pathway out of the maze from the given start
    // using recursive backtracking.  Marks each square it examines as having
    // been 'explored'.  Returns true if a path out was found, and false if not.
    // If a pathway out is found, marks every step along that path with a '.'.
	private static boolean explore(Maze maze, int row, int col) {
		System.out.println(maze);	// animate
		
		// unproductive path: wall or previously explored
		if (maze.isWall(row, col) || maze.isExplored(row, col)) {
			return false;
		} else if (row == 0 || row == maze.getHeight() - 1 || col == 0
				|| col == maze.getWidth() - 1) {
			// exit has been found
			maze.mark(row, col);
			return true;
		} else {
			maze.setExplored(row, col, true);

			if (explore(maze, row, col - 1) || // left
					explore(maze, row - 1, col) || // up
					explore(maze, row + 1, col) || // down
					explore(maze, row, col + 1)) { // right
				maze.mark(row, col);
				System.out.println(maze);	// animate
				return true;	// location is on the exit path
			}
			// unchoose
		}
		return false;	// not on exit path
	}
}