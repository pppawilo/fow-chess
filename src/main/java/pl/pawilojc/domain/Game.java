package pl.pawilojc.domain;

public class Game {

	private Color turn;

	public Game() {
		super();
		this.turn = Color.WHITE;
	}

	public static void main(String[] args) {
		Board board = new Board();
		board.printToSystemOut();
		int startFile = 0;
		int startRank = 0;
		int destinationFile = 3;
		int destinationRank = 0;
		board.movePiece(startFile, startRank, destinationFile, destinationRank);
		board.printToSystemOut();

		startFile = 0;
		startRank = 0;
		destinationFile = 4;
		destinationRank = 0;
		board.movePiece(startFile, startRank, destinationFile, destinationRank);
		board.printToSystemOut();

		startFile = 0;
		startRank = 1;
		destinationFile = 0;
		destinationRank = 2;
		board.movePiece(startFile, startRank, destinationFile, destinationRank);
		board.printToSystemOut();

		startFile = 0;
		startRank = 1;
		destinationFile = 0;
		destinationRank = 1;
		board.movePiece(startFile, startRank, destinationFile, destinationRank);
		board.printToSystemOut();

	}

}
