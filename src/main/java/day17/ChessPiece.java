package day17;

public enum ChessPiece {
    KING_WHITE(100, "♔"), KING_BLACK(100, "♚"), QUEEN_WHITE(9, "♕"), QUEEN_BLACK(9, "♛"),
    ROOK_WHITE(5, "♖"), ROOK_BLACK(5, "♜"), BISHOP_WHITE(3.5, "♗"), BISHOP_BLACK(3.5, "♝"),
    KNIGHT_WHITE(3, "♘"), KNIGHT_BLACK(3, "♞"), PAWN_WHITE(1, "♙"), PAWN_BLACK(1, "♟"),
    EMPTY (-1, "_");

    private final double figurePrice;
    private final String figureView;

    ChessPiece(double figurePrice, String figureView) {
        this.figurePrice = figurePrice;
        this.figureView = figureView;
    }

    double getFigurePrice() {
        return figurePrice;
    }

    String getFogureView() {
        return figureView;
    }
}
