package pl.pawilojc.domain;

public class Square {

	private Piece piece;
	private final int file;
	private final int rank;

	public Square(Piece piece, int file, int rank) {
		super();
		this.piece = piece;
		this.file = file;
		this.rank = rank;
	}

	public String toString() {
		if (piece == null)
			return getRank() + "";
		return piece.getSymbol();
	}

	public int getFile() {
		return file;
	}

	public int getRank() {
		return rank;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

}
