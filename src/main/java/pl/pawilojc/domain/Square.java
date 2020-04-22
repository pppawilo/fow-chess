package pl.pawilojc.domain;

public class Square {

	private Piece piece;
	private final int rank;
	private final int file;

	public Square(Piece piece, int rank, int file) {
		super();
		this.piece = piece;
		this.rank = rank;
		this.file = file;
	}

	public String toString() {
		if (piece == null)
			return getRank() + "";
		return piece.getSymbol();
	}

	public int getRank() {
		return rank;
	}

	public int getFile() {
		return file;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

}
