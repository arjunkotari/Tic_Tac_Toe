package Tic_Tac_Toe;

public class TicTacToe {
	
	/*
	 * creating array with size 10 
	 */
	public static char[] board=new char[10];
	public static char playerMove;
	/*
	 * Creating CreateBoard method
	 */
	public static char[] createBoard()
	{		
		for(int i=1; i<board.length; i++) {
			board[i]=' ';
		}
		return board;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Tic Tac Toe Game...");
		/*
		 * calling createBoard method() in main method()
		 */
		char[] board = createBoard();
		//Displaying board
		showBoard();
		//This method can allow the user to insert character
		allowPlayer();
		
	}
	/*
	 * Creating method to allow player to input X or O
	 */
	public static char allowPlayer() {
		System.out.println("Please enter X or O");
		char playerMove = Utility.getUserChar();

		return playerMove;
	}
	/*
	 * creating method to display Tic Tac Toe board
	 */
	public static void showBoard() {
	char[][] gameBoard= {{' ','|',' ','|',' '},
			{'-','+','-','+','-'},
			{' ','|',' ','|',' '},
			{'-','+','-','+','-'},
			{' ','|',' ','|',' '}};
	for(char[] row:gameBoard) {
		for(char display:row) {
			System.out.print(display);
		}
		System.out.println();				
	}		
}
}
