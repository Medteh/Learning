package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessBoard chessBoard1 = new ChessBoard();

        chessBoard1.setChessBoard (0,0, ChessPiece.ROOK_BLACK);
        chessBoard1.setChessBoard (0, 5, ChessPiece.ROOK_BLACK);
        chessBoard1.setChessBoard (0,6, ChessPiece.KING_BLACK);
        chessBoard1.setChessBoard (1,1, ChessPiece.ROOK_WHITE);
        chessBoard1.setChessBoard (1,4, ChessPiece.PAWN_BLACK);
        chessBoard1.setChessBoard (1,5, ChessPiece.PAWN_BLACK);
        chessBoard1.setChessBoard (1,7, ChessPiece.PAWN_BLACK);
        chessBoard1.setChessBoard (2,0, ChessPiece.PAWN_BLACK);
        chessBoard1.setChessBoard (2,2, ChessPiece.KING_BLACK);
        chessBoard1.setChessBoard (2,6, ChessPiece.PAWN_BLACK);
        chessBoard1.setChessBoard (3,0, ChessPiece.QUEEN_BLACK);
        chessBoard1.setChessBoard (3,3, ChessPiece.BISHOP_WHITE);
        chessBoard1.setChessBoard (4,3, ChessPiece.BISHOP_BLACK);
        chessBoard1.setChessBoard (4,4, ChessPiece.PAWN_WHITE);
        chessBoard1.setChessBoard (5,4, ChessPiece.BISHOP_WHITE);
        chessBoard1.setChessBoard (5,5, ChessPiece.PAWN_WHITE);
        chessBoard1.setChessBoard (6,0, ChessPiece.PAWN_WHITE);
        chessBoard1.setChessBoard (6,3, ChessPiece.QUEEN_WHITE);
        chessBoard1.setChessBoard (6,5, ChessPiece.PAWN_WHITE);
        chessBoard1.setChessBoard (6,7, ChessPiece.PAWN_WHITE);
        chessBoard1.setChessBoard (7,5, ChessPiece.ROOK_WHITE);
        chessBoard1.setChessBoard (7,6, ChessPiece.KING_WHITE);

        chessBoard1.print();
    }
}

