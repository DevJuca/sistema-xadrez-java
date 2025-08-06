package aplicattion;

import chess.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] pecas){
        for(int i=0; i<pecas.length; i++){
            System.out.print((8-i) + " ");
            for(int j=0; j<pecas.length; j++){
                printPiece(pecas[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    private static void printPiece(ChessPiece pecas){
        if (pecas == null) {
            System.out.print("-");
        }
        else{
            System.out.print(pecas);
        }
        System.out.print(" ");
    }
}
