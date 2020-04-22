package pl.pawilojc.domain;

public class Rook extends Piece {

	public Rook(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getSymbol() {
		return (getColor() == Color.WHITE) ? "♖" : "♜";
	}

}
