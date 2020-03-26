package pl.pawilojc.domain;

public class Rook extends Piece {

	public Rook(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	String getSymbol() {
		if (getColor() == Color.WHITE) {
			return "♖";
		}
		return "♜";
	}

}
