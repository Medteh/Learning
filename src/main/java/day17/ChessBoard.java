package day17;

import java.util.Arrays;

public class ChessBoard {
    static final int HORIZONTAL = 8;
    static final int VERTICAL = 8;

    static void print(ChessPiece[][] chessBoard) {
        for (int i = 0; i< VERTICAL; i++) {
            System.out.println();
            for (int j = 0; j < HORIZONTAL; j++) {
                System.out.print(chessBoard[i][j].getFogureView());
            }
        }
    }
}
