package pl.pawilojc.domain;

public class Square {

	private Piece piece;
	private int file;
	private int rank;

	public Square(Piece piece, int file, int rank) {
		super();
		this.piece = piece;
		this.file = file;
		this.rank = rank;
	}

	public String toString() {
		if (piece == null)
			return "";
		return piece.getSymbol();
	}

	public int getFile() {
		return file;
	}

	public int getRank() {
		return rank;
	}

}
