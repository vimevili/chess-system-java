package boardgame;

public class Board {

	private int rows, columns;
	private Piece[][] pieces; 
	
	public Board (int row, int column) {
		this.rows = row;
		this.columns = column;
		pieces = new Piece[row][column];
	}

	// GETTERS AND SETTERS //////////////////
	
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}






	public Piece piece(Position position) {
		
	}
	
	public void placePiece(Piece piece, Position position) {
		
	}
	
	public Piece removePiece(Position position) {
		
	}
	
	public boolean positionExists(Position position) {
		
	}
	
	public boolean thereIsAPiece(Position position) {
		
	}
}
