package chess_pieces;

import board_game.Board;
import chess.ChessPiece;
import chess.Color;

public class Rei extends ChessPiece{

    public Rei(Board tabuleiro, Color cololr) {
        super(tabuleiro, cololr);
    }
    
    @Override
    public String toString(){
        return "R";
    }
}
