package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;	
	
	// CONSTRUCTORS ////////////////////////
	
	public Piece(Board board) {
		this.board = board;
	}
	
	protected Board getBoard() {
		return board;
	}

	// METHODS ////////////////////////////////////
	
	public abstract boolean possibleMoves();
	
	public boolean possibleMove(Position position) {
		
	}
	
	public boolean isThereAnyPossibleMove() {
		
	}
}
