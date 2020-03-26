package pl.pawilojc.domain;

public class King extends Piece {

	public King(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	String getSymbol() {
		if (getColor() == Color.WHITE) {
			return "♔";
		}
		return "♚";
	}

}
