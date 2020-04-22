package pl.pawilojc.domain;

public class Bishop extends Piece {

	public Bishop(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getSymbol() {
		return (getColor() == Color.WHITE) ? "♗" : "♝";
	}

}
