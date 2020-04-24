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
					squares[i][j] = new Square(null, i, j);
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
			squares[piecesRank][0] = new Square(new Rook(color), piecesRank, 0);
			squares[piecesRank][1] = new Square(new Knight(color), piecesRank, 1);
			squares[piecesRank][2] = new Square(new Bishop(color), piecesRank, 2);
			squares[piecesRank][3] = new Square(new Queen(color), piecesRank, 3);
			squares[piecesRank][4] = new Square(new King(color), piecesRank, 4);
			squares[piecesRank][5] = new Square(new Bishop(color), piecesRank, 5);
			squares[piecesRank][6] = new Square(new Knight(color), piecesRank, 6);
			squares[piecesRank][7] = new Square(new Rook(color), piecesRank, 7);
			for (int k = 0; k < squares[pawnsRank].length; k++) {
				squares[pawnsRank][k] = new Square(new Pawn(color), pawnsRank, k);
			}
		}
	}

	void printToSystemOut() {
		for (Square[] ranks : squares) {
			for (Square square : ranks) {
				System.out.print(square.toString() + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

	boolean movePiece(int startRank, int startFile, int destinationRank, int destinationFile) {
		Square start = squares[startRank][startFile];
		Square destination = squares[destinationRank][destinationFile];
		if (start.getPiece() == null)
			return false;
		if (start.getPiece().isValidMove(start, destination, squares)) {
			destination.setPiece(start.getPiece());
			start.setPiece(null);
			return true;
		}
		return false;
	}

	public Square[][] getSquares() {
		return squares;
	}

	public void printValidMovesFromStart(int startRank, int startFile) {
		Square start = squares[startRank][startFile];
		for (Square[] ranks : squares) {
			for (Square square : ranks) {
				if (start.equals(square)) {
					System.out.print(square.toString() + " ");
				} else {
					if (start.getPiece().isValidMove(start, square, squares)) {
						System.out.print("⚽ ");
					} else {
						System.out.print("⚾ ");
					}
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
