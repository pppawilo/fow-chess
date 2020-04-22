package pl.pawilojc.domain;

public class King extends Piece {
	private boolean castlingDone;

	public King(Color color) {
		super(color);
		castlingDone = false;
		// TODO Auto-generated constructor stub
	}

	String getSymbol() {
		return (getColor() == Color.WHITE) ? "♔" : "♚";
	}

}
