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
	}
}
