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

// METHODS ////////////////////////////


	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
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
