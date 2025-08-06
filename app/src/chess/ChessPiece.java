package chess;

import board_game.Board;
import board_game.Piece;

public class ChessPiece extends Piece{
    private Color color;

    public ChessPiece(Board tabuleiro, Color color) {
        super(tabuleiro);
        this.color = color;
    }

    public Color getCololr() {
        return color;
    }
    
    
}
