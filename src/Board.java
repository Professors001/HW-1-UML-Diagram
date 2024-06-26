import java.util.ArrayList;

public class Board {

    private ArrayList<Square> squares;

    public Board(int size) {
        squares = new ArrayList<Square>();
        for (int i = 0; i <= size; i++) {
            squares.add(new Square(Integer.toString(i)));
        }
    }

    public Square getSquare(Square square, int faceValue) {
        int index = squares.indexOf(square);
        index += faceValue;
        if (index >= squares.size()) {
            index = squares.size() - 1;
        }
        return squares.get(index);
    }

    public Square getSquare() {
        return squares.getFirst();
    }

    public Square getFinalSquare() {
        return squares.getLast();
    }
}
//6510451085 Aphisit Prasertvesyakorn