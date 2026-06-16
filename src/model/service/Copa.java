package model.service;

import java.util.ArrayList;
import java.util.List;

import model.Partida;
import model.Selecao;


public class Copa {

    private List<Selecao> selecoes;
    private List<Partida> partidas;
    private List<String> artilheiros;

    public Copa() {
        selecoes = new ArrayList<>();
        partidas = new ArrayList<>();
        artilheiros = new ArrayList<>();
    }

    public void adicionarSelecao(Selecao selecao) {
        selecoes.add(selecao);
    }

    public void registrarPartida(Partida partida) {
        partidas.add(partida);
    }

    public List<Selecao> listarGrupo(char grupo) {
        List<Selecao> grupoSelecoes = new ArrayList<>();

        for (Selecao s : selecoes) {
            if (s.getGrupo() == grupo) {
                grupoSelecoes.add(s);
            }
        }

        return grupoSelecoes;
    }
    public List<Selecao> calcularClassificacao(char grupo) {
    List<Selecao> classificacao = listarGrupo(grupo);

    classificacao.sort((s1, s2) ->
        Integer.compare(calcularPontos(s2), calcularPontos(s1))
    );

    return classificacao;
}

private int calcularPontos(Selecao selecao) {
    int pontos = 0;

    for (Partida p : partidas) {

        if (p.getMandante().equals(selecao)) {
            if (p.getGolsA() > p.getGolsB()) {
                pontos += 3;
            } else if (p.getGolsA() == p.getGolsB()) {
                pontos += 1;
            }
        }

        if (p.getVisitante().equals(selecao)) {
            if (p.getGolsB() > p.getGolsA()) {
                pontos += 3;
            } else if (p.getGolsA() == p.getGolsB()) {
                pontos += 1;
            }
        }
    }

    return pontos;
}
}