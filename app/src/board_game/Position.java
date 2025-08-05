package board_game;

public class Position {
    private int linhas;
    private int colunas;

    public Position(){}

    public Position(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    @Override
    public String toString(){
        return linhas + ", " + colunas;
    }
}
