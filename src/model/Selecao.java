package model;

public class Selecao {
    private String nome;
    private char grupo;
    private String codigoFIFA;

    public Selecao(String nome, char grupo, String codigoFIFA) {
        this.nome = nome;
        this.grupo = grupo;
        this.codigoFIFA = codigoFIFA;
    }

    public String getNome() {
        return nome;
    }

    public char getGrupo() {
        return grupo;
    }

    public String getCodigoFIFA() {
        return codigoFIFA;
    }

    @Override
    public String toString() {
        return nome + " - Grupo " + grupo + " (" + codigoFIFA + ")";
    }
}
