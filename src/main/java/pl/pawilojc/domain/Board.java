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

	void initializeSquares(Color color) {
		int piecesRank = -1;
		int pawnsRank = -1;
		if (color == null) {
			for (int i = 0; i < squares.length; i++) {
				for (int j = 0; j < squares[i].length; j++) {
					squares[i][j] = new Square(null);
				}
			}
		} else {
			if (color == Color.WHITE) {
				piecesRank = 7;
				pawnsRank = 6;
			} else if (color == Color.BLACK) {
				piecesRank = 0;
				pawnsRank = 1;
			}
			squares[piecesRank][0] = new Square(new Rook(color));
			squares[piecesRank][1] = new Square(new Knight(color));
			squares[piecesRank][2] = new Square(new Bishop(color));
			squares[piecesRank][3] = new Square(new Queen(color));
			squares[piecesRank][4] = new Square(new King(color));
			squares[piecesRank][5] = new Square(new Bishop(color));
			squares[piecesRank][6] = new Square(new Knight(color));
			squares[piecesRank][7] = new Square(new Rook(color));
			for (int k = 0; k < squares[pawnsRank].length; k++) {
				squares[pawnsRank][k] = new Square(new Pawn(color));
			}
		}
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
