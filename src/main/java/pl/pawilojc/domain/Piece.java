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
		if (getColor() == Color.WHITE)
			return "□";
		else
			return "■";

	}

	String getSymbol() {
		return getLetterSymbol() + getColorSymbol();
	}

	public Color getColor() {
		return color;
	}

}
