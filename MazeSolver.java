public class MazeSolver {
	
	    private static Displayer displayer;
		
		public static void setSize(int length){
			displayer = new Displayer(length);
		}
		
		private static void display(Maze maze){
			displayer.atTopOfWindow("Current Maze" + System.lineSeparator() + maze);
		}
	
	public static boolean solver(Maze maze){
		
		display(maze);
		
		if (maze.explorerIsOnA() == Maze.WALL){
			return false;
		}
		else if (maze.explorerIsOnA() == Maze.TREASURE){
			return true;
		}

		maze.dropA(Maze.WALL);
		
		Maze nMaze = new Maze(maze);
		Maze sMaze = new Maze(maze);
		Maze eMaze = new Maze(maze);
		Maze wMaze = new Maze(maze);

		nMaze.go(Maze.NORTH);
		sMaze.go(Maze.SOUTH);
		eMaze.go(Maze.EAST);
		wMaze.go(Maze.WEST);

		return solver(nMaze) || 
		       solver(sMaze) || 
		       solver(eMaze) || 
		       solver(wMaze);
	}
}

