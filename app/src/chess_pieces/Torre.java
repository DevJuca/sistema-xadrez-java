package chess_pieces;

import board_game.Board;
import chess.ChessPiece;
import chess.Color;

public class Torre extends ChessPiece {

    public Torre(Board tabuleiro, Color cololr) {
        super(tabuleiro, cololr);
    }
    
    @Override
    public String toString(){
        return "T";
    }
}
