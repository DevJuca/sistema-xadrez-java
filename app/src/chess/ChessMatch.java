package chess;

import board_game.Board;
import board_game.Position;
import chess_pieces.Rei;
import chess_pieces.Torre;

public class ChessMatch {
    
    private Board board;

    public ChessMatch(){
        board = new Board(8, 8);
        initiailSetup();
    }

    public ChessPiece[][] getPieces(){
            ChessPiece[][] mat = new ChessPiece[board.getLinhas()][board.getColunas()];
            for(int i=0; i<board.getLinhas(); i++){
                for(int j=0; j<board.getColunas(); j++){
                    mat[i][j] = (ChessPiece) board.pecas(i, j);
                }
            }
            return mat;
    }

    private void placeNewPiece(char coluna, int linha, ChessPiece peca){
        board.placePiece(peca, new ChessPosition(coluna, linha).toPosition());
    }

    private void initiailSetup(){
        placeNewPiece('b', 6, new Torre(board, Color.Branco));
        placeNewPiece('e', 8, new Rei(board, Color.Preto));
        placeNewPiece('e', 1, new Rei(board, Color.Branco));
    }
}
