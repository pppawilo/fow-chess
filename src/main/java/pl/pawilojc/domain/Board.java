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
		int piecesFile = -1;
		int pawnsFile = -1;
		if (color == null) {
			for (int i = 0; i < squares.length; i++) {
				for (int j = 0; j < squares[i].length; j++) {
					squares[i][j] = new Square(null, i, j);
				}
			}
		} else {
			if (color == Color.WHITE) {
				piecesFile = 7;
				pawnsFile = 6;
			} else if (color == Color.BLACK) {
				piecesFile = 0;
				pawnsFile = 1;
			}
			squares[piecesFile][0] = new Square(new Rook(color), piecesFile, 0);
			squares[piecesFile][1] = new Square(new Knight(color), piecesFile, 1);
			squares[piecesFile][2] = new Square(new Bishop(color), piecesFile, 2);
			squares[piecesFile][3] = new Square(new Queen(color), piecesFile, 3);
			squares[piecesFile][4] = new Square(new King(color), piecesFile, 4);
			squares[piecesFile][5] = new Square(new Bishop(color), piecesFile, 5);
			squares[piecesFile][6] = new Square(new Knight(color), piecesFile, 6);
			squares[piecesFile][7] = new Square(new Rook(color), piecesFile, 7);
			for (int k = 0; k < squares[pawnsFile].length; k++) {
				squares[pawnsFile][k] = new Square(new Pawn(color), pawnsFile, k);
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
		for (Square[] files : squares) {
			for (Square square : files) {
				System.out.print(square.getFile() + "" + square.getRank() + " ");
			}
			System.out.println();
		}

	}
}
