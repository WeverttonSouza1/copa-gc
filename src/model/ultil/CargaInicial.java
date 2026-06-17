package model.ultil;

import model.Partida;
import model.Selecao;
import model.service.Copa;




public class CargaInicial {

    public static Copa carregarDados() {

        Copa copa = new Copa();

      Selecao brasil = new Selecao("Brasil", 'A', "BRA");
Selecao argentina = new Selecao("Argentina", 'A', "ARG");
Selecao franca = new Selecao("França", 'A', "FRA");
Selecao alemanha = new Selecao("Alemanha", 'A', "GER");

Selecao portugal = new Selecao("Portugal", 'B', "POR");
Selecao espanha = new Selecao("Espanha", 'B', "ESP");
Selecao italia = new Selecao("Itália", 'B', "ITA");
Selecao inglaterra = new Selecao("Inglaterra", 'B', "ENG");

        copa.adicionarSelecao(brasil);
        copa.adicionarSelecao(argentina);
        copa.adicionarSelecao(franca);
        copa.adicionarSelecao(alemanha);
        copa.adicionarSelecao(portugal);
        copa.adicionarSelecao(espanha);
        copa.adicionarSelecao(italia);
        copa.adicionarSelecao(inglaterra);

        copa.registrarPartida(new Partida(brasil, argentina, 2, 1));
        copa.registrarPartida(new Partida(franca, alemanha, 1, 1));
        copa.registrarPartida(new Partida(portugal, espanha, 3, 0));
        copa.registrarPartida(new Partida(italia, inglaterra, 2, 2));

        copa.adicionarArtilheiro("Neymar");
        copa.adicionarArtilheiro("Mbappé");
        copa.adicionarArtilheiro("Cristiano Ronaldo");

        return copa;
    }
}