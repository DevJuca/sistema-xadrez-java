package chess;

import board_game.Board;
import board_game.Piece;

public class ChessPiece extends Piece{
    private Color cololr;

    public ChessPiece(Board tabuleiro, Color cololr) {
        super(tabuleiro);
        this.cololr = cololr;
    }

    public Color getCololr() {
        return cololr;
    }
    
    
}
