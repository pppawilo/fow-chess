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
		if (!super.isValidMove(start, destination))
			return false;

		if (((start.getRank() == destination.getRank() - 1) && start.getPiece().getColor().equals(Color.WHITE))
				|| ((start.getRank() == destination.getRank() + 1)
						&& (start.getPiece().getColor().equals(Color.BLACK)))) {
			if (destination.getPiece() == null) {
				return (start.getFile() == destination.getFile());
			}
			if (!start.getPiece().getColor().equals(destination.getPiece().getColor())) {
				return (Math.abs(start.getFile() - destination.getFile()) != 1);
			}
		}
		return false;

	}

}
