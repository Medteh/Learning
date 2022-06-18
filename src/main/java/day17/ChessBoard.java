package day17;

import java.util.Arrays;

public class ChessBoard {
    static final int HORIZONTAL = 8;
    static final int VERTICAL = 8;
    private ChessPiece[][] chessBoard = new ChessPiece[HORIZONTAL][VERTICAL];

    public ChessBoard () {
        for (ChessPiece[] chess: chessBoard)
        Arrays.fill(chess, ChessPiece.EMPTY);
    }

    public void setChessBoard(int i, int j, ChessPiece chessPiece) {
        this.chessBoard[i][j] = chessPiece;
    }

     void print() {
        for (int i = 0; i< VERTICAL; i++) {
            for (int j = 0; j < HORIZONTAL; j++) {
                System.out.print(chessBoard[i][j].getFogureView());
            }
            System.out.println();
        }
    }
}
