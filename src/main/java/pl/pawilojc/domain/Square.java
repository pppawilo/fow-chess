package pl.pawilojc.domain;

public class Square {

	private Piece piece;

	public Square(Piece piece) {
		super();
		this.piece = piece;
	}

	public String toString() {
		if (piece == null)
			return "";
		return piece.getSymbol();
	}

}
