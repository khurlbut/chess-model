package model.board;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.enums.Color;
import model.enums.Column;
import model.enums.Rank;
import model.enums.Row;
import model.piece.Piece;
import model.piece.PieceFactory;

public final class BoardSetter {
    private List<PutEvent> putEvents = new ArrayList<PutEvent>();

    public BoardSetter() {
        putEvents.addAll(Arrays.asList(w_King_e_1, w_Queen_d_1, b_King_e_8, b_Queen_d_8));

        putEvents.addAll(Arrays.asList(w_Bishop_c_1, w_Bishop_f_1, b_Bishop_c_8, b_Bishop_f_8));
        putEvents.addAll(Arrays.asList(w_Knight_b_1, w_Knight_g_1, b_Knight_b_8, b_Knight_g_8));
        putEvents.addAll(Arrays.asList(w_Rook_a_1, w_Rook_h_1, b_Rook_a_8, b_Rook_h_8));

        putEvents.addAll(Arrays.asList(w_Pawn_a_2, w_Pawn_b_2, w_Pawn_c_2, w_Pawn_d_2));
        putEvents.addAll(Arrays.asList(w_Pawn_e_2, w_Pawn_f_2, w_Pawn_g_2, w_Pawn_h_2));
        putEvents.addAll(Arrays.asList(b_Pawn_a_7, b_Pawn_b_7, b_Pawn_c_7, b_Pawn_d_7));
        putEvents.addAll(Arrays.asList(b_Pawn_e_7, b_Pawn_f_7, b_Pawn_g_7, b_Pawn_h_7));
    }

    public ChessBoard setBoard() {
        ChessBoard board = new ChessBoard();

        for (PutEvent put : putEvents) {
            board = board.playEvent(put);
        }

        return board;
    }

    private PutEvent b_King_e_8 = new PutEvent(newPiece(Rank.King, Color.BLACK, newSquare(Column.E, Row.R8)));
    private PutEvent w_King_e_1 = new PutEvent(newPiece(Rank.King, Color.WHITE, newSquare(Column.E, Row.R1)));
    private PutEvent b_Queen_d_8 = new PutEvent(newPiece(Rank.Queen, Color.BLACK, newSquare(Column.D, Row.R8)));
    private PutEvent w_Queen_d_1 = new PutEvent(newPiece(Rank.Queen, Color.WHITE, newSquare(Column.D, Row.R1)));

    private PutEvent b_Bishop_c_8 = new PutEvent(newPiece(Rank.Bishop, Color.BLACK, newSquare(Column.C, Row.R8)));
    private PutEvent b_Bishop_f_8 = new PutEvent(newPiece(Rank.Bishop, Color.BLACK, newSquare(Column.F, Row.R8)));
    private PutEvent w_Bishop_c_1 = new PutEvent(newPiece(Rank.Bishop, Color.WHITE, newSquare(Column.C, Row.R1)));
    private PutEvent w_Bishop_f_1 = new PutEvent(newPiece(Rank.Bishop, Color.WHITE, newSquare(Column.F, Row.R1)));

    private PutEvent b_Knight_b_8 = new PutEvent(newPiece(Rank.Knight, Color.BLACK, newSquare(Column.B, Row.R8)));
    private PutEvent b_Knight_g_8 = new PutEvent(newPiece(Rank.Knight, Color.BLACK, newSquare(Column.G, Row.R8)));
    private PutEvent w_Knight_b_1 = new PutEvent(newPiece(Rank.Knight, Color.WHITE, newSquare(Column.B, Row.R1)));
    private PutEvent w_Knight_g_1 = new PutEvent(newPiece(Rank.Knight, Color.WHITE, newSquare(Column.G, Row.R1)));

    private PutEvent b_Rook_a_8 = new PutEvent(newPiece(Rank.Rook, Color.BLACK, newSquare(Column.A, Row.R8)));
    private PutEvent b_Rook_h_8 = new PutEvent(newPiece(Rank.Rook, Color.BLACK, newSquare(Column.H, Row.R8)));
    private PutEvent w_Rook_a_1 = new PutEvent(newPiece(Rank.Rook, Color.WHITE, newSquare(Column.A, Row.R1)));
    private PutEvent w_Rook_h_1 = new PutEvent(newPiece(Rank.Rook, Color.WHITE, newSquare(Column.H, Row.R1)));

    private PutEvent b_Pawn_a_7 = new PutEvent(newPiece(Rank.Pawn, Color.BLACK, newSquare(Column.A, Row.R7)));
    private PutEvent b_Pawn_b_7 = new PutEvent(newPiece(Rank.Pawn, Color.BLACK, newSquare(Column.B, Row.R7)));
    private PutEvent b_Pawn_c_7 = new PutEvent(newPiece(Rank.Pawn, Color.BLACK, newSquare(Column.C, Row.R7)));
    private PutEvent b_Pawn_d_7 = new PutEvent(newPiece(Rank.Pawn, Color.BLACK, newSquare(Column.D, Row.R7)));
    private PutEvent b_Pawn_e_7 = new PutEvent(newPiece(Rank.Pawn, Color.BLACK, newSquare(Column.E, Row.R7)));
    private PutEvent b_Pawn_f_7 = new PutEvent(newPiece(Rank.Pawn, Color.BLACK, newSquare(Column.F, Row.R7)));
    private PutEvent b_Pawn_g_7 = new PutEvent(newPiece(Rank.Pawn, Color.BLACK, newSquare(Column.G, Row.R7)));
    private PutEvent b_Pawn_h_7 = new PutEvent(newPiece(Rank.Pawn, Color.BLACK, newSquare(Column.H, Row.R7)));

    private PutEvent w_Pawn_a_2 = new PutEvent(newPiece(Rank.Pawn, Color.WHITE, newSquare(Column.A, Row.R2)));
    private PutEvent w_Pawn_b_2 = new PutEvent(newPiece(Rank.Pawn, Color.WHITE, newSquare(Column.B, Row.R2)));
    private PutEvent w_Pawn_c_2 = new PutEvent(newPiece(Rank.Pawn, Color.WHITE, newSquare(Column.C, Row.R2)));
    private PutEvent w_Pawn_d_2 = new PutEvent(newPiece(Rank.Pawn, Color.WHITE, newSquare(Column.D, Row.R2)));
    private PutEvent w_Pawn_e_2 = new PutEvent(newPiece(Rank.Pawn, Color.WHITE, newSquare(Column.E, Row.R2)));
    private PutEvent w_Pawn_f_2 = new PutEvent(newPiece(Rank.Pawn, Color.WHITE, newSquare(Column.F, Row.R2)));
    private PutEvent w_Pawn_g_2 = new PutEvent(newPiece(Rank.Pawn, Color.WHITE, newSquare(Column.G, Row.R2)));
    private PutEvent w_Pawn_h_2 = new PutEvent(newPiece(Rank.Pawn, Color.WHITE));

    private Piece newPiece(Rank rank, Color color) {
        return PieceFactory.newPiece(rank, color, newSquare(Column.H, Row.R2));
    }

    private Piece newPiece(Rank rank, Color color, Square homeSquare) {

        return PieceFactory.newPiece(rank, color, homeSquare);

        // return new Piece(rank, col, homeSquare);
    }

    private Square newSquare(Column col, Row row) {
        return new Square(col, row);
    }

}
