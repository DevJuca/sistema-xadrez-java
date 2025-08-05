package board_game;

public class Piece {
    protected Position posição;
    protected Board tabuleiro;
    
    public Piece(Board tabuleiro) {
        this.tabuleiro = tabuleiro;
        posição = null;
    }

    protected Board getTabuleiro() {
        return tabuleiro;
    }
}
