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
}