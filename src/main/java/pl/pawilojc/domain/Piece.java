package pl.pawilojc.domain;

public abstract class Piece {

	private Color color;

	public Piece(Color color) {
		super();
		this.color = color;

	}

	String getLetterSymbol() {
		return this.getClass().getSimpleName().substring(0, 1);
	}

	String getColorSymbol() {
		return (getColor() == Color.WHITE) ? "□" : "■";
	}

	String getSymbol() {
		return getLetterSymbol() + getColorSymbol();
	}

	public Color getColor() {
		return color;
	}

	boolean isValidMove(Square start, Square destination, Square[][] squares) {
		if (start.getPiece() == null)
			return false;
		if (start.equals(destination))
			return false;
		if (destination.getPiece() == null)
			return true;
		return !start.getPiece().getColor().equals(destination.getPiece().getColor());

	}
}
