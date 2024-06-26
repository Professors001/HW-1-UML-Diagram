import java.util.ArrayList;

public class MGame {
    private int roundCount;
    private ArrayList<Dice> dices;
    private Board board;
    private ArrayList<Player> players;

    public MGame(int pNumber, int mapSize) {

        board = new Board(mapSize);
        roundCount = 0;
        dices = new ArrayList<Dice>();
        players = new ArrayList<Player>();

        for (int i = 0; i < 2; i++) {
            dices.add(new Dice());
        }
        for (int i = 1; i <= pNumber; i++) {
            Player player = new Player("Player " + i, new Piece(board.getSquare()));
            players.add(player);
        }
    }

    public void playGame() {
        while(isNotOver()) {
            System.out.println("Turn " + roundCount + ":");
            playRound();
            System.out.println("===========================");
        }
    }

    private void playRound() {
        roundCount++;
        for(Player p: players) {
            p.takeTurn(dices, board);
        }
    }

    private boolean isNotOver() {
        for(Player p: players) {
            if(p.getPiece().getLocation() == board.getFinalSquare()) {
                System.out.println("Game is Over At Turn : " + roundCount);
                System.out.println(p.getName() + " is The Winner");
                return false;
            };
        }
        return true;
    }
}
//6510451085 Aphisit Prasertvesyakorn