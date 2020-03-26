package pl.pawilojc.domain;

public class Board {

	/*
	 * 8 ♜ ♞ ♝ ♛ ♚ ♝ ♞ ♜
	 * 7 ♟ ♟ ♟ ♟ ♟ ♟ ♟ ♟
	 * 6
	 * 5
	 * 4
	 * 3
	 * 2 ♙ ♙ ♙ ♙ ♙ ♙ ♙ ♙
	 * 1 ♖ ♘ ♗ ♕ ♔ ♗ ♘ ♖
	 * 0 a b c d e f g h
	 */

	private Square[][] squares;

	public Board() {
		super();
		this.squares = new Square[8][8];
		initializeSquares(Color.WHITE);
		initializeSquares(Color.BLACK);
	}

	boolean initializeSquares(Color color) {
		int i = 0;
		int j = 0;
		if (color == Color.WHITE) {
			i = 7;
			j = 6;
		} else {
			i = 0;
			j = 1;
		}
		squares[i][0] = new Square(new Rook(color));
		squares[i][1] = new Square(new Knight(color));
		squares[i][2] = new Square(new Bishop(color));
		squares[i][3] = new Square(new Queen(color));
		squares[i][4] = new Square(new King(color));
		squares[i][5] = new Square(new Bishop(color));
		squares[i][6] = new Square(new Knight(color));
		squares[i][7] = new Square(new Rook(color));
		for (int k = 0; k < squares[j].length; k++) {
			squares[j][k] = new Square(new Pawn(color));
		}
		return true;
	}

}
