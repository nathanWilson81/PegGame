import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nathan on 8/24/2016.
 */
public class Board {
    private List<List<BoardEntity>> board = new ArrayList();
    private List<Peg> pegs = new ArrayList<Peg>();

    public void initBoard() {
        for (int i = 0; i < 7; i++) {
            List<BoardEntity> boardEntityList = new ArrayList<BoardEntity>();
            for (int j = 0; j < 11; j++) {
                BoardEntity boardEntity = new BoardEntity(0, i, j);
                boardEntityList.add(boardEntity);
            }
            board.add(boardEntityList);
        }
    }

    public void setupPegs() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0 || i == 6) {
                    break;
                } else if (i == 1) {
                    Peg peg = new Peg(1, i, 5);
                    board.get(i).remove(5);
                    board.get(i).add(5, peg);
                    pegs.add(peg);
                    break;
                } else if (i == 2) {
                    Peg peg = new Peg(1, i, 4);
                    Peg peg1 = new Peg(1, i, 6);
                    board.get(i).remove(4);
                    board.get(i).add(4, peg);
                    board.get(i).remove(6);
                    board.get(i).add(6, peg1);
                    pegs.add(peg);
                    pegs.add(peg1);
                    break;
                } else if (i == 3) {
                    Peg peg = new Peg(1, i, 3);
                    Peg peg1 = new Peg(2, i, 5);
                    Peg peg2 = new Peg(1, i, 7);
                    board.get(i).remove(3);
                    board.get(i).add(3, peg);
                    board.get(i).remove(5);
                    board.get(i).add(5, peg1);
                    board.get(i).remove(7);
                    board.get(i).add(7, peg2);
                    pegs.add(peg);
                    pegs.add(peg1);
                    pegs.add(peg2);
                    break;
                } else if (i == 4) {
                    Peg peg = new Peg(1, i, 2);
                    Peg peg1 = new Peg(1, i, 4);
                    Peg peg2 = new Peg(1, i, 6);
                    Peg peg3 = new Peg(1, i, 8);
                    board.get(i).remove(2);
                    board.get(i).add(2, peg);
                    board.get(i).remove(4);
                    board.get(i).add(4, peg1);
                    board.get(i).remove(6);
                    board.get(i).add(6, peg2);
                    board.get(i).remove(8);
                    board.get(i).add(8, peg3);
                    pegs.add(peg);
                    pegs.add(peg1);
                    pegs.add(peg2);
                    pegs.add(peg3);
                    break;
                } else if (i == 5) {
                    Peg peg = new Peg(1, i, 1);
                    Peg peg1 = new Peg(1, i, 3);
                    Peg peg2 = new Peg(1, i, 5);
                    Peg peg3 = new Peg(1, i, 7);
                    Peg peg4 = new Peg(1, i, 9);
                    board.get(i).remove(1);
                    board.get(i).add(1, peg);
                    board.get(i).remove(3);
                    board.get(i).add(3, peg1);
                    board.get(i).remove(5);
                    board.get(i).add(5, peg2);
                    board.get(i).remove(7);
                    board.get(i).add(7, peg3);
                    board.get(i).remove(9);
                    board.get(i).add(9, peg4);
                    pegs.add(peg);
                    pegs.add(peg1);
                    pegs.add(peg2);
                    pegs.add(peg3);
                    pegs.add(peg4);
                    break;
                }
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < pegs.size(); i++) {
            if (pegs.get(i).getStatus() == 2) {
                System.out.println("Removing peg at X:" + pegs.get(i).getxLocation() + " Y:" + pegs.get(i).getyLocation());
                pegs.remove(i);
            }
        }

        for (List<BoardEntity> list : board) {
            for (BoardEntity boardEntity : list) {
                if (boardEntity.getStatus() == 0) {
                    System.out.print("*");
                } else if (boardEntity.getStatus() == 1) {
                    System.out.print("X");
                } else if (boardEntity.getStatus() == 2) {
                    System.out.print("O");
                }
            }
            System.out.println();
        }

        for (Peg peg : pegs) {
            System.out.println("X:" + peg.getxLocation() + " Y:" + peg.getyLocation());
        }

    }
}


