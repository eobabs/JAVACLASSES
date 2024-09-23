import java.util.*;

public class TicTacToe {

	public static void main(String[] args) {

	char[][] board = {{'X', 'O', 'X'}, {'O', 'O', 'O'}, {'X', 'O', 'X'}};
	

	for (int row = 0; row < board.length; row++){
	for (int column = 0; column < board[row].length; column++) 
		System.out.printf("%5c", board[row][column]);

	System.out.println();
 	}

		

	}

}