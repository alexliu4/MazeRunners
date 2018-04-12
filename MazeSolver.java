public class MazeSolver {
	
	public static boolean solver(Maze maze){
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

