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
		if (!super.isValidMove(start, destination)) {
			return false;
		}

		if (((start.getRank() - 1 == destination.getRank()) && start.getPiece().getColor().equals(Color.WHITE))
				|| ((start.getRank() + 1 == destination.getRank())
						&& (start.getPiece().getColor().equals(Color.BLACK)))) {
			if (destination.getPiece() == null) {
				return (start.getFile() == destination.getFile());
			} else if (!start.getPiece().getColor().equals(destination.getPiece().getColor())) {
				return (Math.abs(start.getFile() - destination.getFile()) == 1);
			}
			return false;
		}
		return false;

	}

}
