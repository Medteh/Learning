package day17;

import java.util.Arrays;

public class ChessBoard {
    final int HORIZONTAL = 8;
    final int VERTICAL = 8;
    private ChessPiece[][] chessboard = new ChessPiece[HORIZONTAL][VERTICAL];

    public ChessBoard(ChessPiece[][] chessboard) {
        this.chessboard = chessboard;
    }

    void print() {
        for (int i = 0; i< VERTICAL; i++) {
            System.out.println();
            for (int j = 0; j < HORIZONTAL; j++) {
                System.out.print(chessboard[i][j].getFogureView());
            }
        }
    }
}
