package pl.pawilojc.domain;

public class Queen extends Piece {

	public Queen(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getSymbol() {
		return (getColor() == Color.WHITE) ? "♕" : "♛";
	}

}
