package util;

import service.Copa;
import model.Selecao;
import model.Partida;

public class CargaInicial {

    public void popularCopa(Copa copa) {
        // As seleções
        Selecao s1 = new Selecao("Brasil", 'A', "BRA");
        Selecao s2 = new Selecao("Franca", 'A', "FRA");
        Selecao s3 = new Selecao("Japao", 'A', "JPN");
        Selecao s4 = new Selecao("Senegal", 'A', "SEN");

        Selecao s5 = new Selecao("Argentina", 'B', "ARG");
        Selecao s6 = new Selecao("Inglaterra", 'B', "ENG");
        Selecao s7 = new Selecao("Marrocos", 'B', "MAR");
        Selecao s8 = new Selecao("Australia", 'B', "AUS");

        copa.adicionarSelecao(s1);
        copa.adicionarSelecao(s2);
        copa.adicionarSelecao(s3);
        copa.adicionarSelecao(s4);
        copa.adicionarSelecao(s5);
        copa.adicionarSelecao(s6);
        copa.adicionarSelecao(s7);
        copa.adicionarSelecao(s8);

        // Partidas de exemplo:
        Partida p1 = new Partida(s1, s2, 2, 1); // Brasil 2 x 1 França
        Partida p2 = new Partida(s3, s4, 0, 0); // Japão 0 x 0 Senegal
        Partida p3 = new Partida(s5, s6, 1, 3); // Argentina 1 x 3 Inglaterra
        Partida p4 = new Partida(s7, s8, 2, 0); // Marrocos 2 x 0 Austrália

        copa.registrarPartida(p1);
        copa.registrarPartida(p2);
        copa.registrarPartida(p3);
        copa.registrarPartida(p4);
    }
}