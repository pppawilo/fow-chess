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
		initializeSquares(null);
		initializeSquares(Color.WHITE);
		initializeSquares(Color.BLACK);

	}

	boolean initializeSquares(Color color) {
		int i = -1;
		int j = -1;
		if (color == null) {
			for (int m = 0; m < squares.length; m++) {
				for (int n = 0; n < squares[m].length; n++) {
					squares[m][n] = new Square(null);
				}
			}
			return true;
		}
		if (color == Color.WHITE) {
			i = 7;
			j = 6;
		} else if (color == Color.BLACK) {
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

	void printToSystemOut() {

		for (Square[] files : squares) {
			for (Square square : files) {
				System.out.print(square.toString() + " ");
			}
			System.out.println();
		}

	}

}
