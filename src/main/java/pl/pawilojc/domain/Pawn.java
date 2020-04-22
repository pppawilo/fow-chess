package pl.pawilojc.domain;

public class Pawn extends Piece {

	public Pawn(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getSymbol() {
		return (getColor() == Color.WHITE) ? "♙" : "♟";
	}

	@Override
	boolean isValidMove(Square start, Square destination) {
		if (super.isValidMove(start, destination) == false)
			return false;
		return true;
	}

}
