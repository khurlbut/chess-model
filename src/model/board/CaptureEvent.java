package model.board;

import static model.enums.GameEventType.CAPTURE;
import model.enums.GameEventType;
import model.exceptions.ConstructorArgsExcetpion;
import model.piece.Piece;

public class CaptureEvent implements GameEvent {

    private Square source;
    private Square target;
    private Piece capturedPiece;

    public CaptureEvent(Square source, Square target, Piece capturedPiece) {
        if (source == null || target == null || capturedPiece == null) {
            throw new ConstructorArgsExcetpion("Constructor does not allow null(s)!");
        }
        this.source = source;
        this.target = target;
        this.capturedPiece = capturedPiece;
    }

    @Override
    public Square target() {
        return target;
    }

    @Override
    public Square source() {
        return source;
    }

    @Override
    public ChessBoard playEvent(ChessBoard chessBoard) {
        return chessBoard.capture(this);
    }

    public Piece capturedPiece() {
        return capturedPiece;
    }

    @Override
    public String toString() {
        return source + " x " + target;
    }

    @Override
    public GameEventType type() {
        return CAPTURE;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((capturedPiece == null) ? 0 : capturedPiece.hashCode());
        result = prime * result + ((source == null) ? 0 : source.hashCode());
        result = prime * result + ((target == null) ? 0 : target.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CaptureEvent other = (CaptureEvent) obj;
        if (capturedPiece == null) {
            if (other.capturedPiece != null)
                return false;
        } else if (!capturedPiece.equals(other.capturedPiece))
            return false;
        if (source == null) {
            if (other.source != null)
                return false;
        } else if (!source.equals(other.source))
            return false;
        if (target == null) {
            if (other.target != null)
                return false;
        } else if (!target.equals(other.target))
            return false;
        return true;
    }

}
