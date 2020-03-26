package pl.pawilojc.domain;

public class Bishop extends Piece {

	public Bishop(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	String getSymbol() {
		if (getColor() == Color.WHITE) {
			return "♗";
		}
		return "♝";
	}

}
