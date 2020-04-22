package pl.pawilojc.domain;

public class Knight extends Piece {

	public Knight(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	String getLetterSymbol() {
		return "N";
	}

	String getSymbol() {
		return (getColor() == Color.WHITE) ? "♘" : "♞";
	}

}
