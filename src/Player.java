import java.util.ArrayList;

public class Player {
    private String name;
    private Piece piece;

    public Player(String name, Piece piece) {
        this.name = name;
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public Piece getPiece() {
        return piece;
    }


    public void takeTurn(ArrayList<Dice> dices, Board board) {
        System.out.println(this.name);
        int fvTot = 0;
        for (Dice dice: dices) {
            dice.roll();
            fvTot += dice.getFaceValue();
        }
        System.out.println("Roll Value : " + fvTot);
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTot);
        piece.setLocation(newLoc);
        System.out.println("Moving from " + oldLoc.getName() + " to " + newLoc.getName());
        System.out.println("-----------------------");
    }
}
//6510451085 Aphisit Prasertvesyakorn