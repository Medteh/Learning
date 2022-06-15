package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] chessBoard1 = {{ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.KING_BLACK, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK},
                {ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.KING_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY},
                {ChessPiece.QUEEN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_BLACK, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.QUEEN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE},
                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.KING_WHITE, ChessPiece.EMPTY}
                };

        ChessPiece[][] chessBoard2 = new ChessPiece[ChessBoard.HORIZONTAL][ChessBoard.VERTICAL];
        chessBoard2[0][0] = ChessPiece.ROOK_BLACK;
        chessBoard2[0][5] = ChessPiece.ROOK_BLACK;
        chessBoard2[0][6] = ChessPiece.KING_BLACK;
        chessBoard2[1][1] = ChessPiece.ROOK_WHITE;
        chessBoard2[1][4] = ChessPiece.PAWN_BLACK;
        chessBoard2[1][5] = ChessPiece.PAWN_BLACK;
        chessBoard2[1][7] = ChessPiece.PAWN_BLACK;
        chessBoard2[2][0] = ChessPiece.PAWN_BLACK;
        chessBoard2[2][2] = ChessPiece.KING_BLACK;
        chessBoard2[2][6] = ChessPiece.PAWN_BLACK;
        chessBoard2[3][0] = ChessPiece.QUEEN_BLACK;
        chessBoard2[3][3] = ChessPiece.BISHOP_WHITE;
        chessBoard2[4][3] = ChessPiece.BISHOP_BLACK;
        chessBoard2[4][4] = ChessPiece.PAWN_WHITE;
        chessBoard2[5][4] = ChessPiece.BISHOP_WHITE;
        chessBoard2[5][5] = ChessPiece.PAWN_WHITE;
        chessBoard2[6][0] = ChessPiece.PAWN_WHITE;
        chessBoard2[6][3] = ChessPiece.QUEEN_WHITE;
        chessBoard2[6][5] = ChessPiece.PAWN_WHITE;
        chessBoard2[6][7] = ChessPiece.PAWN_WHITE;
        chessBoard2[7][5] = ChessPiece.ROOK_WHITE;
        chessBoard2[7][6] = ChessPiece.KING_WHITE;

        for (int i=0; i < ChessBoard.HORIZONTAL; i++) {
            for (int j = 0; j < ChessBoard.VERTICAL; j++) {
                if (chessBoard2[i][j] == null) chessBoard2[i][j] = ChessPiece.EMPTY;
            }
        }

        ChessBoard.print(chessBoard1);
        System.out.println();
        System.out.println();
        ChessBoard.print(chessBoard2);
    }
}

