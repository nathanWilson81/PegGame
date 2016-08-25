/**
 * Created by Nathan on 8/24/2016.
 */
public class Driver {


    public static void main(String [] args) {
        Board board = new Board();
        board.initBoard();
        board.setupPegs();
        board.printBoard();
    }
}
