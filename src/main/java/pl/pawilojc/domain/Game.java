package pl.pawilojc.domain;

import java.util.Scanner;

public class Game {

	private Color turn;

	public Game() {
		super();
		this.turn = Color.WHITE;
	}

	public static void main(String[] args) {
		Board board = new Board();
		board.printToSystemOut();
		int startRank = 0;
		int startFile = 0;
		int destinationRank = 0;
		int destinationFile = 0;

		Scanner in = new Scanner(System.in);

		do {
			System.out.println("move: ");

			startRank = in.nextInt();
			startFile = in.nextInt();

			destinationRank = in.nextInt();
			destinationFile = in.nextInt();
			board.movePiece(startRank, startFile, destinationRank, destinationFile);
			board.printToSystemOut();
		} while (startRank != -1);

		in.close();

	}

}
