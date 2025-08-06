package board_game;

public class Board {
    private int linhas;
    private int colunas;
    private Piece[][] pecas;

    public Board(int linhas, int colunas) {
        if (linhas < 1 || colunas < 1) {
            throw new BoardException("Erro ao criar tabuleiro! É necessário ter pelo menos 1 linha e uma coluna");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Piece[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public Piece pecas(int linhas, int colunas){
        if (!positionExists(linhas, colunas)) {
            throw new BoardException("Posição não está no tabuleiro");
        }
        return pecas[linhas][colunas];
    }

    public Piece pecas(Position posicao){
        if (!positionExists(posicao)) {
            throw new BoardException("Posição não está no tabuleiro");
        }
        return pecas[posicao.getLinhas()][posicao.getColunas()];
    }

    public void placePiece(Piece peca, Position posicao){
        if (thereIsAPiece(posicao)) {
            throw new BoardException("Já existe uma peça nessa posição " + posicao);
        }
        pecas[posicao.getLinhas()][posicao.getColunas()] = peca;
        peca.posição = posicao;
    }

    private boolean positionExists(int linhas, int colunas){
        return linhas >= 0 && linhas < linhas && colunas >=0 && colunas < colunas;
    }

    public boolean positionExists(Position posicao){
        return positionExists(posicao.getLinhas(), posicao.getColunas());
    }

    public boolean thereIsAPiece(Position posicao){
        return pecas(posicao) != null;
    }
}
