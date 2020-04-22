package pl.pawilojc.domain;

public class Knight extends Piece {

	public Knight(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getLetterSymbol() {
		return "N";
	}

	@Override
	String getSymbol() {
		return (getColor() == Color.WHITE) ? "♘" : "♞";
	}

}
