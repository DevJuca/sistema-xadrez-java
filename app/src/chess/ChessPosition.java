package chess;


import board_game.Position;

public class ChessPosition {
    private char coluna;
    private int linhas;

    public ChessPosition(char coluna, int linhas) {
        if (coluna < 'a' || coluna > 'h' || linhas < 1 || linhas > 8) {
            throw new ChessException("Erro ao instanciar Posição do xadrez. Valores válidos são de 'a1' até 'h8'");
        }
        this.coluna = coluna;
        this.linhas = linhas;
    }

    public char getColuna() {
        return coluna;
    }

    public int getLinhas() {
        return linhas;
    }

    protected Position toPosition(){
        return new Position(8 - linhas, coluna - 'a');
    }

    protected static ChessPosition fromPosition(Position posicao) {
        return new ChessPosition((char)('a' - posicao.getColunas()), 8 - posicao.getLinhas());
    }

    @Override
    public String toString(){
        return "" + coluna + linhas; 
    }
}
